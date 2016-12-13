/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.view;

import byui.cit260.pacificBattleship.control.GameControl;
import byui.cit260.pacificBattleship.control.UpgradeControl;
import byui.cit260.pacificBattleship.model.Ship;
import byui.cit260.pacificBattleship.model.ShipClass;
import byui.cit260.pacificBattleship.model.Upgrade;
import byui.cit260.pacificBattleship.model.UpgradeList;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import pacificbattleship.PacificBattleship;

/**
 *
 * @author Nathan
 */
public class UpgradeMenu extends View{
       
        
        private int upgradeAttackMax = 5;
        private int upgradeAttackCurrent = 2;
        private int upgradeSpecialMax = 5;
        private int upgradeSpecialCurrent = 1;
        
        
        
    public UpgradeMenu() {
        
        super(      "\n"
                   + "\n-------------------------------------------------"
                   +"\n| Upgrade Menu                                      |"
                   +"\n--------------------------------------------------"
                   +"\nA - Upgrade attack power"
                   +"\nS - Special ability"
                   +"\nC - Upgrade Ship Class"
                   +"\nR - See Upgrade Report"
                   +"\nQ - Quit"
                   +"\n--------------------------------------------------");
              }

 

    

    @Override
    public boolean doAction(String value) {
      value = value.toUpperCase();
        
      Ship ship = PacificBattleship.getCurrentGame().getActiveShip();
      Upgrade upgrade = null;
        
        
      switch (value){
          case "A":
              upgrade = ship.getUpgradeAttack();
              break;
          case "S":
              upgrade = ship.getUpgradeSpecial();
              break;
          case "C":
              ShipClass shipClass = ship.getShipClass();
              String message = UpgradeControl.upgradeClass(ship, shipClass);
              this.console.println(message);
              return false;
          case "R":
              this.printUpgradesReport();
              return false;
          default:
              this.console.println("\n*** Invalid selection *** Try again");
              return false;
      }
      
      if(UpgradeControl.checkUpgradeMax(upgrade)) {
          UpgradeControl.increaseValue(upgrade);
          this.console.println("You increased the " + ship.getShipName() + " " + upgrade.getName() + " to level " + upgrade.getCurrentAllocation());
      }
      else
          this.console.println("You cannot upgrade this ship any further");
      
      
      return false;
    }
    
    public void printUpgradesReport() {
        
        String fileLocation = "C:\\Users\\ort09\\OneDrive\\Documents\\CIT-260\\upgrades.txt";
        Ship[] ships = PacificBattleship.getCurrentGame().getShip();
        
        try (PrintWriter out = new PrintWriter(fileLocation)) {
            
            out.println("\n\n                    Ship Upgrades Report                         ");
            out.printf("%n%-25s%20s%10s%10s", "Name of Ship", "Upgrade", "Current", "Maximum");
            out.printf("%n%-25s%20s%10s%10s", "------------", "-------", "-------", "-------");
            
            for (Ship ship : ships) {
                out.printf("%n%-25s%20s%7d%7d" , ship.getShipName()
                                              , ship.getUpgradeAttack().getName()
                                              , ship.getUpgradeAttack().getCurrentAllocation()
                                              , ship.getUpgradeAttack().getMaxAllocation());
                out.printf("%n%-25s%20s%7d%7d" , ship.getShipName()
                                              , ship.getUpgradeSpecial().getName()
                                              , ship.getUpgradeSpecial().getCurrentAllocation()
                                              , ship.getUpgradeSpecial().getMaxAllocation());
            }
        }   catch (IOException ex) {
                this.console.println("I/O Error: " + ex.getMessage());
        }
        
        this.console.println("Report saved to Documents as upgrades.txt");
    }
}
    /*
      this.topHull(upgradeAttackMax)+"\n"
                   + this.MidTopHull(upgradeAttackCurrent, upgradeAttackMax)+"\n"
                   + this.BotHull(upgradeAttackMax)
                   
                   + this.topHull(upgradeSpecialMax)+"\n"
                   + this.MidTopHull(upgradeSpecialCurrent, upgradeSpecialMax)+"\n"
                   + this.BotHull(upgradeSpecialMax)
      
  private String topHull(int uaMax){
        
        String line = "┌";
        int x = 1;
        
        while (uaMax > x){
            line += "─┬";
            x++;
        }
        
        return line += "─┐";
    }
  private String MidTopHull(int uaCurrent, int uaMax) {
        
        String line = "│";
        int x = 0;
        
        while (uaMax > x) {
            if (uaCurrent > x)
                line += "█";
            
            else
                line += "░";
            
            line += "│";
                    
            x++;
        }
        
        return line;
    }
    private String BotHull(int uaMax) {
         
       String line = "└";
        int x = 1;
        
        while (uaMax > x){
            line += "─┴";
            x++;
        }
        
        return line += "─┘";
    }

    }


*/
