/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.control;

import byui.cit260.pacificBattleship.exceptions.BattleControlException;
import byui.cit260.pacificBattleship.model.Location;
import byui.cit260.pacificBattleship.model.Ship;
import byui.cit260.pacificBattleship.model.Upgrade;
import byui.cit260.pacificBattleship.view.ErrorView;
import byui.cit260.pacificBattleship.view.View;
import java.util.Random;
import pacificbattleship.PacificBattleship;

/**
 *
 * @author ort09
 */
public class BattleControl {

    public static void attackUnit(Ship uShip, Ship eShip, Upgrade uShipUpgradeAttack, Upgrade uShipUpgradeSpecial)
                    throws BattleControlException{
        
        boolean hit = hitOrMiss(uShip);
        int atkPower = 0;
        if(hit){
            
            try{  
                atkPower = CalTotalAttackPower(uShip, uShipUpgradeAttack, uShipUpgradeSpecial);
            } catch (BattleControlException me) {
                ErrorView.display("Battle Control", me.getMessage());
            }
            
            int atkBonus = calculateAttackBonus(atkPower, uShip, eShip);
            
            int shipRemainingHull = shipRemainingHull(atkBonus, eShip);
            
            eShip.setHull(shipRemainingHull);
            
            if(shipRemainingHull == 0)
                BattleControl.sunkShip(eShip);
            else
                System.out.println("You hit " + eShip.getShipName() + " for " + atkBonus);
        }
        else
            System.out.println("You missed!");
        
        
        
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
   
    public static int CalTotalAttackPower(Ship uShip,Upgrade uShipUpgradeAttack, Upgrade uShipUpgradeSpecial)
                throws BattleControlException{
        
        int attack = uShip.getAttack();
        int upgradeCurrentLevel = uShipUpgradeAttack.getCurrentAllocation();
   
        if(upgradeCurrentLevel < 0 || upgradeCurrentLevel > 5){
            throw new BattleControlException("Upgrade is not within bounds");
        }
        
        if(uShipUpgradeSpecial.getShipType() == "Destroyer") {
            
            int level = uShipUpgradeSpecial.getCurrentAllocation();
            Integer atk = new Integer(attack);
            Integer upgrdCrrntLvl = new Integer(upgradeCurrentLevel);
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
            Double attackWithBonus = new Double((atk.doubleValue() + upgrdCrrntLvl.doubleValue()) * power);
            return attackWithBonus.intValue();
        }
        
        return attack + upgradeCurrentLevel;
    }

   
    
    /* Calculate wheether or not the attack will hit */
    
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
        
        if(totalAttack < 0 || totalAttack > 30) {
            return -3;
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
    
    public static String checkForEnemy(int row, int column) 
            throws BattleControlException {
        
        Location[][] locations = PacificBattleship.getCurrentGame().getMap().getLocations();
        String message;
        
        if (locations[row][column].getShip() == null){
            message = "No enemy ship here...";
            return message;
        }
        
        Ship activeShip = PacificBattleship.getCurrentGame().getActiveShip();
        Upgrade upgradeAttack = activeShip.getUpgradeAttack();
        Upgrade upgradeSpecial = activeShip.getUpgradeSpecial();
        
        Ship enemyShip = locations[row][column].getShip();
        
        BattleControl.attackUnit(activeShip, enemyShip, upgradeAttack, upgradeSpecial);
        
        message = "Fired on the " + enemyShip.getShipName() + ", a "
                + enemyShip.getShipClass().getName() + " class "
                + enemyShip.getType();
        
        return message;
    }

    private static void sunkShip(Ship eShip) {
        Location location = eShip.getLocation();
        
        Location[][] locations = PacificBattleship.getCurrentGame().getMap().getLocations();
        
        int row = location.getRow();
        int column = location.getColumn();
        
        locations[row][column].setShip(null);
        eShip.setLocation(null);
        
         System.out.println("You sunk the " + eShip.getShipName() + "!\n");
       
    }
    
}
