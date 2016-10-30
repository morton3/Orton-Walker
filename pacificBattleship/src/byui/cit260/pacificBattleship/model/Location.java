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

    public Location() {
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", rank=" + rank + ", type=" + type + ", SymTop=" + SymTop + ", SymMid=" + SymMid + ", SymMid2=" + SymMid2 + ", SymBot=" + SymBot + ", hidden=" + hidden + ", symbol=" + symbol + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.row;
        hash = 79 * hash + this.column;
        hash = 79 * hash + this.rank;
        hash = 79 * hash + Objects.hashCode(this.type);
        hash = 79 * hash + Objects.hashCode(this.SymTop);
        hash = 79 * hash + Objects.hashCode(this.SymMid);
        hash = 79 * hash + Objects.hashCode(this.SymMid2);
        hash = 79 * hash + Objects.hashCode(this.SymBot);
        hash = 79 * hash + (this.hidden ? 1 : 0);
        hash = 79 * hash + Objects.hashCode(this.symbol);
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
        if (!Objects.equals(this.SymMid2, other.SymMid2)) {
            return false;
        }
        if (!Objects.equals(this.SymBot, other.SymBot)) {
            return false;
        }
        if (!Objects.equals(this.symbol, other.symbol)) {
            return false;
        }
        return true;
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

}
