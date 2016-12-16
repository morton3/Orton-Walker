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
public class LaunchNuke extends View{
            
                private int parts = 15;
    public LaunchNuke() {
        super( "\n"
                   + "\n-------------------------------------------------"
                   +"\n| Are you sure?                                   |"
                   +"\n--------------------------------------------------"
                   +"\nY - Yes "
                   +"\nQ - Quit"
                   +"\n--------------------------------------------------");
              }

 


    
    @Override
    public boolean doAction(String value) {
      value = value.toUpperCase();
        
        
      switch (value){
          case "Y":
              this.checkNuke();
              break;
          
         
          default:
              this.console.println("\n*** Invalid selection *** Try again");
              break;
      }
     
      
      return false;
    }
    
    public int numOfNukeParts;

    private void checkNuke() {
        this.console.println(GameControl.launchNuke());
    }
        
    
    
    

  
    }


