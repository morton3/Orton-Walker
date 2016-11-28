/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.control;

/**
 *
 * @author Nathan
 */
public enum ScrapShip {
    battleshipScrap1("scrap battleship"),
    battleshipScrap2("scrap battleship"),
    battleshipScrap3("scrap battleship"),
    transportScrap1("scrap transport"),
    transportScrap2("scrap transport"),
    transportScrap3("scrap transport"),
    submarineScrap1("scrap submarinet"),
    submarineScrap2("scrap submarinet"),
    submarineScrap3("scrap submarinet"),
    aircraftCarrierScrap1("scrap aircraftCarrier"),
    aircraftCarrierScrap2("scrap aircraftCarrier"),
    aircraftCarrierScrap3("scrap aircraftCarrier"),
    destroyerScrap1("scrap aircraftCarrier"),
    destroyerScrap2("scrap aircraftCarrier"),
    destroyerScrap3("scrap aircraftCarrier");
    
    
    private String description;
    
    
    private ScrapShip(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    
}
