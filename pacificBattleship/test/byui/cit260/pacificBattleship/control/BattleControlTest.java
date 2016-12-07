/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.control;

import byui.cit260.pacificBattleship.exceptions.BattleControlException;
import byui.cit260.pacificBattleship.model.Ship;
import byui.cit260.pacificBattleship.model.Upgrade;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ort09
 */
public class BattleControlTest {
    
    public BattleControlTest() {
    }

    
    @Test
    public void testCalTotalAttackPower() 
                    throws BattleControlException{
        System.out.println("CalTotalAttackPower");
         /*********************************
         * Test case #1 Nathan
         ********************************/
        Ship uShip = new Ship();
        Upgrade uShipUpgrade = new Upgrade(); 
        Upgrade uShipUpgrade2 = new Upgrade(); 
        uShip.setAttack(3);
        uShipUpgrade.setCurrentAllocation(1);
        int expResult = 4;
         BattleControl instance = new BattleControl();
         int result = instance.CalTotalAttackPower(uShip,uShipUpgrade,uShipUpgrade2);
         assertEquals(expResult, result);
    
      
         /*********************************
         * Test case #2 Nathan
         ********************************/
        uShip.setAttack(-10);
        uShipUpgrade.setCurrentAllocation(2);
        expResult = -1;
        
          result = instance.CalTotalAttackPower(uShip,uShipUpgrade,uShipUpgrade2);
         assertEquals(expResult, result);
    
              /*********************************
         * Test case #3 Nathan
         ********************************/
        uShip.setAttack(11);
        uShipUpgrade.setCurrentAllocation(3);
        expResult = -1;
        
          result = instance.CalTotalAttackPower(uShip,uShipUpgrade,uShipUpgrade2);
         assertEquals(expResult, result);
    
                  /*********************************
         * Test case #4 Nathan
         ********************************/
        uShip.setAttack(5);
        uShipUpgrade.setCurrentAllocation(6);
        expResult = -1;
        
          result = instance.CalTotalAttackPower(uShip,uShipUpgrade,uShipUpgrade2);
         assertEquals(expResult, result);
    
             /*********************************
         * Test case #5 Nathan
         ********************************/
        uShip.setAttack(7);
        uShipUpgrade.setCurrentAllocation(-10);
        expResult = -1;
        
          result = instance.CalTotalAttackPower(uShip,uShipUpgrade,uShipUpgrade2);
         assertEquals(expResult, result);
    }
    /**
     * Test of hitOrMiss method, of class BattleControl.
     */
    @Test
    public void testHitOrMiss() {
        System.out.println("hitOrMiss");
        
        /*********************************
         * Test case #1
         ********************************/
        System.out.println("\tTest case #1");
                
        Ship uShip = new Ship();
        
        uShip.setAccuracy(100);
        
        boolean expResult = true;
        
        BattleControl instance = new BattleControl();

        boolean result = instance.hitOrMiss(uShip);
        
        assertEquals(expResult, result);
    
        /*********************************
         * Test case #2
         ********************************/
        System.out.println("\tTest case #2");
        
        uShip.setAccuracy(-1);
        
        expResult = false;

        result = instance.hitOrMiss(uShip);
        
        assertEquals(expResult, result);

    }

    /**
     * Test of calculateAttackBonus method, of class BattleControl.
     */
    @Test
    public void testCalculateAttackBonus() {
        System.out.println("calculateAttackBonus");
        
        /*********************************
         * Test case #1
         ********************************/
        System.out.println("\tTest case #1");
        
        // input values for test case 1
        int totalAttack = 1;
        Ship uShip = new Ship();
        Ship eShip = new Ship();
        
        uShip.setType("submarine");
        eShip.setType("destroyer");
        
        int expResult = 1; // expected output returned value
        
        // create instance of BattleControl Class
        BattleControl instance = new BattleControl();
        
        // call function to run test
        int result = instance.calculateAttackBonus(totalAttack, uShip, eShip);
        
        // compare expected return value with actual return value
        assertEquals(expResult, result);
        

        /*********************************
         * Test case #2
         ********************************/

        System.out.println("\tTest case #2");
        
        // input values for test case 1
        totalAttack = 1;
        
        uShip.setType("submarine");
        eShip.setType("submarine");
        
        expResult = 2; // expected output returned value
        
        
        // call function to run test
        result = instance.calculateAttackBonus(totalAttack, uShip, eShip);
        
        // compare expected return value with actual return value
        assertEquals(expResult, result);
        
        /*********************************
         * Test case #3
         ********************************/

        System.out.println("\tTest case #3");
        
        // input values for test case 1
        totalAttack = 1;
        
        uShip.setType("submarine");
        eShip.setType("aircraftCarrier");
        
        expResult = 4; // expected output returned value
        
        
        // call function to run test
        result = instance.calculateAttackBonus(totalAttack, uShip, eShip);
        
        // compare expected return value with actual return value
        assertEquals(expResult, result);
        
        /*********************************
         * Test case #4
         ********************************/

        System.out.println("\tTest case #4");
        
        // input values for test case 1
        totalAttack = -2;
        
        uShip.setType("submarine");
        eShip.setType("destroyer");
        
        expResult = -3; // expected output returned value
        
        
        // call function to run test
        result = instance.calculateAttackBonus(totalAttack, uShip, eShip);
        
        // compare expected return value with actual return value
        assertEquals(expResult, result);
        
        /*********************************
         * Test case #5
         ********************************/

        System.out.println("\tTest case #5");
        
        // input values for test case 1
        totalAttack = 35;
        
        uShip.setType("submarine");
        eShip.setType("destroyer");
        
        expResult = -3; // expected output returned value
        
        
        // call function to run test
        result = instance.calculateAttackBonus(totalAttack, uShip, eShip);
        
        // compare expected return value with actual return value
        assertEquals(expResult, result);
        
    }

    /**
     * Test of hitOrMiss method, of class BattleControl.
     */
    
    
    
    
}
