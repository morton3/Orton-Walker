/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.control;

import byui.cit260.pacificBattleship.model.AttackShip;
import byui.cit260.pacificBattleship.model.Upgrade;

/**
 *
 * @author ort09
 */
public class Battle {

        /*
        DAMAGE TO eShip
    	int totalDamage = attack - eShipDefense;
	
	eShipHull -= totalDamage;

	return eShipHull;
        */
    
    /* NATHAN ---- TotalAttack */
    int totalAttack = 5;
    /* change 5 to formula return */
    
    /* MATT ---- hitOrMiss 	
    if(uShipAccuracy + hitChance < 100)
		return 0;*/
    boolean hitOrMiss = true;
    /* change truue to formula return */
    

    
    
    public int calculateAttackBonus(int totalAttack, AttackShip uShip, AttackShip eShip){
	
	if(uShip == null) {
		return -1;
	}
	if(eShip == null) {
		return -2;
	}

	int attack = totalAttack * 2;
        

	if (uShip.getShipType().equals("destroyer") &&
                eShip.getShipType().equals("submarine") ||
                uShip.getShipType().equals("submarine") &&
                eShip.getShipType().equals("aircraftCarrier") ||
                uShip.getShipType().equals("aircraftCarrier") &&
                eShip.getShipType().equals("destroyer"))
		attack *= 2;
		
	if (eShip.getShipType().equals("destroyer") &&
                uShip.getShipType().equals("submarine") ||
                eShip.getShipType().equals("submarine") &&
                uShip.getShipType().equals("aircraftCarrier") ||
                eShip.getShipType().equals("aircraftCarrier") &&
                uShip.getShipType().equals("destroyer"))
		attack *= 0.5;

        return attack;
    }
    
}
