/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.model;

import java.io.Serializable;

/**
 *
 * @author Nathan
 */
public enum SceneType implements Serializable{
    water,
    land,
    shoreTop,
    shoreRight,
    shoreBottom,
    shoreLeft,
    verticalPass,
    horizontalPass,
    pearlHarbor;
    
}
