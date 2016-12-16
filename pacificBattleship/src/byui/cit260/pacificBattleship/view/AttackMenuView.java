/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.view;

import byui.cit260.pacificBattleship.control.BattleControl;
import byui.cit260.pacificBattleship.exceptions.BattleControlException;
import byui.cit260.pacificBattleship.model.Base;
import byui.cit260.pacificBattleship.model.Location;
import byui.cit260.pacificBattleship.model.Ship;
import byui.cit260.pacificBattleship.model.Upgrade;
import java.util.logging.Level;
import java.util.logging.Logger;
import pacificbattleship.PacificBattleship;


/**
 *
 * @author Nathan
 */
public class AttackMenuView extends View{
       
    public AttackMenuView() {
        super(       "\n"
                   + "\n--------------------------------------------------"
                   + "\n| Select Coordinates                              |"
                   + "\n--------------------------------------------------"
                   + "\nEnter the coordintes of the location you wish to "
                   + "\nattack:"
                   + "\n    Q - Return to Command Menu"
                   + "\n--------------------------------------------------");
              }

 
    

    
    @Override
    public boolean doAction(String value) {
      value = value.toUpperCase();
      
      int row = -1;
      int column = -1;
      
      switch (value.charAt(0)){
          case 'A':
              row = 1;
              break;
          case 'B':
              row = 2;
              break;
          case 'C':
              row = 3;
              break;
          case 'D':
              row = 4;
              break;
          case 'E':
              row = 5;
              break;
          case 'F':
              row = 6;
              break;
          case 'G':
              row = 7;
              break;
          case 'H':
              row = 8;
              break;
          case 'I':
              row = 9;
              break;
          case 'J':
              row = 10;
              break;
          default:
              this.console.println("\n*** Invalid Row! *** Try again");
              return false;
      }
      
      String strColumn = value.substring(1);
      
      try{
      column = Integer.parseInt(strColumn);
      } catch (NumberFormatException nf){
          this.console.println("\n*** Invalid Column! *** Try again");
      }
      
      if (column < 1 || column > 10) {
          this.console.println("\n*** Invalid Column! *** Try again");
          return false;
      }
      
      this.results(column, row);
      
      BattleResultView battleResultView = new BattleResultView();
      battleResultView.display();
      
      return true;
      
    }

    private void results(int column, int row) {
        
        char rowLetter = 'A';
        
        switch (row){
            case 1:
                rowLetter = 'A';
                break;
            case 2:
                rowLetter = 'B';
                break;
            case 3:
                rowLetter = 'C';
                break;
            case 4:
                rowLetter = 'D';
                break;
            case 5:
                rowLetter = 'E';
                break;
            case 6:
                rowLetter = 'F';
                break;
            case 7:
                rowLetter = 'G';
                break;
            case 8:
                rowLetter = 'H';
                break;
            case 9:
                rowLetter = 'I';
                break;
            case 10:
                rowLetter = 'J';
                break;
        }
        
        this.console.println("\nAttack made at:"
                + "\n\trow: " + rowLetter
                + "\n\tcolumn: " + column);
        
        
        String message = "";
        
        String shipType = PacificBattleship.getCurrentGame().getActiveShip().getType();
        
        if (shipType.equals("Transport")) {
            message = this.checkForEnemyBase(column - 1, row - 1);
            this.console.println(message);
            return;
        }
        
        try {
            message = AttackMenuView.checkForEnemy(column - 1, row - 1);
            
            } catch (BattleControlException me) {
                this.console.println(me.getMessage());
        }
        
        this.console.println(message);
        
    }
    
        public static String checkForEnemy(int row, int column) 
            throws BattleControlException {
        
        Location[][] locations = PacificBattleship.getCurrentGame().getMap().getLocations();
        String message;
        
        if (locations[row][column].getShip() == null){
            message = "No enemy ship here...";
            return message;
        }
        
        Ship activeShip = PacificBattleship.getCurrentGame().getActiveShip();
        Upgrade upgradeAttack = activeShip.getUpgradeAttack();
        Upgrade upgradeSpecial = activeShip.getUpgradeSpecial();
        
        Ship enemyShip = locations[row][column].getShip();
        
        message = BattleControl.attackUnit(activeShip, enemyShip, upgradeAttack, upgradeSpecial);
        
        if (locations[row][column].getShip() != null)
            message += BattleControl.counter(activeShip, enemyShip);
        
        
        return message;
    }

    private String checkForEnemyBase(int row, int column) {
        
        Location[][] locations = PacificBattleship.getCurrentGame().getMap().getLocations();
        String message = "";
        
        if (locations[row][column].getScene().isActive()){
            message = "You can't attack ships with the transport";
            return message;
        }
        
        Ship activeShip = PacificBattleship.getCurrentGame().getActiveShip();
        Upgrade upgradeAttack = activeShip.getUpgradeAttack();
        Upgrade upgradeSpecial = activeShip.getUpgradeSpecial();
        
        Base enemyBase = locations[row][column].getBase();
        
        if (!enemyBase.isActive()) {
            message = "This base has already been destroyed and the POW's have"
                    + "been liberated.  Look for another base!";
            return message;
        }
        
        if (locations[row][column].getBase().isActive()) {
            message = BattleControl.attackBase(enemyBase, activeShip, row, column);
            
            if (locations[row][column].getBase() != null)
                message += BattleControl.baseCounter(enemyBase, activeShip);
        
        }
        return message;
    }
    
}

    

