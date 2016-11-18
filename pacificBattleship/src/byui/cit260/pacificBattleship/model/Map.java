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
 */public class Map implements Serializable{
    
    
    private int rowCount;
    private int columnCount;
    private Game game;
    private Location[][] locations;

    public Map(int rowCount, int columnCount) {
        
        if (rowCount < 1 || columnCount< 1){
            System.out.println("The number of rows and columns must be greater than zero");
            return;
        }
        
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        
        this.locations= new Location[rowCount][columnCount];
        
        for (int row = 0; row < rowCount; row++) {
            for(int column = 0; column < columnCount; column++) {
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setHidden(true);
                
                locations[row][column] = location;
            }
        }
    }
    

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

   

    
    
    
    }
