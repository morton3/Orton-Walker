/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.view;

import byui.cit260.pacificBattleship.control.GameControl;
import pacificbattleship.PacificBattleship;
import java.util.Scanner;

/**
 *
 * @author ort09
 */
public class SwitchShipsView {
        private String menu;
    public SwitchShipsView() {
        this.menu = "\n"
                + "\n-------------------------------------------------"
                + "\n| Switch Ship                                    |"
                + "\n--------------------------------------------------"
                + "\nB - Battleship"
                + "\nT - Transport"
                + "\nS - Submarine"
                + "\nA - Aircraft Carrier"
                + "\nD - Destroyer"
                + "\nQ - Quit"
                + "\n--------------------------------------------------";
              }

   public void displaySwitchShipsView() {
       
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
    

    public static boolean doAction(String menuOption) {
      menuOption = menuOption.toUpperCase();
      
      String ship = "";
      
      switch (menuOption){
          case "B":
              ship = "Battleship";
              break;
          case "T":
              ship = "Transport";
              break;
          case "S":
              ship = "Submarine";
              break;
          case "A":
              ship = "Aircraft Carrier";
              break;
          case "D":
              ship = "Destroyer";
              break;
          default:
              System.out.println("\n*** Invalid selection *** Try again");
              break;
      }
      
      GameControl.switchShips(ship);
      
      return false;
    }


}


