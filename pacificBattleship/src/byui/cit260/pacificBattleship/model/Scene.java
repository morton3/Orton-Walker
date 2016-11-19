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
    
    private boolean active;
    private String description;
    private String SymTop;
    private String[] SymMid;
    private String SymBot;

    public Scene() {
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSymTop() {
        return SymTop;
    }

    public void setSymTop(String SymTop) {
        this.SymTop = SymTop;
    }

    public String[] getSymMid() {
        return SymMid;
    }

    public void setSymMid(String[] SymMid) {
        this.SymMid = SymMid;
    }

    public String getSymBot() {
        return SymBot;
    }

    public void setSymBot(String SymBot) {
        this.SymBot = SymBot;
    }

    }

    
    

