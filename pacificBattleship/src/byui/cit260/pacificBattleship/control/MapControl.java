/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.control;

import byui.cit260.pacificBattleship.model.Base;
import byui.cit260.pacificBattleship.model.NukeParts;
import byui.cit260.pacificBattleship.model.Collectable;
import byui.cit260.pacificBattleship.model.CollectableType;
import byui.cit260.pacificBattleship.model.Location;
import byui.cit260.pacificBattleship.model.Map;
import byui.cit260.pacificBattleship.model.Scene;
import byui.cit260.pacificBattleship.model.SceneType;
import byui.cit260.pacificBattleship.model.Ship;

import java.util.Random;

import byui.cit260.pacificBattleship.model.ShipClass;

import pacificbattleship.PacificBattleship;
import byui.cit260.pacificBattleship.model.Base;
import byui.cit260.pacificBattleship.model.BaseList;

/**
 *
 * @author ort09
 */
public class MapControl {

    public static Map createMap() {
        Map map = new Map(10, 10);

        Scene[] scenes = createScenes();

        Collectable[] collectables = createCollectables();
        
        PacificBattleship.getCurrentGame().setCollectables(collectables);

        GameControl.assignScenesToLocations(map, scenes);

        GameControl.assignCollectablesToLocations(map, collectables);

        return map;
    }

    private static Scene[] createScenes() {
        Scene[] scenes = new Scene[SceneType.values().length];

        Scene water = new Scene();
        String waterSymTop = "~~~~~~~";
        String[] waterSymMid = {"~~", "~~"};
        String waterSymBot = "~~~~~~~";
        water.setDescription("Pacific Ocean that navy ships travel on");
        water.setActive(true);
        water.setSymTop(waterSymTop);
        water.setSymMid(waterSymMid);
        water.setSymBot(waterSymBot);
        scenes[SceneType.water.ordinal()] = water;

        Scene land = new Scene();
        String landSymTop = "+++++++";
        String[] landSymMid = {"++", "++"};
        String landSymBot = "+++++++";
        land.setDescription("Islands in the Pacific Ocean");
        land.setActive(false);
        land.setSymTop(landSymTop);
        land.setSymMid(landSymMid);
        land.setSymBot(landSymBot);
        scenes[SceneType.land.ordinal()] = land;
        
        Scene shoreTop = new Scene();
        String shoreTopSymTop = "+++++++";
        String[] shoreTopSymMid = {"~~", "~~"};
        String shoreTopSymBot = "~~~~~~~";
        shoreTop.setDescription("Pacific Ocean with land above it");
        shoreTop.setActive(true);
        shoreTop.setSymTop(shoreTopSymTop);
        shoreTop.setSymMid(shoreTopSymMid);
        shoreTop.setSymBot(shoreTopSymBot);
        scenes[SceneType.shoreTop.ordinal()] = shoreTop;
        
        Scene shoreRight = new Scene();
        String shoreRightSymTop = "~~~~~~+";
        String[] shoreRightSymMid = {"~~", "~+"};
        String shoreRightSymBot = "~~~~~~+";
        shoreRight.setDescription("Pacific Ocean with land to the right of it");
        shoreRight.setActive(true);
        shoreRight.setSymTop(shoreRightSymTop);
        shoreRight.setSymMid(shoreRightSymMid);
        shoreRight.setSymBot(shoreRightSymBot);
        scenes[SceneType.shoreRight.ordinal()] = shoreRight;
        
        Scene shoreBottom = new Scene();
        String shoreBottomSymTop = "~~~~~~~";
        String[] shoreBottomSymMid = {"~~", "~~"};
        String shoreBottomSymBot = "+++++++";
        shoreBottom.setDescription("Pacific Ocean with land below it");
        shoreBottom.setActive(true);
        shoreBottom.setSymTop(shoreBottomSymTop);
        shoreBottom.setSymMid(shoreBottomSymMid);
        shoreBottom.setSymBot(shoreBottomSymBot);
        scenes[SceneType.shoreBottom.ordinal()] = shoreBottom;
        
        Scene shoreLeft = new Scene();
        String shoreLeftSymTop = "+~~~~~~";
        String[] shoreLeftSymMid = {"+~", "~~"};
        String shoreLeftSymBot = "+~~~~~~";
        shoreLeft.setDescription("Pacific Ocean with land to the left of it");
        shoreLeft.setActive(true);
        shoreLeft.setSymTop(shoreLeftSymTop);
        shoreLeft.setSymMid(shoreLeftSymMid);
        shoreLeft.setSymBot(shoreLeftSymBot);
        scenes[SceneType.shoreLeft.ordinal()] = shoreLeft;
        
        Scene verticalPass = new Scene();
        String verticalPassSymTop = "+~~~~~+";
        String[] verticalPassSymMid = {"+~", "~+"};
        String verticalPassSymBot = "+~~~~~+";
        verticalPass.setDescription("Pacific Ocean with land to the left and right of it");
        verticalPass.setActive(true);
        verticalPass.setSymTop(verticalPassSymTop);
        verticalPass.setSymMid(verticalPassSymMid);
        verticalPass.setSymBot(verticalPassSymBot);
        scenes[SceneType.verticalPass.ordinal()] = verticalPass;
        
        Scene horizontalPass = new Scene();
        String horizontalPassSymTop = "+++++++";
        String[] horizontalPassSymMid = {"~~", "~~"};
        String horizontalPassSymBot = "+++++++";
        horizontalPass.setDescription("Pacific Ocean with land above and below it");
        horizontalPass.setActive(true);
        horizontalPass.setSymTop(horizontalPassSymTop);
        horizontalPass.setSymMid(horizontalPassSymMid);
        horizontalPass.setSymBot(horizontalPassSymBot);
        scenes[SceneType.horizontalPass.ordinal()] = horizontalPass;
        
        Scene pearlHarbor = new Scene();
        String pearlHarborSymTop = "PE| |RL";
        String[] pearlHarborSymMid = {"->", "<-"};
        String pearlHarborSymBot = "HR| |BR";
        pearlHarbor.setDescription("Pearl Harbor Naval Base");
        pearlHarbor.setActive(true);
        pearlHarbor.setSymTop(pearlHarborSymTop);
        pearlHarbor.setSymMid(pearlHarborSymMid);
        pearlHarbor.setSymBot(pearlHarborSymBot);
        scenes[SceneType.pearlHarbor.ordinal()] = pearlHarbor;

        return scenes;
    }

    private static Collectable[] createCollectables() {
        Collectable[] collectables = new Collectable[CollectableType.values().length];

        Collectable empty = new Collectable();
        empty.setName("<empty>");
        empty.setCollectableType("<empty>");
        empty.setActive(false);

        Collectable schematicBattleship2 = new Collectable();
        schematicBattleship2.setCollectableType("schematicPiece");
        schematicBattleship2.setName("Battleship Class 2 Collectable");
        schematicBattleship2.setShipClass(ShipClass.battleship2);
        collectables[CollectableType.schematicBattleship2.ordinal()] = schematicBattleship2;
        schematicBattleship2.setActive(true);

        Collectable schematicBattleship3 = new Collectable();
        schematicBattleship3.setCollectableType("schematicPiece");
        schematicBattleship3.setName("Battleship Class 3 Collectable");
        schematicBattleship3.setShipClass(ShipClass.battleship3);
        collectables[CollectableType.schematicBattleship3.ordinal()] = schematicBattleship3;
        schematicBattleship3.setActive(true);

        Collectable schematicTransport2 = new Collectable();
        schematicTransport2.setCollectableType("schematicPiece");
        schematicTransport2.setName("Transport Class 2 Collectable");
        schematicTransport2.setShipClass(ShipClass.transport2);
        collectables[CollectableType.schematicTransport2.ordinal()] = schematicTransport2;
        schematicTransport2.setActive(true);

        Collectable schematicTransport3 = new Collectable();
        schematicTransport3.setCollectableType("schematicPiece");
        schematicTransport3.setName("Transport Class 3 Collectable");
        schematicTransport3.setShipClass(ShipClass.transport3);
        collectables[CollectableType.schematicTransport3.ordinal()] = schematicTransport3;
        schematicTransport3.setActive(true);

        Collectable schematicSubmarine2 = new Collectable();
        schematicSubmarine2.setCollectableType("schematicPiece");
        schematicSubmarine2.setName("Submarine Class 2 Collectable");
        schematicSubmarine2.setShipClass(ShipClass.submarine2);
        collectables[CollectableType.schematicSubmarine2.ordinal()] = schematicSubmarine2;
        schematicSubmarine2.setActive(true);

        Collectable schematicSubmarine3 = new Collectable();
        schematicSubmarine3.setCollectableType("schematicPiece");
        schematicSubmarine3.setName("Submarine Class 3 Collectable");
        schematicSubmarine3.setShipClass(ShipClass.submarine3);
        collectables[CollectableType.schematicSubmarine3.ordinal()] = schematicSubmarine3;
        schematicSubmarine3.setActive(true);

        Collectable schematicAircraftCarrier2 = new Collectable();
        schematicAircraftCarrier2.setCollectableType("schematicPiece");
        schematicAircraftCarrier2.setName("Aircraft Carrier Class 2 Collectable");
        schematicAircraftCarrier2.setShipClass(ShipClass.aircraftCarrier2);
        collectables[CollectableType.schematicAircraftCarrier2.ordinal()] = schematicAircraftCarrier2;
        schematicAircraftCarrier2.setActive(true);

        Collectable schematicAircraftCarrier3 = new Collectable();
        schematicAircraftCarrier3.setCollectableType("schematicPiece");
        schematicAircraftCarrier3.setName("Aircraft Carrier Class 3 Collectable");
        schematicAircraftCarrier3.setShipClass(ShipClass.aircraftCarrier3);
        collectables[CollectableType.schematicAircraftCarrier3.ordinal()] = schematicAircraftCarrier3;
        schematicAircraftCarrier3.setActive(true);

        Collectable schematicDestroyer2 = new Collectable();
        schematicDestroyer2.setCollectableType("schematicPiece");
        schematicDestroyer2.setName("Destroyer Class 2 Collectable");
        schematicDestroyer2.setShipClass(ShipClass.destroyer2);
        collectables[CollectableType.schematicDestroyer2.ordinal()] = schematicDestroyer2;
        schematicDestroyer2.setActive(true);

        Collectable schematicDestroyer3 = new Collectable();
        schematicDestroyer3.setCollectableType("schematicPiece");
        schematicDestroyer3.setName("Destroyer Class 3 Collectable");
        schematicDestroyer3.setShipClass(ShipClass.destroyer3);
        collectables[CollectableType.schematicDestroyer3.ordinal()] = schematicDestroyer3;
        schematicDestroyer3.setActive(true);

        return collectables;
    }

    static void assignNukesPartsToLocation(Location[][] mapLocations) {
        //for all Nuke parts
        NukeParts[] parts = NukeParts.values();
        {
            Random randomRow = new Random();
            Random randomColumn = new Random();
            for (int i = 0; i < parts.length; i++) {

                //random row
                int row = randomRow.nextInt(10);

                //randomm column
                int column = randomColumn.nextInt(10);
                //get location at random row and random column
                Location mapLocation = mapLocations[row][column];
                //assign current random Nuke part to locations
                mapLocation.setNukePart(parts[i]);
            }

        }

    }

    static void assignBaseToLocation() {
        Base[] base = new Base[BaseList.values().length];
        Location[][] locations = PacificBattleship.getCurrentGame().getMap().getLocations();
        
        Base pearlHarbor = new Base();
        pearlHarbor.setDescription("Pearl Harbor Naval Base");
        base[BaseList.base1.ordinal()] = pearlHarbor;
        locations[2][9].setBase(base[BaseList.base1.ordinal()]);
        
        Base base2 = new Base();
        base2.setDescription("Base2");
        base[BaseList.base2.ordinal()] = base2;
        //locations[2][9].setBase(base[BaseList.base1.ordinal()]);
        
        Base base3 = new Base();
        base2.setDescription("Base3");
        base[BaseList.base3.ordinal()] = base3;
        
        Base base4 = new Base();
        base2.setDescription("Base4");
        base[BaseList.base4.ordinal()] = base4;
        
        Base base5 = new Base();
        base2.setDescription("Base5");
        base[BaseList.base5.ordinal()] = base5;
        
        Base base6 = new Base();
        base2.setDescription("Base6");
        base[BaseList.base6.ordinal()] = base6;
        
        Base base7 = new Base();
        base2.setDescription("Base7");
        base[BaseList.base7.ordinal()] = base7;
        
        Base base8 = new Base();
        base2.setDescription("Base8");
        base[BaseList.base8.ordinal()] = base8;
        
        Base base9 = new Base();
        base2.setDescription("Base9");
        base[BaseList.base9.ordinal()] = base9;
        
        Base base10 = new Base();
        base2.setDescription("Base10");
        base[BaseList.base10.ordinal()] = base10;
        
        Base base11 = new Base();
        base2.setDescription("Base11");
        base[BaseList.base11.ordinal()] = base11;
        
        Base base12 = new Base();
        base2.setDescription("Base12");
        base[BaseList.base12.ordinal()] = base12;
        
        }

}
