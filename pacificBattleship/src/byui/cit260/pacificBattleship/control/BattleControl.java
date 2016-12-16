/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.control;

import byui.cit260.pacificBattleship.exceptions.BattleControlException;
import byui.cit260.pacificBattleship.model.Base;
import byui.cit260.pacificBattleship.model.Location;
import byui.cit260.pacificBattleship.model.Ship;
import byui.cit260.pacificBattleship.model.ShipList;
import byui.cit260.pacificBattleship.model.Upgrade;
import byui.cit260.pacificBattleship.view.ErrorView;
import byui.cit260.pacificBattleship.view.View;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import pacificbattleship.PacificBattleship;

/**
 *
 * @author ort09
 */
public class BattleControl {

    public static String attackUnit(Ship uShip, Ship eShip, Upgrade uShipUpgradeAttack, Upgrade uShipUpgradeSpecial)
                    throws BattleControlException{
        
        String message = "";
        
        int upgradeAttack = uShipUpgradeAttack.getCurrentAllocation();
        int upgradeSpecial = uShipUpgradeAttack.getCurrentAllocation();
        String shipType = uShipUpgradeSpecial.getShipType();
        
        boolean hit = hitOrMiss(uShip);
        int atkPower = 0;
        if(hit){
            
            try{  
                atkPower = CalTotalAttackPower(uShip, upgradeAttack, upgradeSpecial, shipType);
            } catch (BattleControlException me) {
                ErrorView.display("Battle Control", me.getMessage());
            }
            
            int atkBonus = calculateAttackBonus(atkPower, uShip, eShip);
            
            int shipRemainingHull = shipRemainingHull(atkBonus, eShip);
            
            eShip.setHull(shipRemainingHull);
            
            if(shipRemainingHull == 0)
                message = BattleControl.sunkShip(eShip);
            else
                message = "You hit " + eShip.getShipName() + " for " + atkBonus;
        }
        else
            message = "You missed!";
        
        
        
        
        return message;
    }
    
    public static int shipRemainingHull(int damage, Ship eShip)
                throws BattleControlException{
    
        if(eShip == null)
            throw new BattleControlException("There is no enemy ship to calculate");
        
        
        int oldHull = eShip.getHull();
        int defense = eShip.getDefense();
        
        if(damage - defense < 0)
            return oldHull;
        
        int newHull = oldHull - (damage - defense);
        
        if(newHull < 0)
            return 0;
        
        return newHull;
    }
    
    /* NATHAN ---- TotalAttack */
   
    public static int CalTotalAttackPower(Ship uShip,int uShipUpgradeAttack, int uShipUpgradeSpecial, String uShipType)
                throws BattleControlException{
        
        int attack = uShip.getAttack();
        int upgradeCurrentLevel = uShipUpgradeAttack;
   
        if(upgradeCurrentLevel < 0 || upgradeCurrentLevel > 5){
            throw new BattleControlException("Upgrade is not within bounds");
        }
        
        if(uShipType.equals("Destroyer")) {
            
            int level = uShipUpgradeSpecial;
            Integer atk = attack;
            Integer upgrdCrrntLvl = upgradeCurrentLevel;
            Double power;
            
            switch(level){
                case 1:
                    power = 1.5;
                    break;
                case 2:
                    power = 2.0;
                    break;
                case 3:
                    power = 2.5;
                    break;
                case 4:
                    power = 2.75;
                    break;
                case 5:
                    power = 3.0;
                    break;
                default:
                    power = 1.0;
            }
            Double attackWithBonus = (atk.doubleValue() + upgrdCrrntLvl.doubleValue()) * power;
            return attackWithBonus.intValue();
        }
        
        return attack + upgradeCurrentLevel;
    }

   
    
    /* Calculate whether or not the attack will hit */
    
    public static boolean hitOrMiss(Ship uShip){
        Random rn = new Random();
        
        int hitMissRatio = rn.nextInt(100) + 1;
        
        if (uShip.getAccuracy() + hitMissRatio < 100){
            return false;
        }
        else
            return true;
        
        }

    
    public static int calculateAttackBonus(int totalAttack, Ship uShip, Ship eShip){
	
	if(uShip == null) {
		return -1;
	}
	if(eShip == null) {
		return -2;
	}

	double attack = totalAttack * 2;
        

	if (uShip.getType().equals("Destroyer") &&
                eShip.getType().equals("Submarine") ||
                uShip.getType().equals("Submarine") &&
                eShip.getType().equals("Aircraft Carrier") ||
                uShip.getType().equals("Aircraft Carrier") &&
                eShip.getType().equals("Destroyer"))
		attack *= 2;
		
	if (eShip.getType().equals("Destroyer") &&
                uShip.getType().equals("Submarine") ||
                eShip.getType().equals("Submarine") &&
                uShip.getType().equals("Aircraft Carrier") ||
                eShip.getType().equals("Aircraft Carrier") &&
                uShip.getType().equals("Destroyer"))
		attack *= 0.5;
        
        Integer convert = (int) attack / 2;
        convert -= eShip.getDefense();
        
        if(convert < 0)
            convert = 0;

        return convert;
    }
    


    private static String sunkShip(Ship eShip) {
        
        String message = "";
        Location location = eShip.getLocation();
        
        Location[][] locations = PacificBattleship.getCurrentGame().getMap().getLocations();
        
        int row = location.getRow();
        int column = location.getColumn();
        
        locations[row][column].setShip(null);
        eShip.setLocation(null);
        
         message = "You sunk the " + eShip.getShipName() + "!\n";
         
         return message;
       
    }
    
    public static String counter(Ship activeShip, Ship enemyShip) {
        
        Ship battleship = PacificBattleship.getCurrentGame().getShip()[ShipList.battleship.ordinal()];
        
        String message = "";
        
        int shipStartHull = activeShip.getHull();
        
        boolean hit = hitOrMiss(enemyShip);
        int upgradeAttack = 0;
        int atkPower = 0;
        if(hit){
            
            try{  
                atkPower = CalTotalAttackPower(enemyShip, upgradeAttack, 0, enemyShip.getType());
            } catch (BattleControlException me) {
                ErrorView.display("Battle Control", me.getMessage());
            }
            
            int atkBonus = calculateAttackBonus(atkPower, enemyShip, activeShip);
            
            int shipRemainingHull = PacificBattleship.getCurrentGame().getActiveShip().getHull();
            
            try {
                shipRemainingHull = shipRemainingHull(atkBonus, activeShip);
            } catch (BattleControlException ex) {
                ErrorView.display("Battle Control", ex.getMessage());
            }
            
            activeShip.setHull(shipRemainingHull);
            
            if(shipRemainingHull == 0) {
                message = "You lost the " + activeShip.getShipName() + "...";
                if (activeShip != battleship)
                    PacificBattleship.getCurrentGame().setActiveShip(battleship);
                else
                    message = "You have lost...";
            }
            else
                message = "\nYou were hit by the " + enemyShip.getShipName() + " for " + (shipStartHull - shipRemainingHull);
        }
        else
            message = "\nThe " + enemyShip.getShipName() + "tried to attack you"
                    + "\n    but it missed!";
        
        
        
        
        return message;
        
    }

    public static String attackBase(Base enemyBase, Ship activeShip) {
        String message = "You assaulted " + enemyBase.getDescription() + " with " + (activeShip.getUpgradeSpecial().getCurrentAllocation() + 1) + " vessels!"
                + "\n    Your troops damaged the base " + ((activeShip.getAttack() + activeShip.getUpgradeAttack().getCurrentAllocation()) * activeShip.getUpgradeSpecial().getCurrentAllocation())
                + " points!";
        
        return message;
    }
    
    public static String baseCounter(Base enemyBase, Ship activeShip) {
        
        String message = "";
        
        return message;
    }
}
