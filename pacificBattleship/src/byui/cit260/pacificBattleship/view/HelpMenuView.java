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
public class HelpMenuView extends View{
    
    public HelpMenuView() {
        super("\n"
                   + "\n-------------------------------------------------"
                   +"\n| Help Menu                                      |"
                   +"\n--------------------------------------------------"
                   +"\nG - What is the goal of the game?"
                   +"\nM - How to move"
                   +"\nP - What do the POW'S do?"
                   +"\nN - What does the Nuke do?"
                   +"\nQ - Quit"
                   +"\n--------------------------------------------------");
              }
    

    @Override
    public boolean doAction(String value) {
      value = value.toUpperCase();
      
      switch (value){
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
              this.console.println("\n*** Invalid selection *** Try again");
              break;
      }
      
       return false;
    }

    private void gameGoal() {
           this.console.println("\n*** gameGoal stub function called ***");
    }

    private void move() {
          this.console.println("\n*** move stub function called ***");
    }

    private void pow() {
          this.console.println("\n*** POW stub function called ***");
    }

    private void nuke() {
           this.console.println("\n*** nuke stub function called ***");
    }
}
