/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.model;

import java.io.Serializable;

/**
 *
 * @author ort09
 */
public enum UpgradeList implements Serializable{
    
    battleshipAttack,
    transportAttack,
    submarineAttack,
    aircraftCarrierAttack,
    destroyerAttack,
    battleshipSpecial,
    transportSpecial,
    submarineSpecial,
    aircraftCarrierSpecial,
    destroyerSpecial;
    
}
