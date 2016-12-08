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
              this.console.println("\n*** Invalid selection *** Try again");
              break;
      }
      
       return false;
    }

    private void startNewGame() {
        
       GameControl.createNewGame(PacificBattleship.getPlayer());
       
       CommandMenu commandMenu = new CommandMenu();
       commandMenu.display();
    }

    private void startExistingGame() {
        this.console.println("\n\nEnter the file path for file where the game"
                            + "is to be saved.");
        String filePath = this.getInput();
        
        try {
            GameControl.getSavedGame(filePath);
        }catch (Exception ex){
            ErrorView.display("MainMenuView", ex.getMessage());
    }
        CommandMenu commandMenu = new CommandMenu();
        commandMenu.display();
    }
  
    private void saveGame() {
        this.console.println("\n\nEnter the file path for file where the game"
                            + "is to be saved.");
        String filePath = this.getInput();
        
        try {
            GameControl.saveGame(PacificBattleship.getCurrentGame(), filePath);
        }catch (Exception ex){
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }
    
    private void displayHelpMenuView() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }
    
    
}