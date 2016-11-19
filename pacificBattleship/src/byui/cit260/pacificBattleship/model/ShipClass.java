/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author ort09
 */
public enum ShipClass implements Serializable{
    
    battleship1("Battleship Class 1", 0, 0, "b", 0),
    battleship2("Battleship Class 1", 2, 10, "B", 10),
    battleship3("Battleship Class 1", 4, 20, "ß", 20),
    transport1("Transport Class 1", 0, 0, "t", 0),
    transport2("Transport Class 1", 1, 8, "†", 0),
    transport3("Transport Class 1", 2, 16, "T", 0),
    submarine1("Submarine Class 1", 0, 0, "s", 0),
    submarine2("Submarine Class 1", 1, 9, "S", 8),
    submarine3("Submarine Class 1", 3, 9, "Š", 16),
    aircraftCarrier1("Aircraft Carrier Class 1", 0, 0, "a", 0),
    aircraftCarrier2("Aircraft Carrier Class 1", 3, 13, "A", 8),
    aircraftCarrier3("Aircraft Carrier Class 1", 6, 26, "Ä", 15),
    destroyer1("Destroyer Class 1", 0, 0, "d", 0),
    destroyer2("Destroyer Class 1", 3, 12, "D", 10),
    destroyer3("Destroyer Class 1", 5, 24, "Ð", 20);
    
    private String name;
    private int bonusDefense;
    private int bonusHull;
    private String symbol;
    private int bonusAccuracy;

    ShipClass(String name, int bonusDefense, int bonusHull, String symbol, int bonusAccuracy) {
        this.name = name;
        this.bonusDefense = bonusDefense;
        this.bonusHull = bonusHull;
        this.symbol = symbol;
        this.bonusAccuracy = bonusAccuracy;
    }

    public String getName() {
        return name;
    }

    public int getBonusDefense() {
        return bonusDefense;
    }

    public int getBonusHull() {
        return bonusHull;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getBonusAccuracy() {
        return bonusAccuracy;
    }

   
    }


    
    
    
    

