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
public class BattleResultView extends View{
    
       public BattleResultView() {
        super("\n"
                + "\n--------------------------------------------------"
                + "\n| Battle Results                                  |"
                + "\n--------------------------------------------------"
                + "\nA - Attack again?"
                + "\nQ - Quit"
                + "\n--------------------------------------------------");
              }
    
         @Override
    public boolean doAction(String value) {
      value = value.toUpperCase();
      
      switch (value){
          case "A":
              this.attackView();
              return true;
          default:
              this.console.println("\n*** Invalid selection *** Try again");
              break;
      }
      this.console.println("\n*** Battle results *** Displayed");
       return false;
    }

    private void attackView() {
       AttackMenuView attackMenu = new AttackMenuView();
       attackMenu.display();
    }
    

}
