/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.control;

import byui.cit260.pacificBattleship.model.Game;
import byui.cit260.pacificBattleship.model.Location;
import byui.cit260.pacificBattleship.model.Ship;
import byui.cit260.pacificBattleship.model.ShipClass;
import byui.cit260.pacificBattleship.view.CommandMenu;
import java.util.HashSet;
import pacificbattleship.PacificBattleship;

/**
 *
 * @author Nathan
 */
public class GameControl {

    public static Game createPlayer(String name) {
        if (name == null) {
            return null;
        }
        Game player = new Game();
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

    public static Ship getActiveShip() {

        ShipClass startClass = new ShipClass();

        startClass.setName("Salvaged Battleship");
        startClass.setBonusDefense(0);
        startClass.setBonusHull(0);
        startClass.setSymbol("b");

        Ship activeShip = new Ship();

        activeShip.setName("USS Tennessee");
        activeShip.setType("Battleship");
        activeShip.setDefense(1);
        activeShip.setAccuracy(80);
        activeShip.setUserControl(true);
        activeShip.setAttack(4);
        activeShip.setHull(6);
        activeShip.setMaxHull(10);
        activeShip.setDescription("");
        activeShip.setCoordinate(null);
        activeShip.setSymbol("");
        activeShip.setShipClass(startClass);

        return activeShip;

    }

}
