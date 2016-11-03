/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.control;

import byui.cit260.pacificBattleship.model.Game;
import byui.cit260.pacificBattleship.view.CommandMenu;
import pacificbattleship.PacificBattleship;

/**
 *
 * @author Nathan
 */
public class GameControl {

    public static Game createPlayer(String name) {
      if (name == null){
          return null;
      }
      Game player = new Game();
      player.setUserName(name);
      PacificBattleship.setPlayer(player);
      
       return player;
    }

    public static void createNewGame(Game player) {
        CommandMenu commandMenu = new CommandMenu();
        commandMenu.displayCommandMenuView();
    }


    public static void upgradeView(String upgrade) {
        
            if (PacificBattleship.getPOW() < 1 || PacificBattleship.getCurrent() == PacificBattleship.getMax()){ 
                System.out.println("You can not upgrade this ship " + upgrade);
            }
            else {
                System.out.println("You have upgraded your ship " + upgrade);
            }
                }
    public static void switchShips(String ship) {
        
        System.out.println("You've selected the " + ship);

    }
    
}
