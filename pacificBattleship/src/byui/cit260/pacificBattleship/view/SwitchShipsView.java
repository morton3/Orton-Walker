/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.view;

import byui.cit260.pacificBattleship.control.GameControl;
import byui.cit260.pacificBattleship.model.Ship;
import byui.cit260.pacificBattleship.model.ShipClass;
import pacificbattleship.PacificBattleship;
import java.util.Scanner;

/**
 *
 * @author ort09
 */
public class SwitchShipsView {
        private String menu;
        private String ship;
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
    

    private boolean doAction(String menuOption) {
      menuOption = menuOption.toUpperCase();
      
      boolean value = true;
      
      switch (menuOption){
          case "B":
              this.activeToBattleship();
              break;
          case "T":
              this.activeToTransport();
              break;
          case "S":
              this.activeToSubmarine();
              break;
          case "A":
              this.activeToAircraftCarrier();
              break;
          case "D":
              this.activeToDestroyer();
              break;
          default: {
              System.out.println("\n*** Invalid selection *** Try again");
              value = false;
              break;}
      }
      
      
      return value;
    }

    private void activeToBattleship() {
        
        ShipClass battleship0 = new ShipClass();
        
        battleship0.setName("Salvaged Battleship");
        battleship0.setBonusDefense(0);
        battleship0.setBonusHull(0);
        battleship0.setSymbol("b");
        
        Ship battleship = new Ship();
        
        battleship.setName("U.S.S. Tennessee");
        battleship.setType("Battleship");
        battleship.setDefense(1);
        battleship.setAccuracy(80);
        battleship.setUserControl(true);
        battleship.setAttack(4);
        battleship.setHull(6);
        battleship.setMaxHull(10);
        battleship.setDescription("");
        battleship.setCoordinate(null);
        battleship.setSymbol("");
        
        PacificBattleship.setActiveShip(GameControl.createActiveShip(battleship));
    }

    private void activeToTransport() {
        ShipClass transport0 = new ShipClass(); 
        
        transport0.setName("Salvaged Transport");
        transport0.setBonusDefense(0);
        transport0.setBonusHull(0);
        transport0.setSymbol("t");
        
        Ship transport = new Ship();
        
        transport.setName("U.S.S. President Jackson");
        transport.setType("Transport");
        transport.setDefense(0);
        transport.setAccuracy(100);
        transport.setUserControl(true);
        transport.setAttack(10);
        transport.setHull(10);
        transport.setMaxHull(10);
        transport.setDescription("");
        transport.setCoordinate(null);
        transport.setSymbol("");
        transport.setShipClass(transport0);
        
        PacificBattleship.setActiveShip(GameControl.createActiveShip(transport));
    }

    private void activeToSubmarine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void activeToAircraftCarrier() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void activeToDestroyer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    



}


