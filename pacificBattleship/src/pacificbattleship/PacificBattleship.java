/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacificbattleship;


import byui.cit260.pacificBattleship.model.Game;
import byui.cit260.pacificBattleship.model.Player;
import byui.cit260.pacificBattleship.view.ErrorView;
import byui.cit260.pacificBattleship.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ort09
 */
public class PacificBattleship {
    private static Game currentGame = null;
    private static Player player = null;
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        PacificBattleship.logFile = logFile;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        PacificBattleship.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        PacificBattleship.inFile = inFile;
    }



    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        PacificBattleship.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        PacificBattleship.player = player;
    }

    
    

    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        
        try{
            PacificBattleship.inFile =
                    new BufferedReader(new InputStreamReader(System.in));
            PacificBattleship.outFile = new PrintWriter(System.out, true);
            String filePath = "log.txt";
            PacificBattleship.logFile = new PrintWriter(filePath);
             startProgramView.display();
        }catch (Throwable te) {
            ErrorView.display("PacificBattleship", te.getMessage());
            te.printStackTrace();
            startProgramView.display();
        }
        finally {
            try {
              if  (PacificBattleship.inFile != null)
                  PacificBattleship.inFile.close();
              if  (PacificBattleship.outFile != null)
                  PacificBattleship.outFile.close();
              if  (PacificBattleship.logFile != null)
                  PacificBattleship.logFile.close();
            } catch (IOException ex) {
               ErrorView.display("PacificBattleship", ex.getMessage());
               return;
            }
           
        }
        
      
        
        
        
    }  
}
