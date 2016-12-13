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
    base2("Base2"),
    base3("Base3"),
    base4("Base4"),
    base5("Base5"),
    base6("Base6"),
    base7("Base7"),
    base8("Base8"),
    base9("Base9"),
    base10("Base10"),
    base11("Base11"),
    base12("Base12");
    
    private String description;
    
     private BaseList(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    
    
}
