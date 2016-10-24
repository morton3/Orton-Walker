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
public class StartProgramView {
    
    private String promptMessage;
    
    public  StartProgramView(){
        this.promptMessage = "\nPlease enter your name:";
        //display the banner when view is created
       this.displayBanner();
       
     }

    private void displayBanner() {
        System.out.println(
        "\n*************************************************************"
        +"\n*                                                          *"
                
        );
                
    }

    public void displayStartProgramView() {
        System.out.println("\n*** displayStartProgram() function called ***");
    }
}
