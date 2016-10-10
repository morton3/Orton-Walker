/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacificbattleship;

import byui.cit260.pacificBattleship.model.Game;

import byui.cit260.pacificBattleship.model.Character;
import byui.cit260.pacificBattleship.model.Player;
import byui.cit260.pacificBattleship.model.Upgrade;
import byui.cit260.pacificBattleship.model.Ship;
import byui.cit260.pacificBattleship.model.Transport;
import byui.cit260.pacificBattleship.model.AttackShip;
import byui.cit260.pacificBattleship.model.ShipAbility;
//<editor-fold defaultstate="collapsed" desc="comment">
import byui.cit260.pacificBattleship.model.Map;


import byui.cit260.pacificBattleship.model.Map;
/**
 *
 * @author ort09
 */
public class PacificBattleship {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /********************************************************
         * GAME
         ********************************************************/
        
        Game gameOne = new Game();
        
        gameOne.setName("Nathan");
        gameOne.setScrapAmount(2.00);
        gameOne.setNumOfUnusedPrisoners(5.00);
        gameOne.setNumOfUsedPrisoners(7.00);
        
 
      
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
                
        /********************************************************
         * Character
         ********************************************************/
        
        Character characterOne = new Character();
        
        characterOne.setRank(1);
        characterOne.setName("Matthew");
        
        String characterInfo = characterOne.toString();
        System.out.println(characterInfo);
        
        /********************************************************
         * Player
         ********************************************************/
        
        Player playerOne = new Player();
        
        playerOne.setName("Matthew");
        playerOne.setTime(5.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        /********************************************************
         * Upgrade
         ********************************************************/
        
        Upgrade battleshipAttack = new Upgrade();
        
        battleshipAttack.setUpgradeName("Extra Battleship Gun");
        battleshipAttack.setUpgradeType("scrap");
        battleshipAttack.setUpgradeCurrentLevel(0);
        battleshipAttack.setUpgradeMaxLevel(3);
        battleshipAttack.setUpgradeCurrency(1);
        
        String upgradeInfo = battleshipAttack.toString();
        System.out.println(upgradeInfo);
        
        /********************************************************
         * Ship
         ********************************************************/
        
        Ship battleship0 = new Ship();
        
        battleship0.setName("USS Tennessee");
        battleship0.setDescription("The lead ship of her class of battleship,\n"
                + " was the third ship of the United States Navy named in\n"
                + " honor of the 16th US state.[5] During World War II in the\n"
                + " Pacific Theater, she was damaged during the attack on\n"
                + " Pearl Harbor in December 1941 but was repaired and\n"
                + " modernized. She participated in shore bombardments at the\n"
                + " Aleutian Islands, Tarawa, the Marshall Islands, the\n"
                + " Marianas, the Philippines, Iwo Jima, Okinawa among\n"
                + " others. She was also involved in the Battle of Surigao\n"
                + " Strait, the final battleship vs. battleship conflict\n"
                + " ever.\n"
                + "\n"
                + "After the end of World War II, Tennessee was placed on\n"
                + " reserve in the \"mothball fleet\" for nearly 15 years\n"
                + " before finally being scrapped in 1959. - Wikipedia\n");
        battleship0.setShipType("battleship");
        battleship0.setShipSunk(false);
        battleship0.setMapSymbol("ƃ");
        
        String shipInfo = battleship0.toString();
        System.out.println(shipInfo);
        
        /********************************************************
         * Transport
         ********************************************************/
        
        Transport transport0 = new Transport();
        
        transport0.setTroopsRemaining(5);
        
        String transportInfo = transport0.toString();
        System.out.println(transportInfo);
        
        /********************************************************
         * Attack Ship
         ********************************************************/
        
        AttackShip battleship = new AttackShip();
        
        battleship.setShipType("Battleship");
        battleship.setAttackRange(1);
        battleship.setAttackDamage(2);
        
        String battleshipInfo = battleship.toString();
        System.out.println(battleshipInfo);
        
        /********************************************************
         * Ship Ability
         ********************************************************/
        
        ShipAbility aircraftCarrier = new ShipAbility();
        
        aircraftCarrier.setAbility("planes");
        aircraftCarrier.setActive(true);
        aircraftCarrier.setCount(1);
        
        String shipAbilityInfo = aircraftCarrier.toString();
        System.out.println(shipAbilityInfo);

    }   
}
