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
        String launch = "";
        
        
      switch (value){
          case "Y":
              launch = "launch";
              break;
          
         
          default:
              System.out.println("\n*** Invalid selection *** Try again");
              break;
      }
         System.out.println("\n*** Nuke is launch");
     
      
      return false;
    }
    
    public int numOfNukeParts;
        
    
    
    

  
    }


