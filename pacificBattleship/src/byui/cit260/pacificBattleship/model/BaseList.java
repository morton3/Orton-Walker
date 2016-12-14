/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    package byui.cit260.pacificBattleship.model;     
/**
 *
 * @author Nathan
 */
public enum BaseList {
    base1("Parl Harbor"),
    base2("Midway"),
    base3("Wake Island"),
    base4("Tarawa"),
    base5("Guadalcanal"),
    base6("Sipan"),
    base7("Philippines1"),
    base8("Philippines2"),
    base9("Philippines3"),
    base10("Okinawa"),
    base11("Iwa Jima"),
    base12("Enamy Base Japan");
    
    private String description;
    
     private BaseList(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    
    
}
