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
        "\n********************************************************************************************************"
        +"\n*Its December 7, 1941 and the Japanese have just bombed Pearl Harbor, the United States Naval*"
        +"\n*base in the Pacific. Causing the United States to be forced into the global conflict of World War 2.*"
        +"\n*In this role playing activity you start out as a one-star general. As you advance against the enemy*"
        +"\n*you will be promoted throughout the game topping out as a 5-star general after the Japanese*"
        +"\n*have surrendered. Based on your knowledge of past events you will pick and choose what forces*"
        +"\n*are needed for what battle. But watch out and don’t make the wrong move or make the wrong*"
        +"\n*guess of the intent of the Japanese military’s next move. It may lead your forces into defeat and*"
        +"\n*you will be decommissioned thus losing the game.*"
        +"\n*                                                                                                     *"
        +"\n*******************************************************************************************************"
        );
                
    }

    public void displayStartProgramView() {
        System.out.println("\n*** displayStartProgram() function called ***");
    }
}
