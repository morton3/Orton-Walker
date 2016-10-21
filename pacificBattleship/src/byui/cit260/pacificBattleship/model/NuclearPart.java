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
public class NuclearPart implements Serializable{
    
    private int partNo;

    public NuclearPart() {
    }

    public int getPartNo() {
        return partNo;
    }

    public void setPartNo(int partNo) {
        this.partNo = partNo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.partNo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NuclearPart other = (NuclearPart) obj;
        if (this.partNo != other.partNo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NuclearPart{" + "partNo=" + partNo + '}';
    }

    
    
}
