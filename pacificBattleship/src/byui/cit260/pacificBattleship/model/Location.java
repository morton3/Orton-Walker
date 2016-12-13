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
public class Location implements Serializable{
    private int row;
    private int column;
    private int rank;
    private String type;
    private String SymTop;
    private String SymMid;
    private String SymMid2;
    private String SymBot;
    private boolean hidden;
    private String symbol;
    private NukeParts nukePart;
    private Collectable collectable;
    private Ship ship;
    private Scene scene;
    private Base base;

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public Location() {
    }

   
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSymTop() {
        return SymTop;
    }

    public void setSymTop(String SymTop) {
        this.SymTop = SymTop;
    }

    public String getSymMid() {
        return SymMid;
    }

    public void setSymMid(String SymMid) {
        this.SymMid = SymMid;
    }

    public String getSymMid2() {
        return SymMid2;
    }

    public void setSymMid2(String SymMid2) {
        this.SymMid2 = SymMid2;
    }

    public String getSymBot() {
        return SymBot;
    }

    public void setSymBot(String SymBot) {
        this.SymBot = SymBot;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    
    }

    public Collectable getCollectable() {
        return collectable;
    }

    public void setCollectable(Collectable collectable) {
        this.collectable = collectable;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public NukeParts getNukePart() {
        return nukePart;
    }

    public void setNukePart(NukeParts nukePart) {
        this.nukePart = nukePart;
    }
    
    

 
    }
    


