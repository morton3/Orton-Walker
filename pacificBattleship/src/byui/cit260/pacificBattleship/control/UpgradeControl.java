/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.control;

import byui.cit260.pacificBattleship.model.Upgrade;
import pacificbattleship.PacificBattleship;

/**
 *
 * @author ort09
 */
public class UpgradeControl {

    public static boolean checkUpgradeMax(Upgrade upgrade) {
        int current = upgrade.getCurrentAllocation();
        int max = upgrade.getMaxAllocation();
        
        if (current == max)
            return false;
        else
            return true;
    }

    public static void increaseValue(Upgrade upgrade) {
        
        if (upgrade.getUpgradeType().equals("attack")) {
            int current = PacificBattleship.getCurrentGame().getActiveShip().getUpgradeAttack().getCurrentAllocation();
            PacificBattleship.getCurrentGame().getActiveShip().getUpgradeAttack().setCurrentAllocation(current + 1);
        }
        if (upgrade.getUpgradeType().equals("special")) {
            int current = PacificBattleship.getCurrentGame().getActiveShip().getUpgradeSpecial().getCurrentAllocation();
            PacificBattleship.getCurrentGame().getActiveShip().getUpgradeSpecial().setCurrentAllocation(current + 1);
        }
    }
    
    
    
}
