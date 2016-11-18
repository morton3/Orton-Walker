/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.view;

import byui.cit260.pacificBattleship.control.GameControl;
import byui.cit260.pacificBattleship.model.Ship;
import byui.cit260.pacificBattleship.model.ShipClass;
import byui.cit260.pacificBattleship.model.ShipList;
import pacificbattleship.PacificBattleship;
import java.util.Scanner;

/**
 *
 * @author ort09
 */
public class SwitchShipsView extends View{
        private String menu;
        private String ship;
        

        
    public SwitchShipsView(){
        super(    "\n"
                + "\n┌---------------------------------------------┐"
                + "\n│ Switch Ship                                 │"
                + "\n├---------------------------------------------┤"
                + "\n│ B - Battleship                              │"
                + "\n│ T - Transport                               │"
                + "\n│ S - Submarine                               │"
                + "\n│ A - Aircraft Carrier                        │"
                + "\n│ D - Destroyer                               │"
                + "\n│ Q - Quit                                    │"
                + "\n└---------------------------------------------┘");
              }

   

  
    
    @Override
    public boolean doAction(String value) {
      value = value.toUpperCase();
      
      boolean done = true;
      
      
      switch (value){
          case "B":
              System.out.println("this.activeToBattleship();");
              break;
          case "T":
              System.out.println("this.activeToTransport();");
              break;
          case "S":
              System.out.println("this.activeToSubmarine();");
              break;
          case "A":
              System.out.println("this.activeToAircraftCarrier();");
              break;
          case "D":
              System.out.println("this.activeToDestroyer();");
              break;
          default: {
              System.out.println("\n*** Invalid selection *** Try again");
              done = false;
              break;}
      }
      
      
      return done;
    }
/*
    public void activeToBattleship() {
        
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
        battleship.setShipClass(battleship0);
        
        CommandMenu.setActiveShip(GameControl.createActiveShip(battleship));
        
        System.out.println("Switched to the:\n"
                + CommandMenu.getActiveShip().getName()
                + "\n"
                + CommandMenu.getActiveShip().getDescription());
        
        CommandMenu commandMenu = new CommandMenu();
        commandMenu.displayCommandMenuView();
    }

    public void activeToTransport() {
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
        
        CommandMenu commandMenu = new CommandMenu();
        commandMenu.displayCommandMenuView();
    }

    public void activeToSubmarine() {

        
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
        
        CommandMenu commandMenu = new CommandMenu();
        commandMenu.displayCommandMenuView();
    }

    public void activeToAircraftCarrier() {
        
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
        
        CommandMenu commandMenu = new CommandMenu();
        commandMenu.displayCommandMenuView();
    }

    public void activeToDestroyer() {
        
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
        
        CommandMenu commandMenu = new CommandMenu();
        commandMenu.displayCommandMenuView();
    }
    

*/

}


