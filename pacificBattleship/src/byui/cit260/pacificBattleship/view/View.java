/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.view;

import byui.cit260.pacificBattleship.model.ViewInterface;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import pacificbattleship.PacificBattleship;

/**
 *
 * @author ort09
 */
public abstract class View implements ViewInterface {
    
    private String displayMessage;
        protected final BufferedReader keyboard = PacificBattleship.getInFile();
        protected final PrintWriter console = PacificBattleship.getOutFile();
    public View() {
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
        String value;
        boolean done = false;
        do{
            this.console.println(this.displayMessage);
                value = this.getInput();
            if (value.toUpperCase().equals("Q")) 
                return;
            done = this.doAction(value);
        }while (!done);
    }
    
    @Override
    public String getInput() {
        
        boolean valid = false;
        String value = null;
        try{
        while (!valid) {
            this.console.println("\n" + this.displayMessage);
            
            value = this.keyboard.readLine();
            value = value.trim();
                    
            
            if (value.length() < 1) {
                this.console.println("\nInvalid value: value can not be blank");
                continue;
            }
            break;
        }
        
        
    }   catch (Exception e) {
            this.console.println("Error reading input:" + e.getMessage());
        }
      return value;
}
}