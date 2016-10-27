/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.control;

import byui.cit260.pacificBattleship.model.Game;
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
    
}
