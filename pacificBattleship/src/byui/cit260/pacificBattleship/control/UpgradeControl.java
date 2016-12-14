/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.control;

import byui.cit260.pacificBattleship.model.Collectable;
import byui.cit260.pacificBattleship.model.CollectableType;
import byui.cit260.pacificBattleship.model.Ship;
import byui.cit260.pacificBattleship.model.ShipClass;
import byui.cit260.pacificBattleship.model.Upgrade;
import pacificbattleship.PacificBattleship;

/**
 *
 * @author ort09
 */
public class UpgradeControl {

    public static boolean checkUpgradeMax(Upgrade upgrade) {
        int current = upgrade.getCurrentAllocation();
        int max = upgrade.getMaxAllocation();
        
        if (current == max)
            return false;
        else
            return true;
    }

    public static void increaseValue(Upgrade upgrade) {
        
        if (upgrade.getUpgradeType().equals("attack")) {
            int current = PacificBattleship.getCurrentGame().getActiveShip().getUpgradeAttack().getCurrentAllocation();
            PacificBattleship.getCurrentGame().getActiveShip().getUpgradeAttack().setCurrentAllocation(current + 1);
        }
        if (upgrade.getUpgradeType().equals("special")) {
            int current = PacificBattleship.getCurrentGame().getActiveShip().getUpgradeSpecial().getCurrentAllocation();
            PacificBattleship.getCurrentGame().getActiveShip().getUpgradeSpecial().setCurrentAllocation(current + 1);
        }
    }

    public static String upgradeClass(Ship ship, ShipClass shipClass) {
        
        String message = "";
        String shipInfo ="";
        
        Collectable[] collectables = PacificBattleship.getCurrentGame().getCollectables();
        
        switch (ship.getType()) {
            case "Battleship":
                message += UpgradeControl.changeBattleshipClass(ship, shipClass, collectables);
                break;
            case "Transport":
                message += UpgradeControl.changeTransportClass(ship, shipClass, collectables);
                break;
            case "Submarine":
                message += UpgradeControl.changeSubmarineClass(ship, shipClass, collectables);
                break;
            case "Aircraft Carrier":
                message += UpgradeControl.changeAircraftCarrierClass(ship, shipClass, collectables);
                break;
            case "Destroyer":
                message += UpgradeControl.changeDestroyerClass(ship, shipClass, collectables);
                break;
            default:
                
        }
        
        return message;
    }

    private static String changeBattleshipClass(Ship ship, ShipClass shipClass, Collectable[] collectables) {
        
        String message = "";
        boolean change = false;
        
        if (collectables[CollectableType.schematicBattleship2.ordinal()].isActive()) {
            ship.setShipClass(ShipClass.battleship2);
            collectables[CollectableType.schematicBattleship2.ordinal()].setActive(false);
            change = true;
        }
        
        if (collectables[CollectableType.schematicBattleship3.ordinal()].isActive() && ship.getShipClass() == ShipClass.battleship2) {
            ship.setShipClass(ShipClass.battleship3);
            collectables[CollectableType.schematicBattleship3.ordinal()].setActive(false);
            change = true;
        }
        
        if (!change && ship.getShipClass() == ShipClass.battleship3){
            message = "This ship is already upgraded all the way!";
            return message;
        }
        
        if (change)
            message = "Your Battleship was upgraded to a " + ship.getShipClass().getName();
        else
            message = "You are missing the required schematic!";
        
        return message;
    }

    private static String changeTransportClass(Ship ship, ShipClass shipClass, Collectable[] collectables) {
        
        String message = "";
        boolean change = false;
        
        if (collectables[CollectableType.schematicTransport2.ordinal()].isActive()) {
            ship.setShipClass(ShipClass.transport2);
            collectables[CollectableType.schematicTransport2.ordinal()].setActive(false);
            change = true;
        }
        
        if (collectables[CollectableType.schematicTransport3.ordinal()].isActive() && ship.getShipClass() == ShipClass.transport2) {
            ship.setShipClass(ShipClass.transport3);
            collectables[CollectableType.schematicTransport3.ordinal()].setActive(false);
            change = true;
        }
        
        if (!change && ship.getShipClass() == ShipClass.transport3){
            message = "This ship is already upgraded all the way!";
            return message;
        }
        
        if (change)
            message = "Your Transport was upgraded to a " + ship.getShipClass().getName();
        else
            message = "You are missing the required schematic!";
        
        return message;
    }
    
    private static String changeSubmarineClass(Ship ship, ShipClass shipClass, Collectable[] collectables) {
        
        String message = "";
        boolean change = false;
        
        if (collectables[CollectableType.schematicSubmarine2.ordinal()].isActive()) {
            ship.setShipClass(ShipClass.submarine2);
            collectables[CollectableType.schematicSubmarine2.ordinal()].setActive(false);
            change = true;
        }
        
        if (collectables[CollectableType.schematicSubmarine3.ordinal()].isActive() && ship.getShipClass() == ShipClass.submarine2) {
            ship.setShipClass(ShipClass.submarine3);
            collectables[CollectableType.schematicSubmarine3.ordinal()].setActive(false);
            change = true;
        }
        
        if (!change && ship.getShipClass() == ShipClass.submarine3){
            message = "This ship is already upgraded all the way!";
            return message;
        }
        
        if (change)
            message = "Your Submarine was upgraded to a " + ship.getShipClass().getName();
        else
            message = "You are missing the required schematic!";
        
        return message;
    }
    
    private static String changeAircraftCarrierClass(Ship ship, ShipClass shipClass, Collectable[] collectables) {
        
        String message = "";
        boolean change = false;
        
        if (collectables[CollectableType.schematicAircraftCarrier2.ordinal()].isActive()) {
            ship.setShipClass(ShipClass.aircraftCarrier2);
            collectables[CollectableType.schematicAircraftCarrier2.ordinal()].setActive(false);
            change = true;
        }
        
        if (collectables[CollectableType.schematicAircraftCarrier3.ordinal()].isActive() && ship.getShipClass() == ShipClass.aircraftCarrier2) {
            ship.setShipClass(ShipClass.aircraftCarrier3);
            collectables[CollectableType.schematicAircraftCarrier3.ordinal()].setActive(false);
            change = true;
        }
        
        if (!change && ship.getShipClass() == ShipClass.aircraftCarrier3){
            message = "This ship is already upgraded all the way!";
            return message;
        }
        
        if (change)
            message = "Your Aircraft Carrier was upgraded to a " + ship.getShipClass().getName();
        else
            message = "You are missing the required schematic!";
        
        return message;
    }
    
    private static String changeDestroyerClass(Ship ship, ShipClass shipClass, Collectable[] collectables) {
        
        String message = "";
        boolean change = false;
        
        if (collectables[CollectableType.schematicDestroyer2.ordinal()].isActive()) {
            ship.setShipClass(ShipClass.destroyer2);
            collectables[CollectableType.schematicDestroyer2.ordinal()].setActive(false);
            change = true;
        }
        
        if (collectables[CollectableType.schematicDestroyer3.ordinal()].isActive() && ship.getShipClass() == ShipClass.destroyer2) {
            ship.setShipClass(ShipClass.destroyer3);
            collectables[CollectableType.schematicDestroyer3.ordinal()].setActive(false);
            change = true;
        }
        
        if (!change && ship.getShipClass() == ShipClass.aircraftCarrier3){
            message = "This ship is already upgraded all the way!";
            return message;
        }
        
        if (change)
            message = "Your Destroyer was upgraded to a " + ship.getShipClass().getName();
        else
            message = "You are missing the required schematic!";
        
        return message;
    }
    
}
