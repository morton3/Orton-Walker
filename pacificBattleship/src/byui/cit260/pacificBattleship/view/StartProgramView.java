/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.view;

import byui.cit260.pacificBattleship.control.GameControl;
import byui.cit260.pacificBattleship.model.Game;
import java.util.Scanner;

/**
 *
 * @author Nathan
 */
public class StartProgramView {
    
    private String promptMessage;
    
    public  StartProgramView(){
        this.promptMessage = "\nPlease enter your name:";
        //display the banner when view is created
       this.displayBanner();
       
     }

    private void displayBanner() {
        System.out.println(
        "\n********************************************************************************************************"
        +"\n*Its December 7, 1941 and the Japanese have just bombed Pearl Harbor, the United States Naval*"
        +"\n*base in the Pacific. Causing the United States to be forced into the global conflict of World War 2.*"
        +"\n*In this role playing activity you start out as a one-star general. As you advance against the enemy*"
        +"\n*you will be promoted throughout the game topping out as a 5-star general after the Japanese*"
        +"\n*have surrendered. Based on your knowledge of past events you will pick and choose what forces*"
        +"\n*are needed for what battle. But watch out and don’t make the wrong move or make the wrong*"
        +"\n*guess of the intent of the Japanese military’s next move. It may lead your forces into defeat and*"
        +"\n*you will be decommissioned thus losing the game.*"
        +"\n*                                                                                                     *"
        +"\n*******************************************************************************************************"
        );
                
    }

    public void displayStartProgramView() {
        boolean done = false;
        do{
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) 
                return;
            done = this.doAction(playersName);
        }while (!done);
    }

    private String getPlayersName() {
        Scanner keyboard = new Scanner(System.in);
        String value ="";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.promptMessage);
            
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

    private boolean doAction(String playersName) {
       
        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name: "
                    + "The name must be greater than one character in length");
            return false;
        }
        Game player = GameControl.createPlayer(playersName);
        
        if (player == null) {
            System.out.println("\nError creating the player.");
            return false;
        }

    this.displayNextView(player);
      return true;
      
    }
   

    private void displayNextView(Game player) {
       System.out.println("\n===================================================="
                          +"\n Welcome to the game " + player.getUserName()
                          +"\n We hope you have fun!"
                          +"\n==================================================="
                           );
    
       MainMenuView mainMenuView = new MainMenuView();
       
       mainMenuView.displayMainMenuView();
    }
}
