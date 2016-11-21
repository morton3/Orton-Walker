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
            
            
            
}
