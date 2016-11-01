/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.view;

import byui.cit260.pacificBattleship.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author Nathan
 */
public class LaunchNuke {
            private String menu;
                private int parts = 15;
    public LaunchNuke() {
        this.menu = "\n"
                   + "\n-------------------------------------------------"
                   +"\n| Are you sure?                                   |"
                   +"\n--------------------------------------------------"
                   +"\nY - Yes "
                   +"\nQ - Quit"
                   +"\n--------------------------------------------------";
              }

   public void displayLaunchNukeView() {
       
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
        String launch = "";
        
        
      switch (menuOption){
          case "Y":
              launch = "launch";
              break;
          
         
          default:
              System.out.println("\n*** Invalid selection *** Try again");
              break;
      }
      GameControl.upgradeView(launch);
      
      return false;
    }

  
    }


