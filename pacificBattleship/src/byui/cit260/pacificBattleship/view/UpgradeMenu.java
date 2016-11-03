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
public class UpgradeMenu {
        private String menu;
        
        private int upgradeAttackMax = 5;
        private int upgradeAttackCurrent = 2;
        private int upgradeSpecialMax = 5;
        private int upgradeSpecialCurrent = 1;
        
        
        
    public UpgradeMenu() {
        
        this.menu = "\n"
                   + "\n-------------------------------------------------"
                   +"\n| Upgrade Menu                                      |"
                   +"\n--------------------------------------------------"
                   +"\nA - Upgrade attack power\n"
                   
                   + this.topHull(upgradeAttackMax)+"\n"
                   + this.MidTopHull(upgradeAttackCurrent, upgradeAttackMax)+"\n"
                   + this.BotHull(upgradeAttackMax)
                   +"\nS - Special ability\n"
                   + this.topHull(upgradeSpecialMax)+"\n"
                   + this.MidTopHull(upgradeSpecialCurrent, upgradeSpecialMax)+"\n"
                   + this.BotHull(upgradeSpecialMax)
                   
                   +"\nQ - Quit"
                   +"\n--------------------------------------------------";
              }

   public void displayUpgradeMenuView() {
       
       boolean done = false;
       do{
           String menuOption = this.getMenuOption();
           if (menuOption.toUpperCase().equals("Q"))
               return;
           done = this.doAction(menuOption);
   } while (!done);
          
      
    }

    private String getMenuOption() {
          
        Scanner keyboard = new Scanner(System.in);
        String value ="";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.menu);
            
            value = keyboard.nextLine();
            value = value.trim();
                    
            
            if (value.length() < 1) {
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            break;
        }
        return value;
    }
    

    public boolean doAction(String menuOption) {
      menuOption = menuOption.toUpperCase();
        String upgrade = "";
        
        
      switch (menuOption){
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



