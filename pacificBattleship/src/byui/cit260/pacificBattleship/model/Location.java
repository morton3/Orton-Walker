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
    private boolean visited;
    private String rank;
    private String turrain;

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

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getTurrain() {
        return turrain;
    }

    public void setTurrain(String turrain) {
        this.turrain = turrain;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.row;
        hash = 37 * hash + this.column;
        hash = 37 * hash + (this.visited ? 1 : 0);
        hash = 37 * hash + Objects.hashCode(this.rank);
        hash = 37 * hash + Objects.hashCode(this.turrain);
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
        if (this.visited != other.visited) {
            return false;
        }
        if (!Objects.equals(this.rank, other.rank)) {
            return false;
        }
        if (!Objects.equals(this.turrain, other.turrain)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", rank=" + rank + ", turrain=" + turrain + '}';
    }
    
    
}
