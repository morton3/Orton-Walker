/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.view;

import java.util.Scanner;

/**
 *
 * @author Nathan
 */
public class HelpMenuView {
    private String menu;
    public HelpMenuView() {
        this.menu = "\n"
                   + "\n-------------------------------------------------"
                   +"\n| Help Menu                                      |"
                   +"\n--------------------------------------------------"
                   +"\nG - What is the goal of the game?"
                   +"\nM - How to move"
                   +"\nP - What do the POW'S do?"
                   +"\nN - What does the Nuke do?"
                   +"\nQ - Quit"
                   +"\n--------------------------------------------------";
              }

   public void displayHelpMenuView() {
       
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
      
      switch (menuOption){
          case "G":
              this.gameGoal();
              break;
          case "M":
              this.move();
              break;
          case "P":
              this.pow();
              break;
          case "N":
              this.nuke();
              break;
          default:
              System.out.println("\n*** Invalid selection *** Try again");
              break;
      }
      
       return false;
    }

    private void gameGoal() {
           System.out.println("\n*** gameGoal stub function called ***");
    }

    private void move() {
          System.out.println("\n*** move stub function called ***");
    }

    private void pow() {
          System.out.println("\n*** POW stub function called ***");
    }

    private void nuke() {
           System.out.println("\n*** nuke stub function called ***");
    }
}
