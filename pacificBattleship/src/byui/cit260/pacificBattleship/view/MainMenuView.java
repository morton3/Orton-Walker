/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.view;

import byui.cit260.pacificBattleship.control.GameControl;
import byui.cit260.pacificBattleship.model.Ship;
import java.util.Scanner;
import pacificbattleship.PacificBattleship;

/**
 *
 * @author Nathan
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
                +"\n-------------------------------------------------"
                   +"\n| Main Menu                                      |"
                   +"\n--------------------------------------------------"
                   +"\nN - Start new game"
                   +"\nG - Get and start saved game"
                   +"\nH - Get help om how to play the game"
                   +"\nS - Save game"
                   +"\nQ - Quit"
                   +"\n--------------------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
      value = value.toUpperCase();
      
      switch (value){
          case "N":
              this.startNewGame();
              break;
          case "G":
              this.startExistingGame();
              break;
          case "H":
              this.displayHelpMenuView();
              break;
          case "S":
              this.saveGame();
              break;
          default:
              System.out.println("\n*** Invalid selection *** Try again");
              break;
      }
      
       return false;
    }

    private void startNewGame() {
        
       GameControl.createNewGame(PacificBattleship.getPlayer());
    }

    private void startExistingGame() {
        System.out.println("*** startExistinGame function called ***");
    }

  
    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }
    
    private void displayHelpMenuView() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }
    
    
}