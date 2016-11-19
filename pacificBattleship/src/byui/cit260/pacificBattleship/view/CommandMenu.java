/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.view;
import byui.cit260.pacificBattleship.control.GameControl;
import byui.cit260.pacificBattleship.model.Game;
import byui.cit260.pacificBattleship.model.Location;
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
        
    

    Location A01 = new Location();
    Location A02 = new Location();
    Location A03 = new Location();
    Location A04 = new Location();
    Location A05 = new Location();
    Location A06 = new Location();
    Location A07 = new Location();
    Location A08 = new Location();
    Location A09 = new Location();
    Location A10 = new Location();
    Location B01 = new Location();
    Location B02 = new Location();
    Location B03 = new Location();
    Location B04 = new Location();
    Location B05 = new Location();
    Location B06 = new Location();
    Location B07 = new Location();
    Location B08 = new Location();
    Location B09 = new Location();
    Location B10 = new Location();
    Location C01 = new Location();
    Location C02 = new Location();
    Location C03 = new Location();
    Location C04 = new Location();
    Location C05 = new Location();
    Location C06 = new Location();
    Location C07 = new Location();
    Location C08 = new Location();
    Location C09 = new Location();
    Location C10 = new Location();
    Location D01 = new Location();
    Location D02 = new Location();
    Location D03 = new Location();
    Location D04 = new Location();
    Location D05 = new Location();
    Location D06 = new Location();
    Location D07 = new Location();
    Location D08 = new Location();
    Location D09 = new Location();
    Location D10 = new Location();
    Location E01 = new Location();
    Location E02 = new Location();
    Location E03 = new Location();
    Location E04 = new Location();
    Location E05 = new Location();
    Location E06 = new Location();
    Location E07 = new Location();
    Location E08 = new Location();
    Location E09 = new Location();
    Location E10 = new Location();
    Location F01 = new Location();
    Location F02 = new Location();
    Location F03 = new Location();
    Location F04 = new Location();
    Location F05 = new Location();
    Location F06 = new Location();
    Location F07 = new Location();
    Location F08 = new Location();
    Location F09 = new Location();
    Location F10 = new Location();
    Location G01 = new Location();
    Location G02 = new Location();
    Location G03 = new Location();
    Location G04 = new Location();
    Location G05 = new Location();
    Location G06 = new Location();
    Location G07 = new Location();
    Location G08 = new Location();
    Location G09 = new Location();
    Location G10 = new Location();
    Location H01 = new Location();
    Location H02 = new Location();
    Location H03 = new Location();
    Location H04 = new Location();
    Location H05 = new Location();
    Location H06 = new Location();
    Location H07 = new Location();
    Location H08 = new Location();
    Location H09 = new Location();
    Location H10 = new Location();
    Location I01 = new Location();
    Location I02 = new Location();
    Location I03 = new Location();
    Location I04 = new Location();
    Location I05 = new Location();
    Location I06 = new Location();
    Location I07 = new Location();
    Location I08 = new Location();
    Location I09 = new Location();
    Location I10 = new Location();
    Location J01 = new Location();
    Location J02 = new Location();
    Location J03 = new Location();
    Location J04 = new Location();
    Location J05 = new Location();
    Location J06 = new Location();
    Location J07 = new Location();
    Location J08 = new Location();
    Location J09 = new Location();
    Location J10 = new Location();
	A01.setRow(1);
	B01.setRow(1);
	C01.setRow(1);
	D01.setRow(1);
	E01.setRow(1);
	F01.setRow(1);
	G01.setRow(1);
	H01.setRow(1);
	I01.setRow(1);
	J01.setRow(1);
	A02.setRow(2);
	B02.setRow(2);
	C02.setRow(2);
	D02.setRow(2);
	E02.setRow(2);
	F02.setRow(2);
	G02.setRow(2);
	H02.setRow(2);
	I02.setRow(2);
	J02.setRow(2);
	A03.setRow(3);
	B03.setRow(3);
	C03.setRow(3);
	D03.setRow(3);
	E03.setRow(3);
	F03.setRow(3);
	G03.setRow(3);
	H03.setRow(3);
	I03.setRow(3);
	J03.setRow(3);
	A04.setRow(4);
	B04.setRow(4);
	C04.setRow(4);
	D04.setRow(4);
	E04.setRow(4);
	F04.setRow(4);
	G04.setRow(4);
	H04.setRow(4);
	I04.setRow(4);
	J04.setRow(4);
	A05.setRow(5);
	B05.setRow(5);
	C05.setRow(5);
	D05.setRow(5);
	E05.setRow(5);
	F05.setRow(5);
	G05.setRow(5);
	H05.setRow(5);
	I05.setRow(5);
	J05.setRow(5);
	A06.setRow(6);
	B06.setRow(6);
	C06.setRow(6);
	D06.setRow(6);
	E06.setRow(6);
	F06.setRow(6);
	G06.setRow(6);
	H06.setRow(6);
	I06.setRow(6);
	J06.setRow(6);
	A07.setRow(7);
	B07.setRow(7);
	C07.setRow(7);
	D07.setRow(7);
	E07.setRow(7);
	F07.setRow(7);
	G07.setRow(7);
	H07.setRow(7);
	I07.setRow(7);
	J07.setRow(7);
	A08.setRow(8);
	B08.setRow(8);
	C08.setRow(8);
	D08.setRow(8);
	E08.setRow(8);
	F08.setRow(8);
	G08.setRow(8);
	H08.setRow(8);
	I08.setRow(8);
	J08.setRow(8);
	A09.setRow(9);
	B09.setRow(9);
	C09.setRow(9);
	D09.setRow(9);
	E09.setRow(9);
	F09.setRow(9);
	G09.setRow(9);
	H09.setRow(9);
	I09.setRow(9);
	J09.setRow(9);
	A10.setRow(10);
	B10.setRow(10);
	C10.setRow(10);
	D10.setRow(10);
	E10.setRow(10);
	F10.setRow(10);
	G10.setRow(10);
	H10.setRow(10);
	I10.setRow(10);
	J10.setRow(10);
        A01.setColumn(1);
	B01.setColumn(2);
	C01.setColumn(3);
	D01.setColumn(4);
	E01.setColumn(5);
	F01.setColumn(6);
	G01.setColumn(7);
	H01.setColumn(8);
	I01.setColumn(9);
	J01.setColumn(10);
	A02.setColumn(1);
	B02.setColumn(2);
	C02.setColumn(3);
	D02.setColumn(4);
	E02.setColumn(5);
	F02.setColumn(6);
	G02.setColumn(7);
	H02.setColumn(8);
	I02.setColumn(9);
	J02.setColumn(10);
	A03.setColumn(1);
	B03.setColumn(2);
	C03.setColumn(3);
	D03.setColumn(4);
	E03.setColumn(5);
	F03.setColumn(6);
	G03.setColumn(7);
	H03.setColumn(8);
	I03.setColumn(9);
	J03.setColumn(10);
	A04.setColumn(1);
	B04.setColumn(2);
	C04.setColumn(3);
	D04.setColumn(4);
	E04.setColumn(5);
	F04.setColumn(6);
	G04.setColumn(7);
	H04.setColumn(8);
	I04.setColumn(9);
	J04.setColumn(10);
	A05.setColumn(1);
	B05.setColumn(2);
	C05.setColumn(3);
	D05.setColumn(4);
	E05.setColumn(5);
	F05.setColumn(6);
	G05.setColumn(7);
	H05.setColumn(8);
	I05.setColumn(9);
	J05.setColumn(10);
	A06.setColumn(1);
	B06.setColumn(2);
	C06.setColumn(3);
	D06.setColumn(4);
	E06.setColumn(5);
	F06.setColumn(6);
	G06.setColumn(7);
	H06.setColumn(8);
	I06.setColumn(9);
	J06.setColumn(10);
	A07.setColumn(1);
	B07.setColumn(2);
	C07.setColumn(3);
	D07.setColumn(4);
	E07.setColumn(5);
	F07.setColumn(6);
	G07.setColumn(7);
	H07.setColumn(8);
	I07.setColumn(9);
	J07.setColumn(10);
	A08.setColumn(1);
	B08.setColumn(2);
	C08.setColumn(3);
	D08.setColumn(4);
	E08.setColumn(5);
	F08.setColumn(6);
	G08.setColumn(7);
	H08.setColumn(8);
	I08.setColumn(9);
	J08.setColumn(10);
	A09.setColumn(1);
	B09.setColumn(2);
	C09.setColumn(3);
	D09.setColumn(4);
	E09.setColumn(5);
	F09.setColumn(6);
	G09.setColumn(7);
	H09.setColumn(8);
	I09.setColumn(9);
	J09.setColumn(10);
	A10.setColumn(1);
	B10.setColumn(2);
	C10.setColumn(3);
	D10.setColumn(4);
	E10.setColumn(5);
	F10.setColumn(6);
	G10.setColumn(7);
	H10.setColumn(8);
	I10.setColumn(9);
	J10.setColumn(10);
    

        

   
      
        
A01.setSymTop("+++++++");
B01.setSymTop("~~~~~~~");
C01.setSymTop("+++++++");
D01.setSymTop("~~~~~~~");
E01.setSymTop("~~~~~~~");
F01.setSymTop("~~~~~~~");
G01.setSymTop("~~~~~~~");
H01.setSymTop("~~~~~~~");
I01.setSymTop("~~~~~~~");
J01.setSymTop("~~~~~~~");
A01.setSymMid("++"); 
A01.setSymMid2("++");
B01.setSymMid("~~"); 
B01.setSymMid2("~~");
C01.setSymMid("++"); 
C01.setSymMid2("++");
D01.setSymMid("~~"); 
D01.setSymMid2("~~");
E01.setSymMid("~~"); 
E01.setSymMid2("~~");
F01.setSymMid("~~"); 
F01.setSymMid2("~~");
G01.setSymMid("~~"); 
G01.setSymMid2("~~");
H01.setSymMid("~~"); 
H01.setSymMid2("~~");
I01.setSymMid("~~"); 
I01.setSymMid2("~~");
J01.setSymMid("~~"); 
J01.setSymMid2("~~");
A01.setSymBot("+++++++");
B01.setSymBot("~~~~~~~");
C01.setSymBot("+++++++");
D01.setSymBot("~~~~~~~");
E01.setSymBot("~~~~~~~");
F01.setSymBot("~~~~~~~");
G01.setSymBot("~~~~~~~");
H01.setSymBot("~~~~~~~");
I01.setSymBot("~~~~~~~");
J01.setSymBot("~~~~~~~");
A02.setSymTop("+++++++");
B02.setSymTop("++~~~~~");
C02.setSymTop("~~~~~~~");
D02.setSymTop("~~~~~~~");
E02.setSymTop("~~~~~~~");
F02.setSymTop("~~~~~~~");
G02.setSymTop("~~~~~~~");
H02.setSymTop("++++~~~");
I02.setSymTop("~~~~~~~");
J02.setSymTop("~~~~~~~");
A02.setSymMid("++"); 
A02.setSymMid2("++");
B02.setSymMid("~~"); 
B02.setSymMid2("~~");
C02.setSymMid("~~"); 
C02.setSymMid2("~~");
D02.setSymMid("~~"); 
D02.setSymMid2("~~");
E02.setSymMid("~~"); 
E02.setSymMid2("~~");
F02.setSymMid("~~"); 
F02.setSymMid2("~~");
G02.setSymMid("~~"); 
G02.setSymMid2("~~");
H02.setSymMid("++"); 
H02.setSymMid2("++");
I02.setSymMid("~~"); 
I02.setSymMid2("+~");
J02.setSymMid("~~"); 
J02.setSymMid2("~~");
A02.setSymBot("+++++++");
B02.setSymBot("~~~~~~~");
C02.setSymBot("~~~~~~~");
D02.setSymBot("~~~~~+~");
E02.setSymBot("~~~~~~~");
F02.setSymBot("~~~~~~~");
G02.setSymBot("~~~~~~~");
H02.setSymBot("~~+++++");
I02.setSymBot("+~~~~++");
J02.setSymBot("++~~~~~");
A03.setSymTop("+~~~~~~");
B03.setSymTop("~~~~~~~");
C03.setSymTop("~~~~~~~");
D03.setSymTop("~~~~~++");
E03.setSymTop("~~~~~~~");
F03.setSymTop("~~~~~~~");
G03.setSymTop("~~~~~~~");
H03.setSymTop("~~~~~~~");
I03.setSymTop("+~~~~~+");
J03.setSymTop("+++++++");
A03.setSymMid("+~"); 
A03.setSymMid2("~~");
B03.setSymMid("~~"); 
B03.setSymMid2("~~");
C03.setSymMid("~~"); 
C03.setSymMid2("~~");
D03.setSymMid("~~"); 
D03.setSymMid2("~+");
E03.setSymMid("~~"); 
E03.setSymMid2("~~");
F03.setSymMid("~~"); 
F03.setSymMid2("~~");
G03.setSymMid("~~"); 
G03.setSymMid2("~~");
H03.setSymMid("~~"); 
H03.setSymMid2("~~");
I03.setSymMid("~~"); 
I03.setSymMid2("~~");
J03.setSymMid("++"); 
J03.setSymMid2("++");
A03.setSymBot("+~~~~~~");
B03.setSymBot("~~~~~~~");
C03.setSymBot("~~~~~~~");
D03.setSymBot("~~~~~~+");
E03.setSymBot("++~~~~~");
F03.setSymBot("~~~~~~~");
G03.setSymBot("~~~~~~~");
H03.setSymBot("~~~~~~~");
I03.setSymBot("~~~~~~~");
J03.setSymBot("+++++++");
A04.setSymTop("++++++~");
B04.setSymTop("~~~~~~~");
C04.setSymTop("~~~~~~~");
D04.setSymTop("~~~~~~~");
E04.setSymTop("+++++++");
F04.setSymTop("~~~~~~~");
G04.setSymTop("~~~~~~~");
H04.setSymTop("~~~~~~~");
I04.setSymTop("~~~~~~~");
J04.setSymTop("~~~~~~~");
A04.setSymMid("++"); 
A04.setSymMid2("++");
B04.setSymMid("~~"); 
B04.setSymMid2("~~");
C04.setSymMid("~~"); 
C04.setSymMid2("~~");
D04.setSymMid("~~"); 
D04.setSymMid2("~~");
E04.setSymMid("++"); 
E04.setSymMid2("++");
F04.setSymMid("~~"); 
F04.setSymMid2("~~");
G04.setSymMid("~~"); 
G04.setSymMid2("~~");
H04.setSymMid("~~"); 
H04.setSymMid2("~~");
I04.setSymMid("~~"); 
I04.setSymMid2("~~");
J04.setSymMid("~~"); 
J04.setSymMid2("~~");
A04.setSymBot("~++++++");
B04.setSymBot("+~~~~~~");
C04.setSymBot("~~~~~~~");
D04.setSymBot("~~~~~~~");
E04.setSymBot("+++++++");
F04.setSymBot("+~~~~~~");
G04.setSymBot("~~~~~~~");
H04.setSymBot("~~~~~~~");
I04.setSymBot("~~~~~~~");
J04.setSymBot("~~~~~~~");
A05.setSymTop("~~~~~++");
B05.setSymTop("+~~~~~~");
C05.setSymTop("~~~~~~~");
D05.setSymTop("~~~~~~~");
E05.setSymTop("~~~~~++");
F05.setSymTop("+~~~~~~");
G05.setSymTop("~~~~~~~");
H05.setSymTop("~~~~~~~");
I05.setSymTop("~~~~~~~");
J05.setSymTop("~~~~~~~");
A05.setSymMid("~~"); 
A05.setSymMid2("~~");
B05.setSymMid("+~"); 
B05.setSymMid2("~~");
C05.setSymMid("~~"); 
C05.setSymMid2("~~");
D05.setSymMid("~~"); 
D05.setSymMid2("~~");
E05.setSymMid("~~"); 
E05.setSymMid2("~~");
F05.setSymMid("+~"); 
F05.setSymMid2("~~");
G05.setSymMid("~~"); 
G05.setSymMid2("~~");
H05.setSymMid("~~"); 
H05.setSymMid2("~~");
I05.setSymMid("~~"); 
I05.setSymMid2("~~");
J05.setSymMid("~~"); 
J05.setSymMid2("~~");
A05.setSymBot("~~~~~~~");
B05.setSymBot("~~~~~~~");
C05.setSymBot("~~~~~~~");
D05.setSymBot("~~~~~~~");
E05.setSymBot("~~~~~~~");
F05.setSymBot("~~~~~~~");
G05.setSymBot("~~~~~~~");
H05.setSymBot("~~~~~~~");
I05.setSymBot("~~~~~~~");
J05.setSymBot("~~~~~~~");
A06.setSymTop("~~~~~~~");
B06.setSymTop("~~~~~~~");
C06.setSymTop("~~~~~~~");
D06.setSymTop("~~~~~~~");
E06.setSymTop("~~~~~~~");
F06.setSymTop("~~~~~~~");
G06.setSymTop("~~~~~~~");
H06.setSymTop("~~~~~~~");
I06.setSymTop("~~~~~~~");
J06.setSymTop("~~~~~~~");
A06.setSymMid("~~"); 
A06.setSymMid2("~~");
B06.setSymMid("~~"); 
B06.setSymMid2("~~");
C06.setSymMid("~~"); 
C06.setSymMid2("~~");
D06.setSymMid("~~"); 
D06.setSymMid2("~~");
E06.setSymMid("~~"); 
E06.setSymMid2("~~");
F06.setSymMid("~~"); 
F06.setSymMid2("~~");
G06.setSymMid("~~"); 
G06.setSymMid2("~~");
H06.setSymMid("~~"); 
H06.setSymMid2("~~");
I06.setSymMid("~~"); 
I06.setSymMid2("~~");
J06.setSymMid("~~"); 
J06.setSymMid2("~~");
A06.setSymBot("~~~~~~~");
B06.setSymBot("~~~~~~~");
C06.setSymBot("~~~~~~~");
D06.setSymBot("~~~~~~~");
E06.setSymBot("~~~~~~~");
F06.setSymBot("~~~~~~~");
G06.setSymBot("~~~~~~~");
H06.setSymBot("~~~~~~~");
I06.setSymBot("~~~~~~~");
J06.setSymBot("~~~~~~~");
A07.setSymTop("~~~~~~~");
B07.setSymTop("~~~~~~~");
C07.setSymTop("~~~~~~~");
D07.setSymTop("~~~~~~~");
E07.setSymTop("~~~~~~~");
F07.setSymTop("~~~~~~~");
G07.setSymTop("~~~~~~~");
H07.setSymTop("~~~~~~~");
I07.setSymTop("~~~~~~~");
J07.setSymTop("~~~~~~~");
A07.setSymMid("~~"); 
A07.setSymMid2("~~");
B07.setSymMid("~~"); 
B07.setSymMid2("~~");
C07.setSymMid("~~"); 
C07.setSymMid2("~~");
D07.setSymMid("~~"); 
D07.setSymMid2("~~");
E07.setSymMid("~~"); 
E07.setSymMid2("~~");
F07.setSymMid("~~"); 
F07.setSymMid2("~~");
G07.setSymMid("~~"); 
G07.setSymMid2("~~");
H07.setSymMid("~~"); 
H07.setSymMid2("~~");
I07.setSymMid("~~"); 
I07.setSymMid2("~~");
J07.setSymMid("~~"); 
J07.setSymMid2("~~");
A07.setSymBot("~~~~~~~");
B07.setSymBot("~~~~~~~");
C07.setSymBot("~~~~~~~");
D07.setSymBot("~~~~~~~");
E07.setSymBot("~~~~~~~");
F07.setSymBot("~~~~~~~");
G07.setSymBot("~~~~~~~");
H07.setSymBot("~~~~~~~");
I07.setSymBot("~~~~~~~");
J07.setSymBot("~~~~~~~");
A08.setSymTop("~~~~~~~");
B08.setSymTop("~~~~~~~");
C08.setSymTop("~~~~~~~");
D08.setSymTop("~+++++~");
E08.setSymTop("~~~~~~~");
F08.setSymTop("~~~~~~~");
G08.setSymTop("~~+++~~");
H08.setSymTop("~~~~~~~");
I08.setSymTop("~~~~~~~");
J08.setSymTop("~~~~~~~");
A08.setSymMid("+~"); 
A08.setSymMid2("~~");
B08.setSymMid("~~"); 
B08.setSymMid2("~~");
C08.setSymMid("~~"); 
C08.setSymMid2("~~");
D08.setSymMid("++"); 
D08.setSymMid2("++");
E08.setSymMid("~~"); 
E08.setSymMid2("~~");
F08.setSymMid("~~"); 
F08.setSymMid2("~~");
G08.setSymMid("~+"); 
G08.setSymMid2("+~");
H08.setSymMid("~~"); 
H08.setSymMid2("~~");
I08.setSymMid("~~"); 
I08.setSymMid2("~~");
J08.setSymMid("~~"); 
J08.setSymMid2("~~");
A08.setSymBot("+++~~~~");
B08.setSymBot("~~~~~~~");
C08.setSymBot("~~~~~~~");
D08.setSymBot("~+++++~");
E08.setSymBot("~~~~~~~");
F08.setSymBot("~~~~~~~");
G08.setSymBot("~~+++~~");
H08.setSymBot("~~~~~~~");
I08.setSymBot("~~~~~~~");
J08.setSymBot("~~~~~~~");
A09.setSymTop("++++++~");
B09.setSymTop("~~~~~~~");
C09.setSymTop("~~~~~~~");
D09.setSymTop("~~~~~~~");
E09.setSymTop("~~~~~~~");
F09.setSymTop("~~~~~~~");
G09.setSymTop("~~~~~~~");
H09.setSymTop("~~~~~~~");
I09.setSymTop("~~~~~~~");
J09.setSymTop("~~~~~~~");
A09.setSymMid("++"); 
A09.setSymMid2("++");
B09.setSymMid("~~"); 
B09.setSymMid2("~~");
C09.setSymMid("~~"); 
C09.setSymMid2("~~");
D09.setSymMid("+~"); 
D09.setSymMid2("~~");
E09.setSymMid("~~"); 
E09.setSymMid2("~~");
F09.setSymMid("~~"); 
F09.setSymMid2("~~");
G09.setSymMid("~~"); 
G09.setSymMid2("~~");
H09.setSymMid("~~"); 
H09.setSymMid2("~~");
I09.setSymMid("~~"); 
I09.setSymMid2("~~");
J09.setSymMid("~~"); 
J09.setSymMid2("~~");
A09.setSymBot("+++++++");
B09.setSymBot("~~~~~~~");
C09.setSymBot("~~~~~~+");
D09.setSymBot("+~~~~~~");
E09.setSymBot("~~~~~~~");
F09.setSymBot("~~~~~~~");
G09.setSymBot("~~~~~~~");
H09.setSymBot("~~~~~~~");
I09.setSymBot("~~~~~~~");
J09.setSymBot("~~~~~~~");
A10.setSymTop("+++++++");
B10.setSymTop("+~~~~~~");
C10.setSymTop("~++++++");
D10.setSymTop("+~~~~~~");
E10.setSymTop("~~~~~~~");
F10.setSymTop("~+++++~");
G10.setSymTop("~~~~~~~");
H10.setSymTop("~~~~~~~");
I10.setSymTop("~~~~~~~");
J10.setSymTop("~~~~~~~");
A10.setSymMid("++"); 
A10.setSymMid2("++");
B10.setSymMid("+~"); 
B10.setSymMid2("~~");
C10.setSymMid("++"); 
C10.setSymMid2("++");
D10.setSymMid("~~"); 
D10.setSymMid2("~~");
E10.setSymMid("~~"); 
E10.setSymMid2("~+");
F10.setSymMid("++"); 
F10.setSymMid2("++");
G10.setSymMid("~~"); 
G10.setSymMid2("~~");
H10.setSymMid("~~"); 
H10.setSymMid2("~~");
I10.setSymMid("~~"); 
I10.setSymMid2("~~");
J10.setSymMid("~~"); 
J10.setSymMid2("~~");
A10.setSymBot("+++++++");
B10.setSymBot("+++++++");
C10.setSymBot("+++++++");
D10.setSymBot("++~~~~+");
E10.setSymBot("+~~~~++");
F10.setSymBot("+++++++");
G10.setSymBot("~~~~~~~");
H10.setSymBot("~~~~~~~");
I10.setSymBot("~~~~~~~");
J10.setSymBot("~~~~~~~");

A01.setHidden(false);
B01.setHidden(false);
C01.setHidden(false);
D01.setHidden(false);
E01.setHidden(false);
F01.setHidden(false);
G01.setHidden(false);
H01.setHidden(false);
I01.setHidden(false);
J01.setHidden(false);
A02.setHidden(false);
B02.setHidden(false);
C02.setHidden(false);
D02.setHidden(false);
E02.setHidden(false);
F02.setHidden(false);
G02.setHidden(false);
H02.setHidden(false);
I02.setHidden(false);
J02.setHidden(false);
A03.setHidden(false);
B03.setHidden(false);
C03.setHidden(false);
D03.setHidden(false);
E03.setHidden(false);
F03.setHidden(false);
G03.setHidden(false);
H03.setHidden(false);
I03.setHidden(false);
J03.setHidden(false);
A04.setHidden(false);
B04.setHidden(false);
C04.setHidden(false);
D04.setHidden(false);
E04.setHidden(false);
F04.setHidden(false);
G04.setHidden(false);
H04.setHidden(false);
I04.setHidden(false);
J04.setHidden(false);
A05.setHidden(false);
B05.setHidden(false);
C05.setHidden(false);
D05.setHidden(false);
E05.setHidden(false);
F05.setHidden(false);
G05.setHidden(false);
H05.setHidden(false);
I05.setHidden(false);
J05.setHidden(false);
A06.setHidden(false);
B06.setHidden(false);
C06.setHidden(false);
D06.setHidden(false);
E06.setHidden(false);
F06.setHidden(false);
G06.setHidden(false);
H06.setHidden(false);
I06.setHidden(false);
J06.setHidden(false);
A07.setHidden(false);
B07.setHidden(false);
C07.setHidden(false);
D07.setHidden(false);
E07.setHidden(false);
F07.setHidden(false);
G07.setHidden(false);
H07.setHidden(false);
I07.setHidden(false);
J07.setHidden(false);
A08.setHidden(false);
B08.setHidden(false);
C08.setHidden(false);
D08.setHidden(false);
E08.setHidden(false);
F08.setHidden(false);
G08.setHidden(false);
H08.setHidden(false);
I08.setHidden(false);
J08.setHidden(false);
A09.setHidden(false);
B09.setHidden(false);
C09.setHidden(false);
D09.setHidden(false);
E09.setHidden(false);
F09.setHidden(false);
G09.setHidden(false);
H09.setHidden(false);
I09.setHidden(false);
J09.setHidden(false);
A10.setHidden(false);
B10.setHidden(false);
C10.setHidden(false);
D10.setHidden(false);
E10.setHidden(false);
F10.setHidden(false);
G10.setHidden(false);
H10.setHidden(false);
I10.setHidden(false);
J10.setHidden(false);

A01.setSymbol("   ");
B01.setSymbol("   ");
C01.setSymbol("   ");
D01.setSymbol("   ");
E01.setSymbol("   ");
F01.setSymbol("   ");
G01.setSymbol("   ");
H01.setSymbol("   ");
I01.setSymbol("   ");
J01.setSymbol("   ");
A02.setSymbol("   ");
B02.setSymbol("   ");
C02.setSymbol("   ");
D02.setSymbol("   ");
E02.setSymbol("   ");
F02.setSymbol("   ");
G02.setSymbol("   ");
H02.setSymbol("   ");
I02.setSymbol("   ");
J02.setSymbol("   ");
A03.setSymbol("   ");
B03.setSymbol("   ");
C03.setSymbol("   ");
D03.setSymbol("   ");
E03.setSymbol("   ");
F03.setSymbol("   ");
G03.setSymbol("   ");
H03.setSymbol("   ");
I03.setSymbol(shipSymbol);
J03.setSymbol("   ");
A04.setSymbol("   ");
B04.setSymbol("   ");
C04.setSymbol("   ");
D04.setSymbol("   ");
E04.setSymbol("   ");
F04.setSymbol("   ");
G04.setSymbol("   ");
H04.setSymbol("   ");
I04.setSymbol("   ");
J04.setSymbol("   ");
A05.setSymbol("   ");
B05.setSymbol("   ");
C05.setSymbol("   ");
D05.setSymbol("   ");
E05.setSymbol("   ");
F05.setSymbol("   ");
G05.setSymbol("   ");
H05.setSymbol("   ");
I05.setSymbol("   ");
J05.setSymbol("   ");
A06.setSymbol("   ");
B06.setSymbol("   ");
C06.setSymbol("   ");
D06.setSymbol("   ");
E06.setSymbol("   ");
F06.setSymbol("   ");
G06.setSymbol("   ");
H06.setSymbol("   ");
I06.setSymbol("   ");
J06.setSymbol("   ");
A07.setSymbol("   ");
B07.setSymbol("   ");
C07.setSymbol("   ");
D07.setSymbol("   ");
E07.setSymbol("   ");
F07.setSymbol("   ");
G07.setSymbol("   ");
H07.setSymbol("   ");
I07.setSymbol("   ");
J07.setSymbol("   ");
A08.setSymbol("   ");
B08.setSymbol("   ");
C08.setSymbol("   ");
D08.setSymbol("   ");
E08.setSymbol("   ");
F08.setSymbol("   ");
G08.setSymbol("   ");
H08.setSymbol("   ");
I08.setSymbol("   ");
J08.setSymbol("   ");
A09.setSymbol("   ");
B09.setSymbol("   ");
C09.setSymbol("   ");
D09.setSymbol("   ");
E09.setSymbol("   ");
F09.setSymbol("   ");
G09.setSymbol("   ");
H09.setSymbol("   ");
I09.setSymbol("   ");
J09.setSymbol("   ");
A10.setSymbol("   ");
B10.setSymbol("   ");
C10.setSymbol("   ");
D10.setSymbol("   ");
E10.setSymbol("   ");
F10.setSymbol("   ");
G10.setSymbol("   ");
H10.setSymbol("   ");
I10.setSymbol("   ");
J10.setSymbol("   ");

System.out.println(
                  "┌--┬-------┬-------┬-------┬-------┬-------┬-------┬-------┬-------┬-------┬-------┐\n"
                + "│>>│   A   │   B   │   C   │   D   │   E   │   F   │   G   │   H   │   I   │   J   │\n"
                + "├--┼-------┼-------┼-------┼-------┼-------┼-------┼-------┼-------┼-------┼-------┤"
                + this.lineTop(A01, B01, C01, D01, E01, F01, G01, H01, I01, J01)
                + rank
                + this.lineMid(A01, B01, C01, D01, E01, F01, G01, H01, I01, J01)
                + userName
                + this.lineBot(A01, B01, C01, D01, E01, F01, G01, H01, I01, J01)
                + shipName
                + "\n├--┼-------┼-------┼-------┼-------┼-------┼-------┼-------┼-------┼-------┼-------┤  "
                + shipType
                + this.lineTop(A02, B02, C02, D02, E02, F02, G02, H02, I02, J02)
                + shipClass
                + this.lineMid(A02, B02, C02, D02, E02, F02, G02, H02, I02, J02)
                + this.lineBot(A02, B02, C02, D02, E02, F02, G02, H02, I02, J02)
                + "ATTACK »»»»»»»» " + shipAttack
                + "\n├--┼-------┼-------┼-------┼-------┼-------┼-------┼-------┼-------┼-------┼-------┤  "
                + "ACCURACY »»»»»» " + shipAccuracy
                + this.lineTop(A03, B03, C03, D03, E03, F03, G03, H03, I03, J03)
                + "DEFENCE »»»»»»» "
                + defense
                + this.lineMid(A03, B03, C03, D03, E03, F03, G03, H03, I03, J03)
                + "POW's »»»»»»»»» "
                + POWs
                + this.lineBot(A03, B03, C03, D03, E03, F03, G03, H03, I03, J03)
                + "\n├--┼-------┼-------┼-------┼-------┼-------┼-------┼-------┼-------┼-------┼-------┤  "
                + "┌──────────────┐"
                + this.lineTop(A04, B04, C04, D04, E04, F04, G04, H04, I04, J04)
                + "│ HULL       "
                + hull
                + " / "
                + maxHull
                + this.lineMid(A04, B04, C04, D04, E04, F04, G04, H04, I04, J04)
                + this.topHull(ship.getMaxHull())
                + this.lineBot(A04, B04, C04, D04, E04, F04, G04, H04, I04, J04)
                + this.MidTopHull(ship.getHull(), ship.getMaxHull())
                + "\n├--┼-------┼-------┼-------┼-------┼-------┼-------┼-------┼-------┼-------┼-------┤  "
                + this.MidHull(ship.getMaxHull())
                + this.lineTop(A05, B05, C05, D05, E05, F05, G05, H05, I05, J05)
                + this.MidBotHull(ship.getHull(), ship.getMaxHull())
                + this.lineMid(A05, B05, C05, D05, E05, F05, G05, H05, I05, J05)
                + this.BotHull(ship.getMaxHull())
                + this.lineBot(A05, B05, C05, D05, E05, F05, G05, H05, I05, J05)
                + "4 - Attack"
                + "\n├--┼-------┼-------┼-------┼-------┼-------┼-------┼-------┼-------┼-------┼-------┤  "
                + "E - Switch Ships"
                + this.lineTop(A06, B06, C06, D06, E06, F06, G06, H06, I06, J06)
                + "R - Upgrade"
                + this.lineMid(A06, B06, C06, D06, E06, F06, G06, H06, I06, J06)
                + "Q - Back to Main Menu"
                + this.lineBot(A06, B06, C06, D06, E06, F06, G06, H06, I06, J06)
                + "W - Move Up"
                + "\n├--┼-------┼-------┼-------┼-------┼-------┼-------┼-------┼-------┼-------┼-------┤  "
                + "S - Move Down"
                + this.lineTop(A07, B07, C07, D07, E07, F07, G07, H07, I07, J07)
                + "A - Move Left"
                + this.lineMid(A07, B07, C07, D07, E07, F07, G07, H07, I07, J07)
                + "D - Move Right"
                + this.lineBot(A07, B07, C07, D07, E07, F07, G07, H07, I07, J07)
                + ""
                + "\n├--┼-------┼-------┼-------┼-------┼-------┼-------┼-------┼-------┼-------┼-------┤  "
                + "L - Launch Nuclear Bomb"
                + this.lineTop(A08, B08, C08, D08, E08, F08, G08, H08, I08, J08)
                + "    Parts: " + currentPart + " / 15 Parts"
                + this.lineMid(A08, B08, C08, D08, E08, F08, G08, H08, I08, J08)
                + this.lineBot(A08, B08, C08, D08, E08, F08, G08, H08, I08, J08)
                + "\n├--┼-------┼-------┼-------┼-------┼-------┼-------┼-------┼-------┼-------┼-------┤  "
                + this.lineTop(A09, B09, C09, D09, E09, F09, G09, H09, I09, J09)
                + this.lineMid(A09, B09, C09, D09, E09, F09, G09, H09, I09, J09)
                + this.lineBot(A09, B09, C09, D09, E09, F09, G09, H09, I09, J09)
                + "\n├--┼-------┼-------┼-------┼-------┼-------┼-------┼-------┼-------┼-------┼-------┤  "
                + this.lineTop(A10, B10, C10, D10, E10, F10, G10, H10, I10, J10)
                + this.lineMid(A10, B10, C10, D10, E10, F10, G10, H10, I10, J10)
                + this.lineBot(A10, B10, C10, D10, E10, F10, G10, H10, I10, J10)
                + "\n└--┴-------┴-------┴-------┴-------┴-------┴-------┴-------┴-------┴-------┴-------┘");
        
    
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
