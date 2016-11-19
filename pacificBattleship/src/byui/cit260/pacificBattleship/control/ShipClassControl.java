/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.control;

import byui.cit260.pacificBattleship.model.AircraftCarrierClassList;
import byui.cit260.pacificBattleship.model.BattleshipClassList;
import byui.cit260.pacificBattleship.model.DestroyerClassList;
import byui.cit260.pacificBattleship.model.ShipClass;
import byui.cit260.pacificBattleship.model.SubmarineClassList;
import byui.cit260.pacificBattleship.model.TransportClassList;

/**
 *
 * @author Nathan
 */
public class ShipClassControl {

    static ShipClass[] createBattleshipClasses() {
        ShipClass[] battleshipClasses = new ShipClass[BattleshipClassList.values().length];
        
        ShipClass battleship0 = new ShipClass();  
        battleship0.setName("Battleship Class 1");
        battleship0.setBonusDefense(0);
        battleship0.setBonusHull(0);
        battleship0.setSymbol("b");
        battleship0.setBonusAccuracy(0);
        battleshipClasses[BattleshipClassList.battleship0.ordinal()] = battleship0;
        
        return battleshipClasses;
        
     }

    static ShipClass[] createTransportClasses() {
        ShipClass[] transportClasses = new ShipClass[TransportClassList.values().length];
        
        ShipClass transport0 = new ShipClass();  
        transport0.setName("Transport Class 1");
        transport0.setBonusDefense(0);
        transport0.setBonusHull(0);
        transport0.setSymbol("t");
        transport0.setBonusAccuracy(0);
        transportClasses[TransportClassList.transport0.ordinal()] = transport0;
        
        return transportClasses;
    }

    static ShipClass[] createSubmarineClasses() {
        ShipClass[] submarineClasses = new ShipClass[SubmarineClassList.values().length];
        
        ShipClass submarine0 = new ShipClass();  
        submarine0.setName("Submarine Class 1");
        submarine0.setBonusDefense(0);
        submarine0.setBonusHull(0);
        submarine0.setSymbol("s");
        submarine0.setBonusAccuracy(0);
        submarineClasses[SubmarineClassList.submarine0.ordinal()] = submarine0;
        
        return submarineClasses;
    }

    static ShipClass[] createAircraftCarrierClasses() {
        ShipClass[] aircraftCarrierClasses = new ShipClass[AircraftCarrierClassList.values().length];
        
        ShipClass aircraftCarrier0 = new ShipClass();  
        aircraftCarrier0.setName("Aircraft Carrier Class 1");
        aircraftCarrier0.setBonusDefense(0);
        aircraftCarrier0.setBonusHull(0);
        aircraftCarrier0.setSymbol("a");
        aircraftCarrier0.setBonusAccuracy(0);
        aircraftCarrierClasses[AircraftCarrierClassList.aircraftCarrier0.ordinal()] = aircraftCarrier0;
        
        return aircraftCarrierClasses;
    }

    static ShipClass[] createDestroyerClasses() {
        ShipClass[] destroyerClasses = new ShipClass[DestroyerClassList.values().length];
        
        ShipClass destroyer0 = new ShipClass();  
        destroyer0.setName("Destroyer Class 1");
        destroyer0.setBonusDefense(0);
        destroyer0.setBonusHull(0);
        destroyer0.setSymbol("d");
        destroyer0.setBonusAccuracy(0);
        destroyerClasses[DestroyerClassList.destroyer0.ordinal()] = destroyer0;
        
        return destroyerClasses;
    }

  

  
}
