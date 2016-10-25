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
//<editor-fold defaultstate="collapsed" desc="comment">
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

    /**
     * @param args the command line arguments
     */
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
    
         CommandMenu shipMenu = new CommandMenu();
         shipMenu.commandMenu(A01, A02, A03, A04, A05, A06, A07, A08, A09, A10, 
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
