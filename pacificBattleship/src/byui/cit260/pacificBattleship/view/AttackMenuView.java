/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.view;

import byui.cit260.pacificBattleship.control.BattleControl;


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
              System.out.println("\n*** Invalid Row! *** Try again");
              return false;
      }
      
      String strColumn = value.substring(1);
      
      try{
      column = Integer.parseInt(strColumn);
      } catch (NumberFormatException nf){
          System.out.println("\n*** Invalid Column! *** Try again");
      }
      
      if (column < 1 || column > 10) {
          System.out.println("\n*** Invalid Column! *** Try again");
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
        
        System.out.println("\nAttack made at:"
                + "\n\trow: " + rowLetter
                + "\n\tcolumn: " + column);
        
        
        String message = BattleControl.checkForEnemy(row, column);
        
        System.out.println(message);
        
    }
    
}

    

