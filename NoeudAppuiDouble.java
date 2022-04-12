/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.metzger.treilli;

import java.util.List;

/**
 *
 * @author lilou
 */
public class NoeudAppuiDouble extends Noeud {
    
    //constructeur 1 (tous les attributs)
    public NoeudAppuiDouble (int id, double px, double py, Vecteur2D force) {
        super(id, px, py, force);
    }

    //constructeur 2 (coordonées et force)
    public NoeudAppuiDouble(double px, double py, Vecteur2D force) {
        super(px, py, force);
    }

    //constructeur 3 (coordonnées) 
    public NoeudAppuiDouble(double px, double py) {
        super(px, py);
    }
    
    /*//constructeur 4 (force) 
    public NoeudAppuiDouble(Vecteur2D force) {
        super(force);
    }*/
    
    // set px
    @Override
    public void setPx(double px) {
        this.px = px;
    }
    
    // set py
    @Override
    public void setPy(double py) {
        this.py = py;
    }
    
    @Override
    public String toString() {
        return "Appui Double : " + id + " : [" + "x =" + this.px + " ; " + "y =" + this.py + " // " + "force :" + this.force.toString() + "]";

    }
}
