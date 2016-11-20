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
        
        sideMenu[0] = rank;
        sideMenu[1] = userName;
        sideMenu[2] = shipClass;
        sideMenu[3] = shipType;
        sideMenu[4] = shipName;
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
               
               
        for (Location[] row : locations) {
            wholeMap += "\n├--┼-------┼-------┼-------┼-------┼-------┼-------┼-------┼-------┼-------┼-------┤\n"
                    +   "│  ";
            rowNum ++;
                for (Location location : row){
                   wholeMap += "│";
                   if (!location.isHidden()) 
                       wholeMap  +=  location.getScene().getSymTop();
                   else 
                       wholeMap += "???????";
                   
                   }
                wholeMap += "│\n│";
                if (rowNum == 10)
                    wholeMap += "10";
                else 
                    wholeMap += " " + rowNum;
                
                
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
                for (Location location : row){
                     wholeMap += "│";
                              if (!location.isHidden()) 
                     wholeMap  +=  location.getScene().getSymBot();
                   else 
                       wholeMap += "???????";
                }
                
                
                
                
        wholeMap += "│";
        }
    System.out.println(wholeMap);
    System.out.println("└--┴-------┴-------┴-------┴-------┴-------┴-------┴-------┴-------┴-------┴-------┘");
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

    
    
    /*
    private Location cycleLocation(int coordinate,
            Location A01, Location A02, Location A03, Location A04, Location A05, 
            Location A06, Location A07, Location A08, Location A09, Location A10, 
            Location B01, Location B02, Location B03, Location B04, Location B05, 
            Location B06, Location B07, Location B08, Location B09, Location B10, 
            Location C01, Location C02, Location C03, Location C04, Location C05,
            Location C06, Location C07, Location C08, Location C09, Location C10, 
            Location D01, Location D02, Location D03, Location D04, Location D05, 
            Location D06, Location D07, Location D08, Location D09, Location D10, 
            Location E01, Location E02, Location E03, Location E04, Location E05, 
            Location E06, Location E07, Location E08, Location E09, Location E10, 
            Location F01, Location F02, Location F03, Location F04, Location F05, 
            Location F06, Location F07, Location F08, Location F09, Location F10, 
            Location G01, Location G02, Location G03, Location G04, Location G05, 
            Location G06, Location G07, Location G08, Location G09, Location G10, 
            Location H01, Location H02, Location H03, Location H04, Location H05, 
            Location H06, Location H07, Location H08, Location H09, Location H10, 
            Location I01, Location I02, Location I03, Location I04, Location I05, 
            Location I06, Location I07, Location I08, Location I09, Location I10, 
            Location J01, Location J02, Location J03, Location J04, Location J05, 
            Location J06, Location J07, Location J08, Location J09, Location J10){
        
        int row = coordinate / 10;
        int column = coordinate % 10;
        
switch (row) { 
	case 1:
		switch (column){
			case 1:
				return A01;				
			case 2:
				return B01;				
			case 3:
				return C01;				
			case 4:
				return D01;				
			case 5:
				return E01;				
			case 6:
				return F01;				
			case 7:
				return G01;				
			case 8:
				return H01;				
			case 9:
				return I01;				
			case 10:
				return J01;
				}
	case 2:
		switch (column){
			case 1:
				return A02;				
			case 2:
				return B02;				
			case 3:
				return C02;				
			case 4:
				return D02;				
			case 5:
				return E02;				
			case 6:
				return F02;				
			case 7:
				return G02;				
			case 8:
				return H02;				
			case 9:
				return I02;				
			case 10:
				return J02;
				}
	case 3:
		switch (column){
			case 1:
				return A03;				
			case 2:
				return B03;				
			case 3:
				return C03;				
			case 4:
				return D03;				
			case 5:
				return E03;				
			case 6:
				return F03;				
			case 7:
				return G03;				
			case 8:
				return H03;				
			case 9:
				return I03;				
			case 10:
				return J03;
				}
	case 4:
		switch (column){
			case 1:
				return A04;				
			case 2:
				return B04;				
			case 3:
				return C04;				
			case 4:
				return D04;				
			case 5:
				return E04;				
			case 6:
				return F04;				
			case 7:
				return G04;				
			case 8:
				return H04;				
			case 9:
				return I04;				
			case 10:
				return J04;
				}
	case 5:
		switch (column){
			case 1:
				return A05;				
			case 2:
				return B05;				
			case 3:
				return C05;				
			case 4:
				return D05;				
			case 5:
				return E05;				
			case 6:
				return F05;				
			case 7:
				return G05;				
			case 8:
				return H05;				
			case 9:
				return I05;				
			case 10:
				return J05;
				}
	case 6:
		switch (column){
			case 1:
				return A06;				
			case 2:
				return B06;				
			case 3:
				return C06;				
			case 4:
				return D06;				
			case 5:
				return E06;				
			case 6:
				return F06;				
			case 7:
				return G06;				
			case 8:
				return H06;				
			case 9:
				return I06;				
			case 10:
				return J06;
				}
	case 7:
		switch (column){
			case 1:
				return A07;				
			case 2:
				return B07;				
			case 3:
				return C07;				
			case 4:
				return D07;				
			case 5:
				return E07;				
			case 6:
				return F07;				
			case 7:
				return G07;				
			case 8:
				return H07;				
			case 9:
				return I07;				
			case 10:
				return J07;
				}
	case 8:
		switch (column){
			case 1:
				return A08;				
			case 2:
				return B08;				
			case 3:
				return C08;				
			case 4:
				return D08;				
			case 5:
				return E08;				
			case 6:
				return F08;				
			case 7:
				return G08;				
			case 8:
				return H08;				
			case 9:
				return I08;				
			case 10:
				return J08;
				}
	case 9:
		switch (column){
			case 1:
				return A09;				
			case 2:
				return B09;				
			case 3:
				return C09;				
			case 4:
				return D09;				
			case 5:
				return E09;				
			case 6:
				return F09;				
			case 7:
				return G09;				
			case 8:
				return H09;				
			case 9:
				return I09;				
			case 10:
				return J09;
				}
	case 10:
		switch (column){
			case 1:
				return A10;				
			case 2:
				return B10;				
			case 3:
				return C10;				
			case 4:
				return D10;				
			case 5:
				return E10;				
			case 6:
				return F10;				
			case 7:
				return G10;				
			case 8:
				return H10;				
			case 9:
				return I10;				
			case 10:
				return J10;
				}
			}
        return A01;
    }
    
    private void move(Location start, Location end) {
        
        
        System.out.println("***** move function called *****");
        
    }
*/

/*
   public void displayCommandMenuView() {
       
       
       
       boolean done = false;
       do{
           String menuOption = this.getMenuOption();
           if (menuOption.toUpperCase().equals("2"))
               return;
           if (menuOption.toUpperCase().equals("E")) {
               done = this.doAction(menuOption);
               return;
           }
           done = this.doAction(menuOption);
   } while (!done);
            
    }
    
       private String getMenuOption() {
        
           
           
        Scanner keyboard = new Scanner(System.in);
        String value ="";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.map);
            
            value = keyboard.nextLine();
            value = value.trim();
                    
            
            if (value.length() < 1) {
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            break;
        }
        return value;
       }
*/
