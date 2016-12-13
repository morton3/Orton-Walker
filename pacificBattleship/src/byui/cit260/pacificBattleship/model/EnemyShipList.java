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
public enum EnemyShipList implements Serializable{
    enemyBattleship1("Yamato"),
    enemyBattleship2("Yamato"),
    enemyBattlecruisers1("Kongō1"),
    enemyBattlecruisers2("Kongō2"),
    enemySubmarine1("I-505"),
    enemySubmarine2("I-506"),
    enemyDestroyer1("Yūgumo1"),
    enemyDestroyer2("Yūgumo2"),
    enemyAircraftCarrier1("Shōkaku1"),
    enemyAircraftCarrier2("Shōkaku2");

    
        private String description;
    
    
        private EnemyShipList(String description) {
        this.description = description;
            }
        public String getDescription() {
        return description;
    }
    

}

    
    

