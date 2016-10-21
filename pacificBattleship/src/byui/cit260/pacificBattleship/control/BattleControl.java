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

        /*
        DAMAGE TO eShip
    	int totalDamage = attack - eShipDefense;
	
	eShipHull -= totalDamage;

	return eShipHull;
        */
    
    /* NATHAN ---- TotalAttack */
    int totalAttack = 5;
    /* change 5 to formula return */
    
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
