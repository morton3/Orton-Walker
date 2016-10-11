/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pacificBattleship.model;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Nathan
 */
public class nuclearMisslePart implements Serializable{
    
    private int pieceNum;
    private int pieceReceiver;
    private int pieceRemaining;

    public nuclearMisslePart() {
    }

    public int getPieceNum() {
        return pieceNum;
    }

    public void setPieceNum(int pieceNum) {
        this.pieceNum = pieceNum;
    }

    public int getPieceReceiver() {
        return pieceReceiver;
    }

    public void setPieceReceiver(int pieceReceiver) {
        this.pieceReceiver = pieceReceiver;
    }

    public int getPieceRemaining() {
        return pieceRemaining;
    }

    public void setPieceRemaining(int pieceRemaining) {
        this.pieceRemaining = pieceRemaining;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.pieceNum;
        hash = 97 * hash + this.pieceReceiver;
        hash = 97 * hash + this.pieceRemaining;
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
        final nuclearMisslePart other = (nuclearMisslePart) obj;
        if (this.pieceNum != other.pieceNum) {
            return false;
        }
        if (this.pieceReceiver != other.pieceReceiver) {
            return false;
        }
        if (this.pieceRemaining != other.pieceRemaining) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "nuclearMisslePart{" + "pieceNum=" + pieceNum + ", pieceReceiver=" + pieceReceiver + ", pieceRemaining=" + pieceRemaining + '}';
    }
    
    
    
}
