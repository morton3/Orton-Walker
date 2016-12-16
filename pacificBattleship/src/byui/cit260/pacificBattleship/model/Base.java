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
public class Base extends Ship implements Serializable {
    private int POW;
    private boolean active;

    public int getPOW() {
        return POW;
    }

    public void setPOW(int POW) {
        this.POW = POW;
    }
    
    
    

    public Base() {
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }



    
}