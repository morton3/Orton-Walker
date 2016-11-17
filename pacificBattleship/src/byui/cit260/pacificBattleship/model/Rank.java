/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.model;

import java.io.Serializable;

/**
 *
 * @author ort09
 */
public enum Rank implements Serializable {
    
    Captain("Captain", "Lead officer on a ship", "C"),
    OneStarGeneral("One-Star General", "First rank", "*"),
    TwoStarGeneral("Two-Star General", "Second rank", "* *"),
    ThreeStarGeneral("Three-Star General", "Third rank", "* * *"),
    FourStarGeneral("Four-Star General", "Fourth rank", "* * * *"),
    FiveStarGeneral("Five-Star General", "Fifth rank", "* * * * *");
    
    private final String name;
    private final String description;
    private final String symbol;
    private Player[] player;
    private Actor[] actor;
    
    Rank(String name, String description, String symbol){
        this.name = name;
        this.description = description;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getSymbol() {
        return symbol;
    }

    public Player[] getPlayer() {
        return player;
    }

    public Actor[] getActor() {
        return actor;
    }
    
}
