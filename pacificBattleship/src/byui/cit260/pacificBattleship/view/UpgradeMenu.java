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
       
        
  
        
        
    public UpgradeMenu() {
        
        super(      "");
        
        this.displayMenu();
    
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
              break;
          case "R":
              this.printUpgradesReport();
              return false;
          default:
              this.console.println("\n*** Invalid selection *** Try again");
              return false;
      }
      
      int usedPOW = PacificBattleship.getCurrentGame().getNumOfUsedPOW();
      int POW = PacificBattleship.getCurrentGame().getNumOfPOW();
      
      if (upgrade != null){
          if(PacificBattleship.getCurrentGame().getNumOfPOW() > 0){
              if(UpgradeControl.checkUpgradeMax(upgrade)) {
                  UpgradeControl.increaseValue(upgrade);
                  this.console.println("You increased the " + ship.getShipName() + " " + upgrade.getName() + " to level " + upgrade.getCurrentAllocation());
                  PacificBattleship.getCurrentGame().setNumOfPOW(POW - 1);
                  PacificBattleship.getCurrentGame().setNumOfUsedPOW(usedPOW + 1);
              }
              else
                  this.console.println("You cannot upgrade this ship any further");
          }
          else
              this.console.println("You do not have enough POW's to upgrade this ship!");
      }    
      
      this.displayMenu();
      
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
    
    private void displayMenu() {
        
        int upgradeAttackMax = 5;
        int upgradeAttackCurrent = PacificBattleship.getCurrentGame().getActiveShip().getUpgradeAttack().getCurrentAllocation();
        int upgradeSpecialMax = 5;
        int upgradeSpecialCurrent = PacificBattleship.getCurrentGame().getActiveShip().getUpgradeSpecial().getCurrentAllocation();
        
        String upgradeSpecial = PacificBattleship.getCurrentGame().getActiveShip().getUpgradeSpecial().getName();
        int nameULength = PacificBattleship.getCurrentGame().getActiveShip().getUpgradeSpecial().getName().length();
        
        String upgradeAttack = PacificBattleship.getCurrentGame().getActiveShip().getUpgradeAttack().getName();
        int nameALength = PacificBattleship.getCurrentGame().getActiveShip().getUpgradeAttack().getName().length();
        
        String spacesA = "";
        
        for (int i = nameALength; i > 0; i--) {
            spacesA += " ";
        }
        
        String spacesU = "";
        
        for (int i = nameULength; i > 0; i--) {
            spacesU += " ";
        }
      
        
        this.console.println("\n"
                   + "\n-------------------------------------------------"
                   +"\n| Upgrade Menu                                      |"
                   +"\n--------------------------------------------------"
                   +"\n|      " + spacesA + this.topBar(upgradeAttackMax)
                   +"\n| A - " + upgradeAttack + " " + this.midTopBar(upgradeAttackCurrent, upgradeAttackMax)
                   +"\n|      " + spacesA + this.botBar(upgradeAttackMax)
                   +"\n|      " + spacesU + this.topBar(upgradeSpecialMax)
                   +"\n| S - " + upgradeSpecial + " " + this.midTopBar(upgradeSpecialCurrent, upgradeSpecialMax)
                   +"\n|      " + spacesU + this.botBar(upgradeSpecialMax)
                   +"\n| C - Upgrade Ship Class"
                   +"\n|      Current - " + PacificBattleship.getCurrentGame().getActiveShip().getShipClass().getName()
                   +"\n| "
                   +"\n| R - See Upgrade Report"
                   +"\n| Q - Quit"
                   +"\n--------------------------------------------------");
        
        
    }
      
    private String topBar(int uaMax){
        
        String line = "┌";
        int x = 1;
        
        while (uaMax > x){
            line += "─┬";
            x++;
        }
        
        return line += "─┐";
    }
    
    private String midTopBar(int uaCurrent, int uaMax) {
        
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
    
    private String botBar(int uaMax) {
         
       String line = "└";
        int x = 1;
        
        while (uaMax > x){
            line += "─┴";
            x++;
        }
        
        return line += "─┘";
    }
}


