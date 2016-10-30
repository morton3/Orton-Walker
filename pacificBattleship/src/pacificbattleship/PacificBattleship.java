/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacificbattleship;


import byui.cit260.pacificBattleship.model.Game;
import byui.cit260.pacificBattleship.model.ShipMenu;
import byui.cit260.pacificBattleship.model.ShipClass;
import byui.cit260.pacificBattleship.model.Collectable;
import byui.cit260.pacificBattleship.model.Upgrade;
import byui.cit260.pacificBattleship.model.Ship;
import byui.cit260.pacificBattleship.model.Invasion;
import byui.cit260.pacificBattleship.model.SalvageShip;
import byui.cit260.pacificBattleship.model.Schematic;
import byui.cit260.pacificBattleship.model.Map;
import byui.cit260.pacificBattleship.model.Location;
import byui.cit260.pacificBattleship.model.NuclearPart;
import byui.cit260.pacificBattleship.model.Scene;
import byui.cit260.pacificBattleship.model.Trap;
import byui.cit260.pacificBattleship.model.Base;
import byui.cit260.pacificBattleship.view.StartProgramView;
import byui.cit260.pacificBattleship.view.CommandMenu;
/**
 *
 * @author ort09
 */
public class PacificBattleship {
    private static Game currentGame = null;
    private static Game player = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        PacificBattleship.currentGame = currentGame;
    }

    public static Game getPlayer() {
        return player;
    }

    public static void setPlayer(Game player) {
        PacificBattleship.player = player;
    }
    

    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
        
        
        
        
 

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
    

        
    ShipMenu Player = new ShipMenu();
    Player.setUserRank("* * * * *");
    Player.setUserName(player.getUserName());
    Player.setShipLevel("Heavy Carrier");
    Player.setShipClass("Aircraft Carrier");
    Player.setShipName("U.S.S. TENNESSEE");
    Player.setShipAttack(5);
    Player.setShipAccuracy(75);
    Player.setShipDefense(1);
    Player.setCurrentHull(3);
    Player.setMaxHull(8);
    Player.setCurrentPart(1);
    Player.setPOWs(12);
    
         CommandMenu shipMenu = new CommandMenu();
         shipMenu.commandMenu(Player, 
                              A01, A02, A03, A04, A05, A06, A07, A08, A09, A10, 
                              B01, B02, B03, B04, B05, B06, B07, B08, B09, B10, 
                              C01, C02, C03, C04, C05, C06, C07, C08, C09, C10, 
                              D01, D02, D03, D04, D05, D06, D07, D08, D09, D10, 
                              E01, E02, E03, E04, E05, E06, E07, E08, E09, E10, 
                              F01, F02, F03, F04, F05, F06, F07, F08, F09, F10, 
                              G01, G02, G03, G04, G05, G06, G07, G08, G09, G10, 
                              H01, H02, H03, H04, H05, H06, H07, H08, H09, H10, 
                              I01, I02, I03, I04, I05, I06, I07, I08, I09, I10, 
                              J01, J02, J03, J04, J05, J06, J07, J08, J09, J10);
   
    }  
}
