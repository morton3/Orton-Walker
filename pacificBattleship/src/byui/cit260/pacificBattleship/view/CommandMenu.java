/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.view;
import byui.cit260.pacificBattleship.control.GameControl;
import byui.cit260.pacificBattleship.model.Game;
import byui.cit260.pacificBattleship.model.Location;
import byui.cit260.pacificBattleship.model.Map;
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
          default:
              System.out.println("\n*** Invalid selection *** Try again");
              break;
      }
      
      this.displayMap(PacificBattleship.getCurrentGame().getActiveShip());
      
      return false;
           }
           
           
    
    private void displayMap(Ship ship){
        Map map = PacificBattleship.getCurrentGame().getMap();
        Location[][] locations = map.getLocations(); 
        
        
        String[] sideMenu = new String[13];
        
        String rank =  PacificBattleship.getPlayer().getRank().getSymbol() + " " + PacificBattleship.getPlayer().getRank().getName();
        String userName = PacificBattleship.getPlayer().getUserName();
        String shipClass = ship.getShipClass().getName();
        String shipType = ship.getType();
        String shipName = ship.getShipName();
        String shipAttack = Integer.toString(ship.getAttack());
        String shipAccuracy = Integer.toString(ship.getAccuracy() + ship.getShipClass().getBonusAccuracy());
        String defense = Integer.toString(ship.getDefense() + ship.getShipClass().getBonusDefense());
        String hull = Integer.toString(ship.getHull());
        String maxHull = Integer.toString(ship.getMaxHull() + ship.getShipClass().getBonusHull());
        String currentPart = Integer.toString(PacificBattleship.getCurrentGame().getNuclearParts());
        String POWs = Integer.toString(PacificBattleship.getCurrentGame().getNumOfPOW() - PacificBattleship.getCurrentGame().getNumOfUsedPOW());
        String shipSymbol = "<" + ship.getSymbol() + ">";
        
        sideMenu[0] = "\n";
        sideMenu[1] = rank;
        sideMenu[2] = userName;
        sideMenu[3] = shipName;
        sideMenu[4] = shipClass;
        sideMenu[5] = shipType;
        
        // Fix this Matt- from, Matt
        sideMenu[5] = shipAttack;
        sideMenu[6] = shipAccuracy;
        sideMenu[7] = defense;
        sideMenu[8] = hull;
        sideMenu[9] = maxHull;
        sideMenu[10] = currentPart;
        sideMenu[11] = POWs;
        sideMenu[12] = shipSymbol;
        int rowNum = 0;
        
String wholeMap = 
          "                                 Pacific Battleship\n"
        + "┌--┬-------┬-------┬-------┬-------┬-------┬-------┬-------┬-------┬-------┬-------┐\n"
        + "│>>│   A   │   B   │   C   │   D   │   E   │   F   │   G   │   H   │   I   │   J   │";
               
// Cycle through all rows
for (Location[] row : locations) {
    wholeMap += "\n├--┼-------┼-------┼-------┼-------┼-------┼-------┼-------┼-------┼-------┼-------┤\n"
            +   "│  ";
    rowNum ++;
    
    // Top of each row
    for (Location location : row){
        wholeMap += "│";
        if (!location.isHidden()) 
            wholeMap  +=  location.getScene().getSymTop();
        else 
            wholeMap += "???????";
                   
    }
    
    wholeMap += "│\n│";
    
    // Row Number
    if (rowNum == 10)
        wholeMap += "10";
    else 
        wholeMap += " " + rowNum;
    
    // Middle of each row
    for (Location location : row){
        String[] symMid = location.getScene().getSymMid();
        wholeMap += "│";
        if (!location.isHidden())
            wholeMap  +=  symMid[0];
        else 
            wholeMap += "??";
                    
        if (!location.isHidden())
            wholeMap += "   ";
        else 
            wholeMap += "???";
                                
        if (!location.isHidden()) 
            wholeMap  +=  symMid[1];
        else 
            wholeMap += "??";
                
    }
    
    wholeMap += "│\n│  ";
    
    // Bottom of each row
    for (Location location : row){
        wholeMap += "│";
        if (!location.isHidden()) 
            wholeMap  +=  location.getScene().getSymBot();
        else 
            wholeMap += "???????";
    }               
                                              
    wholeMap += "│";
    
}

wholeMap += "\n└--┴-------┴-------┴-------┴-------┴-------┴-------┴-------┴-------┴-------┴-------┘";

System.out.println(wholeMap);

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

    private String checkHidden(Location coordinate, String symbol) {
        
        int i = 1;
        String blanks = " ";
        
        if (coordinate.isHidden()){
            while (symbol.length() > i){
                blanks += " ";
                i++;
            }
            return blanks;
        }
        else
    
            
            return symbol;
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
        System.out.println("*** moveUp function called ***");
    }

    private void moveDown() {
        System.out.println("*** moveDown function called ***");
    }

    private void moveLeft() {
        System.out.println("*** moveLeft function called ***");
    }

    private void moveRight() {
        System.out.println("*** moveRight function called ***");
    }

    private void attack() {
       AttackMenuView attackMenuView = new AttackMenuView();
       attackMenuView.display();
    }

    private void launchNuke() {
       LaunchNuke launchNuke = new LaunchNuke();
       launchNuke.display();
    }
    
    private String lineTop(
            Location A, Location B,
            Location C, Location D,
            Location E, Location F,
            Location G, Location H,
            Location I, Location J) {
        
        String line = "\n│  │"
                + this.checkHidden(A, A.getSymTop())
                + "│"    + this.checkHidden(B, B.getSymTop())
                + "│"    + this.checkHidden(C, C.getSymTop())
                + "│"    + this.checkHidden(D, D.getSymTop())
                + "│"    + this.checkHidden(E, E.getSymTop())
                + "│"    + this.checkHidden(F, F.getSymTop())
                + "│"    + this.checkHidden(G, G.getSymTop())
                + "│"    + this.checkHidden(H, H.getSymTop())
                + "│"    + this.checkHidden(I, I.getSymTop())
                + "│"    + this.checkHidden(J, J.getSymTop()) + "│  ";
        
        return line;
    }
    
    private String lineMid(
            Location A, Location B,
            Location C, Location D,
            Location E, Location F,
            Location G, Location H,
            Location I, Location J) {
        
        String rowNumber = "";
        
        if (A.getRow() < 10)
            rowNumber = " " + A.getRow();
        else
            rowNumber =  "" + A.getRow();
    
        String line = "\n│"
                + rowNumber
                + "│" + this.checkHidden(A, A.getSymMid())
                + this.checkHidden(A, A.getSymbol())
                + this.checkHidden(A, A.getSymMid2())
                + "│"      + this.checkHidden(B, B.getSymMid())
                + this.checkHidden(B, B.getSymbol())
                + this.checkHidden(B, B.getSymMid2())
                + "│"      + this.checkHidden(C, C.getSymMid())
                + this.checkHidden(C, C.getSymbol())
                + this.checkHidden(C, C.getSymMid2())
                + "│"      + this.checkHidden(D, D.getSymMid())
                + this.checkHidden(D, D.getSymbol())
                + this.checkHidden(D, D.getSymMid2())
                + "│"      + this.checkHidden(E, E.getSymMid())
                + this.checkHidden(E, E.getSymbol())
                + this.checkHidden(E, E.getSymMid2())
                + "│"      + this.checkHidden(F, F.getSymMid())
                + this.checkHidden(F, F.getSymbol())
                + this.checkHidden(F, F.getSymMid2())
                + "│"      + this.checkHidden(G, G.getSymMid())
                + this.checkHidden(G, G.getSymbol())
                + this.checkHidden(G, G.getSymMid2())
                + "│"      + this.checkHidden(H, H.getSymMid())
                + this.checkHidden(H, H.getSymbol())
                + this.checkHidden(H, H.getSymMid2())
                + "│"      + this.checkHidden(I, I.getSymMid())
                + this.checkHidden(I, I.getSymbol())
                + this.checkHidden(I, I.getSymMid2())
                + "│"      + this.checkHidden(J, J.getSymMid())
                + this.checkHidden(J, J.getSymbol())
                + this.checkHidden(J, J.getSymMid2())  + "│  ";
        
        return line;
    }
    
        private String lineBot(
            Location A, Location B,
            Location C, Location D,
            Location E, Location F,
            Location G, Location H,
            Location I, Location J) {
        
        String line = "\n│  │"
                + this.checkHidden(A, A.getSymBot())
                + "│"    + this.checkHidden(B, B.getSymBot())
                + "│"    + this.checkHidden(C, C.getSymBot())
                + "│"    + this.checkHidden(D, D.getSymBot())
                + "│"    + this.checkHidden(E, E.getSymBot())
                + "│"    + this.checkHidden(F, F.getSymBot())
                + "│"    + this.checkHidden(G, G.getSymBot())
                + "│"    + this.checkHidden(H, H.getSymBot())
                + "│"    + this.checkHidden(I, I.getSymBot())
                + "│"    + this.checkHidden(J, J.getSymBot()) + "│  ";
        
        return line;
    }
            
            
            
}

   
