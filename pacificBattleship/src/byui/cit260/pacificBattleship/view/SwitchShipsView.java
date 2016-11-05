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
               break;
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
              SwitchShipsView.activeToSubmarine();
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

    public Ship activeToBattleship() {
        
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
        
        CommandMenu.setActiveShip(GameControl.createActiveShip(battleship));
        
        System.out.println("Switched to the:\n"
                + CommandMenu.getActiveShip().getName()
                + "\n"
                + CommandMenu.getActiveShip().getDescription());
        
        return battleship;
    }

    public Ship activeToTransport() {
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
        
        CommandMenu.setActiveShip(GameControl.createActiveShip(transport));
        
        System.out.println("Switched to the:\n"
                + CommandMenu.getActiveShip().getName()
                + "\n"
                + CommandMenu.getActiveShip().getDescription());
        return transport;
    }

    public static void activeToSubmarine() {

        
        ShipClass submarine0 = new ShipClass(); 
        
        submarine0.setName("Salvaged Submarine");
        submarine0.setBonusDefense(0);
        submarine0.setBonusHull(0);
        submarine0.setSymbol("b");        
        
        Ship submarine = new Ship();
        
        submarine.setName("U.S.S. submarine name");
        submarine.setType("Submarine");
        submarine.setDefense(0);
        submarine.setAccuracy(70);
        submarine.setUserControl(true);
        submarine.setAttack(10);
        submarine.setHull(10);
        submarine.setMaxHull(10);
        submarine.setDescription("");
        submarine.setCoordinate(null);
        submarine.setSymbol("");
        submarine.setShipClass(submarine0);
        
        CommandMenu.setActiveShip(GameControl.createActiveShip(submarine));
        
        System.out.println("Switched to the:\n"
                + CommandMenu.getActiveShip().getName()
                + "\n"
                + CommandMenu.getActiveShip().getDescription());

    }

    public Ship activeToAircraftCarrier() {
        
        ShipClass aircraftCarrier0 = new ShipClass(); 
        
        aircraftCarrier0.setName("Salvaged Aircraft Carrier");
        aircraftCarrier0.setBonusDefense(0);
        aircraftCarrier0.setBonusHull(0);
        aircraftCarrier0.setSymbol("a");        
        
        Ship aircraftCarrier = new Ship();
        
        aircraftCarrier.setName("U.S.S. arircraft carrier");
        aircraftCarrier.setType("Aircraft Carrier");
        aircraftCarrier.setDefense(0);
        aircraftCarrier.setAccuracy(75);
        aircraftCarrier.setUserControl(true);
        aircraftCarrier.setAttack(10);
        aircraftCarrier.setHull(10);
        aircraftCarrier.setMaxHull(10);
        aircraftCarrier.setDescription("");
        aircraftCarrier.setCoordinate(null);
        aircraftCarrier.setSymbol("");
        aircraftCarrier.setShipClass(aircraftCarrier0);
        
        CommandMenu.setActiveShip(GameControl.createActiveShip(aircraftCarrier));
        
        System.out.println("Switched to the:\n"
                + CommandMenu.getActiveShip().getName()
                + "\n"
                + CommandMenu.getActiveShip().getDescription());
        return aircraftCarrier;
    }

    public Ship activeToDestroyer() {
        
        ShipClass destroyer0 = new ShipClass(); 
        
        destroyer0.setName("Salvaged Destroyer");
        destroyer0.setBonusDefense(0);
        destroyer0.setBonusHull(0);
        destroyer0.setSymbol("a");        
        
        Ship destroyer = new Ship();
        
        destroyer.setName("U.S.S. destroyer");
        destroyer.setType("Destroyer");
        destroyer.setDefense(0);
        destroyer.setAccuracy(60);
        destroyer.setUserControl(true);
        destroyer.setAttack(10);
        destroyer.setHull(10);
        destroyer.setMaxHull(10);
        destroyer.setDescription("");
        destroyer.setCoordinate(null);
        destroyer.setSymbol("");
        destroyer.setShipClass(destroyer0);
        
        CommandMenu.setActiveShip(GameControl.createActiveShip(destroyer));
        
        System.out.println("Switched to the:\n"
                + CommandMenu.getActiveShip().getName()
                + "\n"
                + CommandMenu.getActiveShip().getDescription());
        return destroyer;
        
    }
    



}


