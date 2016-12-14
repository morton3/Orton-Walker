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
import java.io.IOException;
import java.io.PrintWriter;
import pacificbattleship.PacificBattleship;
import java.util.Scanner;

/**
 *
 * @author ort09
 */
public class SwitchShipsView extends View{
        

        
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
                + "\n│ P - Print Report                            │"
                + "\n│ Q - Quit                                    │"
                + "\n└---------------------------------------------┘");
              }

   

  
    
    @Override
    public boolean doAction(String value) {
      value = value.toUpperCase();
      
      boolean done = true;
      
      Ship[] ships = PacificBattleship.getCurrentGame().getShip();
      
      switch (value){
          case "B":
              PacificBattleship.getCurrentGame().setActiveShip(ships[ShipList.battleship.ordinal()]);
              this.console.println(PacificBattleship.getCurrentGame().getActiveShip().getShipName());
              this.console.println(PacificBattleship.getCurrentGame().getActiveShip().getDescription());
              break;
          case "T":
              PacificBattleship.getCurrentGame().setActiveShip(ships[ShipList.transport.ordinal()]);
              this.console.println(PacificBattleship.getCurrentGame().getActiveShip().getShipName());
              this.console.println(PacificBattleship.getCurrentGame().getActiveShip().getDescription());
              break;
          case "S":
              PacificBattleship.getCurrentGame().setActiveShip(ships[ShipList.submarine.ordinal()]);
              this.console.println(PacificBattleship.getCurrentGame().getActiveShip().getShipName());
              this.console.println(PacificBattleship.getCurrentGame().getActiveShip().getDescription());
              break;
          case "A":
              PacificBattleship.getCurrentGame().setActiveShip(ships[ShipList.aircraftCarrier.ordinal()]);
              this.console.println(PacificBattleship.getCurrentGame().getActiveShip().getShipName());
              this.console.println(PacificBattleship.getCurrentGame().getActiveShip().getDescription());
              break;
          case "D":
              PacificBattleship.getCurrentGame().setActiveShip(ships[ShipList.destroyer.ordinal()]);
              this.console.println(PacificBattleship.getCurrentGame().getActiveShip().getShipName());
              this.console.println(PacificBattleship.getCurrentGame().getActiveShip().getDescription());
              break;
           case "P":
              this.printShipsReport();
              break;
          default: {
              PacificBattleship.getCurrentGame().setActiveShip(ships[ShipList.battleship.ordinal()]);
              done = false;
              break;}
      }
      
      
      return done;
    }
public void printShipsReport(){
        String fileLocation = "PacificBattleshipReport\\Nathan\\Nate37127";
                    Ship[] ships = PacificBattleship.getCurrentGame().getShip();
    
    try (PrintWriter out = new PrintWriter(fileLocation)) {
        
        out.println("\n\n           Ship List           ");
        out.printf("%n%-20s%10s%", "Name", "Type", "Class");
        out.printf("%n%-20s%10s%", "------", "------", "-----");
        
        for (Ship ship : ships){
            out.printf("%n%-20s%7d%13.2f", ship.getShipName()
                                         , ship.getType() 
                                         , ship.getShipClass().getName()); 
        }
    } catch (IOException ex){
                this.console.println("I/0 Error: " + ex.getMessage());
        }
    }

}




