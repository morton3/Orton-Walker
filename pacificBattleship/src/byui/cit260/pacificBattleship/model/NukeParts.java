/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.model;

import java.io.Serializable;

/**
 *
 * @author Nathan
 */
public enum NukeParts implements Serializable{
    nukePart1("First Nuclear Bomb Part"),
    nukePart2("Second Nuclear Bomb Part"),
    nukePart3("Third Nuclear Bomb Part"),
    nukePart4("Forth Nuclear Bomb Part"),
    nukePart5("Fith Nuclear Bomb Part"),
    nukePart6("Sixth Nuclear Bomb Part"),
    nukePart7("Seventh Nuclear Bomb Part"),
    nukePart8("Eighth Nuclear Bomb Part"),
    nukePart9("Ninth Nuclear Bomb Part"),
    nukePart10("Tenth Nuclear Bomb Part"),
    nukePart11("Eleventh Nuclear Bomb Part"),
    nukePart12("Twelfth Nuclear Bomb Part"),
    nukePart13("Thirteenth Nuclear Bomb Part"),
    nukePart14("Fourteenth Nuclear Bomb Part"),
    nukePart15("Fifteenth Nuclear Bomb Part");

    private String description;
    
    
    private NukeParts(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    

}


