/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacificbattleship;

import byui.cit260.pacificBattleship.model.Game;

/**
 *
 * @author ort09
 */
public class PacificBattleship {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game gameOne = new Game();
        
        gameOne.setName("Nathan");
        gameOne.setScrapAmount(2.00);
        gameOne.setNumOfUnusedPrisoners(5.00);
        gameOne.setNumOfUsedPrisoners(7.00);
        
        
        //Testing conflect
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
    }   
}
