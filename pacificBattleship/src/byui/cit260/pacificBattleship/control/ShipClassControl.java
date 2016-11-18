/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.control;

import byui.cit260.pacificBattleship.model.BattleshipClassList;
import byui.cit260.pacificBattleship.model.Ship;
import byui.cit260.pacificBattleship.model.ShipClass;
import byui.cit260.pacificBattleship.model.ShipList;

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

  

  
}
