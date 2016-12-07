/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.view;

import java.io.PrintWriter;
import pacificbattleship.PacificBattleship;
import sun.rmi.log.ReliableLog;

/**
 *
 * @author Nathan
 */
public class ErrorView {
    private static final PrintWriter errorFile = PacificBattleship.getOutFile();
    private static final PrintWriter logFile = PacificBattleship.getLogFile();
    
    public static void display(String className, String errorMessage) {
        errorFile.println(
                    "-----------------------------------------------------------"
                  + "\n- ERROR -" + errorMessage
                  + "-----------------------------------------------------------");             
                
        logFile.println(className + " - " + errorMessage);
    
}
}