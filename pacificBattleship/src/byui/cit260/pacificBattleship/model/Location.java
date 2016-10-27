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
    private String SymBot;
    private boolean hidden;

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

    public String getSymMid() {
        return SymMid;
    }

    public void setSymMid(String SymMid) {
        this.SymMid = SymMid;
    }

    public String getSymTop() {
        return SymTop;
    }

    public void setSymTop(String SymTop) {
        this.SymTop = SymTop;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.row;
        hash = 41 * hash + this.column;
        hash = 41 * hash + this.rank;
        hash = 41 * hash + Objects.hashCode(this.type);
        hash = 41 * hash + Objects.hashCode(this.SymTop);
        hash = 41 * hash + Objects.hashCode(this.SymMid);
        hash = 41 * hash + Objects.hashCode(this.SymBot);
        hash = 41 * hash + (this.hidden ? 1 : 0);
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
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.rank != other.rank) {
            return false;
        }
        if (this.hidden != other.hidden) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.SymTop, other.SymTop)) {
            return false;
        }
        if (!Objects.equals(this.SymMid, other.SymMid)) {
            return false;
        }
        if (!Objects.equals(this.SymBot, other.SymBot)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", rank=" + rank + ", type=" + type + ", SymTop=" + SymTop + ", SymMid=" + SymMid + ", SymBot=" + SymBot + ", hidden=" + hidden + '}';
    }




}
