/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.view;

import byui.cit260.pacificBattleship.control.GameControl;
import byui.cit260.pacificBattleship.model.ShipMenu;
import java.util.Scanner;

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
                   +"\nQ - Quit"
                   +"\n--------------------------------------------------");
              }

 

    

    public boolean doAction(String value) {
      value = value.toUpperCase();
        String upgrade = "";
        
        
      switch (value){
          case "A":
              upgrade = "Attack power";
              break;
          case "S":
              upgrade = "Special abilty";
              break;
         
          default:
              System.out.println("\n*** Invalid selection *** Try again");
              break;
      }
      GameControl.upgradeView(upgrade);
      
      return false;
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
