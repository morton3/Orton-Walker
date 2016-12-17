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
import byui.cit260.pacificBattleship.model.ShipList;

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
        schematicBattleship2.setShip(PacificBattleship.getCurrentGame().getShip()[ShipList.battleship.ordinal()]);
        schematicBattleship2.setShipClass(ShipClass.battleship2);
        collectables[CollectableType.schematicBattleship2.ordinal()] = schematicBattleship2;
        schematicBattleship2.setActive(false);

        Collectable schematicBattleship3 = new Collectable();
        schematicBattleship3.setCollectableType("schematicPiece");
        schematicBattleship3.setName("Battleship Class 3 Collectable");
        schematicBattleship3.setShip(PacificBattleship.getCurrentGame().getShip()[ShipList.battleship.ordinal()]);
        schematicBattleship3.setShipClass(ShipClass.battleship3);
        collectables[CollectableType.schematicBattleship3.ordinal()] = schematicBattleship3;
        schematicBattleship3.setActive(false);

        Collectable schematicTransport2 = new Collectable();
        schematicTransport2.setCollectableType("schematicPiece");
        schematicTransport2.setName("Transport Class 2 Collectable");
        schematicTransport2.setShip(PacificBattleship.getCurrentGame().getShip()[ShipList.transport.ordinal()]);
        schematicTransport2.setShipClass(ShipClass.transport2);
        collectables[CollectableType.schematicTransport2.ordinal()] = schematicTransport2;
        schematicTransport2.setActive(false);

        Collectable schematicTransport3 = new Collectable();
        schematicTransport3.setCollectableType("schematicPiece");
        schematicTransport3.setName("Transport Class 3 Collectable");
        schematicTransport3.setShip(PacificBattleship.getCurrentGame().getShip()[ShipList.transport.ordinal()]);
        schematicTransport3.setShipClass(ShipClass.transport3);
        collectables[CollectableType.schematicTransport3.ordinal()] = schematicTransport3;
        schematicTransport3.setActive(false);

        Collectable schematicSubmarine2 = new Collectable();
        schematicSubmarine2.setCollectableType("schematicPiece");
        schematicSubmarine2.setName("Submarine Class 2 Collectable");
        schematicSubmarine2.setShip(PacificBattleship.getCurrentGame().getShip()[ShipList.submarine.ordinal()]);
        schematicSubmarine2.setShipClass(ShipClass.submarine2);
        collectables[CollectableType.schematicSubmarine2.ordinal()] = schematicSubmarine2;
        schematicSubmarine2.setActive(false);

        Collectable schematicSubmarine3 = new Collectable();
        schematicSubmarine3.setCollectableType("schematicPiece");
        schematicSubmarine3.setName("Submarine Class 3 Collectable");
        schematicSubmarine3.setShip(PacificBattleship.getCurrentGame().getShip()[ShipList.submarine.ordinal()]);
        schematicSubmarine3.setShipClass(ShipClass.submarine3);
        collectables[CollectableType.schematicSubmarine3.ordinal()] = schematicSubmarine3;
        schematicSubmarine3.setActive(false);

        Collectable schematicAircraftCarrier2 = new Collectable();
        schematicAircraftCarrier2.setCollectableType("schematicPiece");
        schematicAircraftCarrier2.setName("Aircraft Carrier Class 2 Collectable");
        schematicAircraftCarrier2.setShip(PacificBattleship.getCurrentGame().getShip()[ShipList.aircraftCarrier.ordinal()]);
        schematicAircraftCarrier2.setShipClass(ShipClass.aircraftCarrier2);
        collectables[CollectableType.schematicAircraftCarrier2.ordinal()] = schematicAircraftCarrier2;
        schematicAircraftCarrier2.setActive(false);

        Collectable schematicAircraftCarrier3 = new Collectable();
        schematicAircraftCarrier3.setCollectableType("schematicPiece");
        schematicAircraftCarrier3.setName("Aircraft Carrier Class 3 Collectable");
        schematicAircraftCarrier3.setShip(PacificBattleship.getCurrentGame().getShip()[ShipList.aircraftCarrier.ordinal()]);
        schematicAircraftCarrier3.setShipClass(ShipClass.aircraftCarrier3);
        collectables[CollectableType.schematicAircraftCarrier3.ordinal()] = schematicAircraftCarrier3;
        schematicAircraftCarrier3.setActive(false);

        Collectable schematicDestroyer2 = new Collectable();
        schematicDestroyer2.setCollectableType("schematicPiece");
        schematicDestroyer2.setName("Destroyer Class 2 Collectable");
        schematicDestroyer2.setShip(PacificBattleship.getCurrentGame().getShip()[ShipList.destroyer.ordinal()]);
        schematicDestroyer2.setShipClass(ShipClass.destroyer2);
        collectables[CollectableType.schematicDestroyer2.ordinal()] = schematicDestroyer2;
        schematicDestroyer2.setActive(false);

        Collectable schematicDestroyer3 = new Collectable();
        schematicDestroyer3.setCollectableType("schematicPiece");
        schematicDestroyer3.setName("Destroyer Class 3 Collectable");
        schematicDestroyer3.setShip(PacificBattleship.getCurrentGame().getShip()[ShipList.destroyer.ordinal()]);
        schematicDestroyer3.setShipClass(ShipClass.destroyer3);
        collectables[CollectableType.schematicDestroyer3.ordinal()] = schematicDestroyer3;
        schematicDestroyer3.setActive(false);

        return collectables;
    }

    static void assignNukesPartsToLocation(Location[][] mapLocations) {
        //for all Nuke parts
        
        
        /* Nate, I'm commenting this part out.  It will take too much time to
        // fix.  I would need to set a condition to not put parts on land and to
        // not put the same part on top of another.  I will set the parts
        // manually below.  If you can handle these errors, go ahead and put
        // this code back in.
        
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
*/
        mapLocations[1][9].setNukePart(NukeParts.nukePart1);
        mapLocations[3][6].setNukePart(NukeParts.nukePart2);
        mapLocations[6][9].setNukePart(NukeParts.nukePart3);
        mapLocations[9][7].setNukePart(NukeParts.nukePart4);
        mapLocations[5][5].setNukePart(NukeParts.nukePart5);
        mapLocations[9][4].setNukePart(NukeParts.nukePart6);
        mapLocations[4][0].setNukePart(NukeParts.nukePart7);
        mapLocations[7][0].setNukePart(NukeParts.nukePart8);
        mapLocations[4][2].setNukePart(NukeParts.nukePart9);
        mapLocations[0][5].setNukePart(NukeParts.nukePart10);
        mapLocations[6][2].setNukePart(NukeParts.nukePart11);
        mapLocations[5][4].setNukePart(NukeParts.nukePart12);
        mapLocations[7][5].setNukePart(NukeParts.nukePart13);
        mapLocations[0][1].setNukePart(NukeParts.nukePart14);
        mapLocations[2][0].setNukePart(NukeParts.nukePart15);

    }

    public static Base[] assignBaseToLocation() {
        Base[] base = new Base[BaseList.values().length];
        Location[][] locations = PacificBattleship.getCurrentGame().getMap().getLocations();
        
        Base base2 = new Base();
        base2.setDescription("Midway");
        base[BaseList.base2.ordinal()] = base2;
        locations[1][7].setBase(base[BaseList.base2.ordinal()]);
        base2.setLocation(locations[1][7]);
        base2.setActive(true);
	base2.setPOW(5);
	base2.setSymbol("#");
	base2.setHull(3);
	base2.setAttack(2);
	base2.setDefense(0);
	base2.setMaxHull(3);
	base2.setUserControl(false);
        base2.setType("Base");
        
        Base base3 = new Base();
        base3.setDescription("Wake Island");
        base[BaseList.base3.ordinal()] = base3;
        locations[3][4].setBase(base[BaseList.base3.ordinal()]);
        base3.setLocation(locations[3][4]);
	base3.setActive(true);
	base3.setPOW(3);
        base3.setSymbol("#");
        base3.setHull(5);
        base3.setAttack(3);
        base3.setDefense(0);
        base3.setMaxHull(5);
        base3.setUserControl(false);
        base3.setType("Base");
        
        Base base4 = new Base();
        base4.setDescription("Tarawa");
        base[BaseList.base4.ordinal()] = base4;
        locations[7][6].setBase(base[BaseList.base4.ordinal()]);
        base4.setLocation(locations[7][6]);
        base4.setActive(true);
	base4.setPOW(4);
        base4.setSymbol("#");
        base4.setHull(7);
        base4.setAttack(4);
        base4.setDefense(0);
        base4.setMaxHull(7);
        base4.setUserControl(false);
        base4.setType("Base");
        
        Base base5 = new Base();
        base5.setDescription("Guadalcanal");
        base[BaseList.base5.ordinal()] = base5;
        locations[8][0].setBase(base[BaseList.base5.ordinal()]);
        base5.setLocation(locations[8][0]);
	base5.setActive(true);
	base5.setPOW(6);
        base5.setSymbol("#");
        base5.setHull(9);
        base5.setAttack(5);
        base5.setDefense(0);
        base5.setMaxHull(9);
        base5.setUserControl(false);
        base5.setType("Base");
        
        Base base6 = new Base();
        base6.setDescription("Sipan");
        base[BaseList.base6.ordinal()] = base6;
        locations[7][3].setBase(base[BaseList.base6.ordinal()]);
        base6.setLocation(locations[7][3]);
	base6.setActive(true);
	base6.setPOW(5);
        base6.setSymbol("#");
        base6.setHull(11);
        base6.setAttack(6);
        base6.setDefense(0);
        base6.setMaxHull(11);
        base6.setUserControl(false);
        base6.setType("Base");
        
        Base base7 = new Base();
        base7.setDescription("Philippines1");
        base[BaseList.base7.ordinal()] = base7;
        locations[9][5].setBase(base[BaseList.base7.ordinal()]);
        base7.setLocation(locations[9][5]);
	base7.setActive(true);
	base7.setPOW(4);
        base7.setSymbol("#");
        base7.setHull(13);
        base7.setAttack(7);
        base7.setDefense(0);
        base7.setMaxHull(13);
        base7.setUserControl(false);
        base7.setType("Base");
        
        Base base8 = new Base();
        base8.setDescription("Philippines2");
        base[BaseList.base8.ordinal()] = base8;
        locations[9][2].setBase(base[BaseList.base8.ordinal()]);
        base8.setLocation(locations[9][2]);
	base8.setActive(true);
	base8.setPOW(3);
        base8.setSymbol("#");
        base8.setHull(15);
        base8.setAttack(8);
        base8.setDefense(0);
        base8.setMaxHull(15);
        base8.setUserControl(false);
        base8.setType("Base");
        
        Base base9 = new Base();
        base9.setDescription("Philippines3");
        base[BaseList.base9.ordinal()] = base9;
        locations[9][0].setBase(base[BaseList.base9.ordinal()]);
        base9.setLocation(locations[9][0]);
	base9.setActive(true);
	base9.setPOW(5);
        base9.setSymbol("#");
        base9.setHull(17);
        base9.setAttack(9);
        base9.setDefense(0);
        base9.setMaxHull(17);
        base9.setUserControl(false);
        base9.setType("Base");
        
        Base base10 = new Base();
        base10.setDescription("Okinawa");
        base[BaseList.base10.ordinal()] = base10;
        locations[3][0].setBase(base[BaseList.base10.ordinal()]);
        base10.setLocation(locations[3][0]);
	base10.setActive(true);
	base10.setPOW(4);
        base10.setSymbol("#");
        base10.setHull(19);
        base10.setAttack(10);
        base10.setDefense(0);
        base10.setMaxHull(19);
        base10.setUserControl(false);
        base10.setType("Base");
        
        Base base11 = new Base();
        base11.setDescription("Iwa Jima");
        base[BaseList.base11.ordinal()] = base11;
        locations[0][2].setBase(base[BaseList.base11.ordinal()]);
        base11.setLocation(locations[0][2]);
	base11.setActive(true);
	base11.setPOW(5);
        base11.setSymbol("#");
        base11.setHull(21);
        base11.setAttack(11);
        base11.setDefense(0);
        base11.setMaxHull(21);
        base11.setUserControl(false);
        base11.setType("Base");
        
        Base base12 = new Base();
        base12.setDescription("Enemy Base Japan");
        base[BaseList.base12.ordinal()] = base12;
        locations[0][0].setBase(base[BaseList.base12.ordinal()]);
        base12.setLocation(locations[0][0]);
	base12.setActive(true);
	base12.setPOW(6);
        base12.setSymbol("#");
        base12.setHull(25);
        base12.setAttack(12);
        base12.setDefense(0);
        base12.setMaxHull(25);
        base12.setUserControl(false);
        base12.setType("Base");
        
        Base base1 = new Base();
        base1.setDescription("Hiroshima");
        base[BaseList.base1.ordinal()] = base1;
        locations[1][0].setBase(base[BaseList.base1.ordinal()]);
        base1.setLocation(locations[1][0]);
	base1.setActive(true);
	base1.setPOW(6);
        base1.setSymbol("#");
        base1.setHull(40);
        base1.setAttack(15);
        base1.setDefense(0);
        base1.setMaxHull(40);
        base1.setUserControl(false);
        base1.setType("Base");
        
        return base;
        
        }

}
