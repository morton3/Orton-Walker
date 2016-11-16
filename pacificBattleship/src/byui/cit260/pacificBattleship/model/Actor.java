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
public class Actor implements Serializable{
    
    private String description;
    private Rank rank;
    private Player player;
    
    
    Actor(String description, Rank rank){
        
        this.description = description;
        this.rank = rank;

}
    
    


    
}
