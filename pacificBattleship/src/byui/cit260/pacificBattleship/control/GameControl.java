/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.control;

import byui.cit260.pacificBattleship.model.Game;
import byui.cit260.pacificBattleship.model.Player;
import byui.cit260.pacificBattleship.model.Ship;
import byui.cit260.pacificBattleship.model.ShipClass;
import byui.cit260.pacificBattleship.view.CommandMenu;
import pacificbattleship.PacificBattleship;

/**
 *
 * @author Nathan
 */
public class GameControl {

    public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }
        Player player = new Player();
        player.setUserName(name);
        PacificBattleship.setPlayer(player);

        return player;
    }

    public static void createNewGame() {

        CommandMenu commandMenu = new CommandMenu();
        commandMenu.display();
    }

    public static void upgradeView(String upgrade) {
        int POW = 1;
        int current = 2;
        int max = 5;

        if (POW < 1 || current == max) {
            System.out.println("You can not upgrade this ship " + upgrade);
        } else {
            System.out.println("You have upgraded your ship " + upgrade);
        }
    }

    /*
    public static Ship getActiveShip() {

        ShipClass startClass = new ShipClass();

        startClass.setName("Salvaged Battleship");
        startClass.setBonusDefense(0);
        startClass.setBonusHull(0);
        startClass.setSymbol("b");
        
        Ship activeShip;
        activeShip = Ship("USS Tennessee", "Battleship", 1, 80, true, 4, 6, 10, "USS Tennessee description here", "B");
        
        return activeShip;


    }
*/
}
