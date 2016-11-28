/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.view;

import byui.cit260.pacificBattleship.model.Collectable;
import byui.cit260.pacificBattleship.model.Location;
import byui.cit260.pacificBattleship.model.Map;
import pacificbattleship.PacificBattleship;

/**
 *
 * @author ort09
 */
public class SchematicPiecesView extends View{
    
    public SchematicPiecesView() {
        
        super(    "\n"
                + "\n--------------------------------------------------"
                + "\n| Count Pieces                                   |"
                + "\n--------------------------------------------------"
                + "\n| Would you like to see the remaining schematic  |"
                + "\n| pieces in the game?                            |"
                + "\n|                                                |"
                + "\n| Y - Yes                                        |"
                + "\n| Q - Return to Command Menu                     |"
                + "\n--------------------------------------------------");
    }
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        switch (value){
            case "Y":
                this.listPieces();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }

    private void listPieces() {
        
        Location[][] locations = PacificBattleship.getCurrentGame().getMap().getLocations();
        
        String message = "Schematics Remaining:\n";
        
        boolean empty = true;
        
        for (Location[] row : locations) {
            for (Location location : row){
                if (location.getCollectable().getCollectableType().equals("schematicPiece") && location.getCollectable().isActive())
                        message += location.getCollectable().getName() + "\n";
                    empty = false;
                }
            }
        
        if (empty)
            message = "No schematics left!\n";
        
        System.out.println(message);
    }
}
