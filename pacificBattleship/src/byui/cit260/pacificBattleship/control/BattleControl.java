/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.control;

import byui.cit260.pacificBattleship.model.Ship;
import byui.cit260.pacificBattleship.model.Upgrade;
import byui.cit260.pacificBattleship.model.ShipClass;
import java.util.Random;

/**
 *
 * @author ort09
 */
public class BattleControl {

    public int attackUnit(Ship uShip, Ship eShip){
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
        

	if (uShip.getType().equals("destroyer") &&
                eShip.getType().equals("submarine") ||
                uShip.getType().equals("submarine") &&
                eShip.getType().equals("aircraftCarrier") ||
                uShip.getType().equals("aircraftCarrier") &&
                eShip.getType().equals("destroyer"))
		attack *= 2;
		
	if (eShip.getType().equals("destroyer") &&
                uShip.getType().equals("submarine") ||
                eShip.getType().equals("submarine") &&
                uShip.getType().equals("aircraftCarrier") ||
                eShip.getType().equals("aircraftCarrier") &&
                uShip.getType().equals("destroyer"))
		attack *= 0.5;

        return attack;
    }
    
}
