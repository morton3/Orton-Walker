/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.model;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Nathan
 */
public class Scene implements Serializable{
    
    private int description;
    private int mapSymbol;

    public Scene() {
    }

    public int getDescription() {
        return description;
    }

    public void setDescription(int description) {
        this.description = description;
    }

    public int getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(int mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.description;
        hash = 17 * hash + this.mapSymbol;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Scene other = (Scene) obj;
        if (this.description != other.description) {
            return false;
        }
        if (this.mapSymbol != other.mapSymbol) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", mapSymbol=" + mapSymbol + '}';
    }
    
    
    
}
