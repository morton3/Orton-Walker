/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.view;


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
      
      int column = -1;
      int row = 0;
      
      if (value.charAt(1) == '1') {
          if (value.charAt(2) == '0')
              column = 10;
          else
              column = 1;
      }
      else
          column = Character.getNumericValue(value.charAt(1));
      
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
              row = -1;
      }
      
      
      if (value.length() < 2 || value.length() > 3 || row == -1) {
          System.out.println("\n*** Invalid Coordinates! *** Try again");
          return false;
      }
      
      return true;
      
    }

}

    

