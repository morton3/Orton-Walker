/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.control;

import byui.cit260.pacificBattleship.model.Ship;
import byui.cit260.pacificBattleship.model.Upgrade;
import java.util.Random;

/**
 *
 * @author ort09
 */
public class BattleControl {

    public int attackUnit(Ship uShip, Ship eShip, Upgrade uShipUpgrade){
        
        boolean hit = hitOrMiss(uShip);
        
        if(hit){
                
        int atkPower = CalTotalAttackPower(uShip, uShipUpgrade);
        int atkBonus = calculateAttackBonus(atkPower, uShip, eShip);
        
        int shipRemainingHull = shipRemainingHull(atkBonus, eShip);
        
        eShip.setHull(shipRemainingHull);     
        
        return 0;
        }
        
        else
            return 0;
    }
    
    public int shipRemainingHull(int damage, Ship eShip){
        if(eShip == null)
            return -1;
        
        if(damage < 0)
            return 0;
        
        int oldHull = eShip.getHull();
        
        int newHull = oldHull - damage;
        
        return newHull;
    }
    
    /* NATHAN ---- TotalAttack */
   
    public int CalTotalAttackPower(Ship uShip,Upgrade uShipUpgrade){
        
    int attack = uShip.getAttack();
      int upgradeCurrentLevel = uShipUpgrade.getCurrentAllocation();
   
    if(attack < 0 || attack >5){
			return -1;
                                }
	
    if(upgradeCurrentLevel < 0 || upgradeCurrentLevel > 5){
			return -1;
                                }
             return attack + upgradeCurrentLevel;
    }

   
    
    /* Calculate wheether or not the attack will hit */
    
    public boolean hitOrMiss(Ship uShip){
        Random rn = new Random();
        
        int hitMissRatio = rn.nextInt(100) + 1;
        
        if (uShip.getAccuracy() + hitMissRatio < 100){
            return false;
        }
        else
            return true;
        
        }

    
    public int calculateAttackBonus(int totalAttack, Ship uShip, Ship eShip){
	
	if(uShip == null) {
		return -1;
	}
	if(eShip == null) {
		return -2;
	}
        
        if(totalAttack < 0 || totalAttack > 30) {
            return -3;
        }

	int attack = totalAttack * 2;
        

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

        return attack;
    }
    
    public static String checkForEnemy(int row, int column) {
        
        String message = "checkForEnemy(int row, int column)";
        
        return message;
    }
    
}
