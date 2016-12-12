/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.view;
import byui.cit260.pacificBattleship.control.GameControl;
import byui.cit260.pacificBattleship.model.Collectable;
import byui.cit260.pacificBattleship.model.Game;
import byui.cit260.pacificBattleship.model.Location;
import byui.cit260.pacificBattleship.model.Map;
import byui.cit260.pacificBattleship.model.NukeParts;
import byui.cit260.pacificBattleship.model.Scene;
import byui.cit260.pacificBattleship.model.Ship;
import byui.cit260.pacificBattleship.model.ShipClass;
import byui.cit260.pacificBattleship.model.ShipList;
import pacificbattleship.PacificBattleship;

/**
 *
 * @author ort09
 */
public class CommandMenu extends View{
    

    public CommandMenu(){
        
        super(
                "Command?"
        );
        
        this.displayMap(PacificBattleship.getCurrentGame().getActiveShip());
        
        
    }
    

    @Override
    public boolean doAction(String menuOption) {
        menuOption = menuOption.toUpperCase();
        
      
      switch (menuOption){
          case "R":
              this.upgradeMenu();
              break;
          case "E": {
              this.switchShips();
              break;}
          case "W":
              this.moveUp();
              break;
          case "S":
              this.moveDown();
              break;
          case "A":
              this.moveLeft();
              break;
          case "D":
              this.moveRight();
              break;
          case "4":
              this.attack();
              break;
          case "N":
              this.launchNuke();
              break;
          case "L":
              this.countNukePieces();
              break;
          case "C":
              this.schematicPiecesView();
              break;
          default:
              this.console.println("\n*** Invalid selection *** Try again");
              break;
      }
      
      this.displayMap(PacificBattleship.getCurrentGame().getActiveShip());
      
      return false;
           }
           
           
    
    private void displayMap(Ship ship){
        
        Map map = PacificBattleship.getCurrentGame().getMap();
        Location[][] locations = map.getLocations();
        
        // Generic blank for locations without Ships
        String symbol = "   ";
        
        String[] sideMenu = new String[42];
        
        String rank =  PacificBattleship.getPlayer().getRank().getSymbol() + " " + PacificBattleship.getPlayer().getRank().getName();
        String userName = PacificBattleship.getPlayer().getUserName();
        String shipClass = ship.getShipClass().getName();
        String shipType = ship.getType();
        String shipName = ship.getShipName();
        int shipAttack = ship.getAttack();
        int shipAccuracy = ship.getAccuracy() + ship.getShipClass().getBonusAccuracy();
        int defense = ship.getDefense() + ship.getShipClass().getBonusDefense();
        int hull = ship.getHull();
        int maxHull = ship.getMaxHull() + ship.getShipClass().getBonusHull();
        int currentPart = PacificBattleship.getCurrentGame().getNuclearParts();
        int POWs = PacificBattleship.getCurrentGame().getNumOfPOW() - PacificBattleship.getCurrentGame().getNumOfUsedPOW();
        String shipSymbol = "<" + ship.getSymbol() + ">";
        
        sideMenu[0] =  " " + rank;
        sideMenu[1] =  " " + userName;
        sideMenu[2] =  "";
        sideMenu[3] =  " " + shipName;
        sideMenu[4] =  " " + shipClass;
        sideMenu[5] =  " " + shipType;
        sideMenu[6] =  "";
        sideMenu[7] =  " ATTACK »»»»»»»» " + Integer.toString(shipAttack);
        sideMenu[8] =  " ACCURACY »»»»»» " + Integer.toString(shipAccuracy);
        sideMenu[9] =  " DEFENCE »»»»»»» " + Integer.toString(defense);
        sideMenu[10] = " POW's »»»»»»»»» " + Integer.toString(POWs);
        sideMenu[11] = "";
        sideMenu[12] = " ┌--------------------┐";
        sideMenu[13] = " │ HULL       " + Integer.toString(hull) + " / " + Integer.toString(maxHull);
        sideMenu[14] = " " + this.topHull(maxHull);
        sideMenu[15] = " " + this.MidTopHull(hull, maxHull);
        sideMenu[16] = " " + this.MidHull(maxHull);
        sideMenu[17] = " " + this.MidBotHull(hull, maxHull);
        sideMenu[18] = " " + this.BotHull(maxHull);
        sideMenu[19] = "   ┌---┐-Main░  ░░┌---┐-Switch ┌---┐-Upgrade";
        sideMenu[20] = "   │ Q │ Menu░  ░░│ E │ Ships  │ R │";
        sideMenu[21] = "   └---┘   ┌─--┐  └---┘        └---┘";
        sideMenu[22] = "   ░   ░   │░W │-Up";
        sideMenu[23] = "        ┌─-┴┬--┴┬---┐";
        sideMenu[24] = "   Left-│░A░│ S░│ D │-Right";
        sideMenu[25] = "        └──-┴─--┴---┘";
        sideMenu[26] = "                 └Down";
        sideMenu[27] = "    ┌---┐";
        sideMenu[28] = "    │ 4 │-Attack";
        sideMenu[29] = "    └---┘";
        sideMenu[30] = "";
        sideMenu[31] = "    ┌---┐-Launch";
        sideMenu[32] = "    │ N │ Nuke";
        sideMenu[33] = "    └---┘";
        sideMenu[34] = "";
        sideMenu[35] = "     " + Integer.toString(currentPart) + " / 15 Parts";
        sideMenu[36] = "";
        sideMenu[37] = "";
        sideMenu[38] = " L - How many Nuke pieces are left?";
        sideMenu[39] = " C - How many schematic pieces are left?";
        sideMenu[40] = "";
        sideMenu[41] = "";
        
        int rowNum = 0;
        
        int menuRow = 0;
        
        String wholeMap = 
                "                                 Pacific Battleship\n"
                + "┌--┬-------┬-------┬-------┬-------┬-------┬-------┬-------┬-------┬-------┬-------┐"
                + sideMenu[menuRow++] + "\n"
                + "│>>│   A   │   B   │   C   │   D   │   E   │   F   │   G   │   H   │   I   │   J   │"
                + sideMenu[menuRow++];
        
        // Cycle through all rows
        for (Location[] row : locations) {
            wholeMap += "\n├--┼-------┼-------┼-------┼-------┼-------┼-------┼-------┼-------┼-------┼-------┤"
                    + sideMenu[menuRow++]
                    +   "\n│  ";  
            
            rowNum ++;
            
            // Top of each row
            for (Location location : row){
                wholeMap += "│";
                if (!location.isHidden()) 
                    wholeMap  +=  location.getScene().getSymTop();
                else 
                    wholeMap += "???????";
            }
            
            wholeMap += "│";
            wholeMap += sideMenu[menuRow++];
            wholeMap += "\n│";
            
            // Row Number
            if (rowNum == 10)
                wholeMap += "10";
            else 
                wholeMap += " " + rowNum;
            
            // Middle of each row
            for (Location location : row){
                
                if (location.getShip() == null)
                    symbol = "   ";
                else
                    symbol = " " + location.getShip().getSymbol() + " ";
                
                String symMid[] = location.getScene().getSymMid();

                wholeMap += "│";
                if (!location.isHidden())
                    wholeMap  +=  symMid[0];
                else 
                    wholeMap += "??"; 
                
                if (!location.isHidden())
                    wholeMap += symbol;
                else 
                    wholeMap += "???";
                
                if (!location.isHidden()) 
                    wholeMap  +=  symMid[1];
                else 
                    wholeMap += "??";
            
            }
            
            wholeMap += "│";
            wholeMap += sideMenu[menuRow++];
            wholeMap += "\n│  ";
            
            // Bottom of each row
            for (Location location : row){
                wholeMap += "│";
                if (!location.isHidden()) 
                    wholeMap  +=  location.getScene().getSymBot();
                else 
                    wholeMap += "???????";
            } 
            
            wholeMap += "│";
            wholeMap += sideMenu[menuRow++];
        }
        
        wholeMap += "\n└--┴-------┴-------┴-------┴-------┴-------┴-------┴-------┴-------┴-------┴-------┘";
        
        this.console.println(wholeMap);
    
    }
    
    private String topHull(int maxHull){
        
        String line = "├";
        int x = 1;
        
        while (maxHull > x && x < 20){
            line += "─┬";
            x++;
        }
        
        return line += "─┐";
    }

    private String MidTopHull(int hull, int maxHull) {
        
        String line = "│";
        int x = 0;
        
        while (maxHull > x && x < 20) {
            if (hull > x)
                line += "█";
            
            else
                line += "░";
            
            line += "│";
                    
            x++;
        }
        
        return line;
    }

    private String MidHull(int maxHull) {
        
        String line = "";
        
        if (maxHull <= 20)
            line = "└";
        else
            line = "├";
        
        int x = 1;
        int y = 20;
        
        while (maxHull > x && x < 20){
            if (maxHull > y){
                line += "─┼";
            }
            else {
                line += "─┴";
            }
            x++;
            y++;
        }
        
        y--;
        
        if (maxHull == y)
            return line += "─┤";
        
        return line += "─┘";
    }

    private String MidBotHull(int hull, int maxHull) {
        
        if (maxHull <= 20)
            return "";
        
        String line = "";
        int x = 20;
        
        while (maxHull > x) {
            if (hull > x)
                line += "│█";
            
            else
                line += "│░";
                    
            x++;
        }
        
        return line += "│";
    }

    private String BotHull(int maxHull) {
        if (maxHull <= 20){
            return "";
        }
        
        String line = "└";
        int x = 21;
        
        while (maxHull > x){
            line += "─┴";
            x++;
        }
        
        return line += "─┘";
    }

    private void upgradeMenu() {
        UpgradeMenu upgradeMenu = new UpgradeMenu();
        upgradeMenu.display();
    }

    private void switchShips() {
        
        SwitchShipsView switchShipsView = new SwitchShipsView();
        switchShipsView.display();
        
    }

    private void moveUp() {
        this.moveto(0,-1);
    }

    private void moveDown() {
        this.moveto(0,1);
    }

    private void moveLeft() {
        this.moveto(-1,0);
    }

    private void moveRight() {
        this.moveto(1,0);
    }

    private void attack() {
       AttackMenuView attackMenuView = new AttackMenuView();
       attackMenuView.display();
    }

    private void launchNuke() {
       LaunchNuke launchNuke = new LaunchNuke();
       launchNuke.display();
    }

    private void countNukePieces() {
        this.console.println("*** countNukePieces() function called ***");
    }

    private void schematicPiecesView() {
        SchematicPiecesView schematicPiecesView = new SchematicPiecesView();
        schematicPiecesView.display();
    }

    private void moveto(int x, int y) {
        
        Ship ship = PacificBattleship.getCurrentGame().getActiveShip();
        Location[][] locations = PacificBattleship.getCurrentGame().getMap().getLocations();
        
        Ship battleship = PacificBattleship.getCurrentGame().getShip()[ShipList.battleship.ordinal()];
        
        Location shipLocation = ship.getLocation();
        int row = shipLocation.getRow();
        int column = shipLocation.getColumn();
        
        // check if coordinates are on the map
        if (row + y > 9 || row + y < 0 || column + x > 9 || column + x < 0){
            this.console.println("Going off the chart!!!!\nTurn Around!!!!");
            return;
        }
        
        if (!this.checkArea(locations[y + row][x + column]))
            return;
        
        // Set location of Ship to new location
        ship.setLocation(locations[y + row][x + column]);                       
        
        // remove ship from old location
        locations[row][column].setShip(null);                                   
        
        //place ship in new location
        locations[y + row][x + column].setShip(ship);                           
        
        //set Ship location to seen
        locations[y + row][x + column].setHidden(false);                        
        
        // Don't Hide Pearl Harbor!
        if (!(row == 2 && column == 9)) {
            if (battleship.getUpgradeSpecial().getCurrentAllocation() < 1)
                locations[row][column].setHidden(true);
        }
        

        
        
    }

    private boolean checkArea(Location location) {
        
        boolean water = location.getScene().isActive();
        
        
        if (!water) {
            this.console.println("You can't go on land!"
                    + "\n    You'll need the transport to assault islands.\n");
            return false;
        }
        
        if (location.getShip() == null) {
            return true;
        }
        
        Ship ship = location.getShip();
        
        if (ship.isUserControl()) {
            this.console.println("You're about to run into your own ship!"
                           + "\n    Turn around!!!!");
            return false;
        }
        
        if (!ship.isUserControl()) {
            this.console.println("Looks like there's an enemy Ship here!"
                           + "\nWe can either attack it, or go around...");
            return false;
        }
        
        if (!(location.getCollectable() == null)) {
            this.pickupCollectable(location);
        }
        
        if (!(location.getNukePart() == null)) {
            this.pickupNukePart(location);
        }
        
        return true;
    }

    private void pickupCollectable(Location location) {
        this.console.println("You found a schematic!\n"
                + location.getCollectable().getName());
        
        Collectable collectable = location.getCollectable();
        
        location.setCollectable(null);
        
        collectable.setActive(false);
        
        
        
    }

    private void pickupNukePart(Location location) {
        this.console.println("You found a Nuke Part!");
        
        NukeParts nukePart = location.getNukePart();
    }
            
            
            
}
