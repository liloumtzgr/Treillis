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

//repose sur le terrain 

public abstract class NoeudAppui extends Noeud {

    //constructeur 1 (tous les attriibuts)
    public NoeudAppui (int id, double px, double py, Vecteur2D force) {
        super(id, px, py, force);
        //Noeud n = new Noeud(id, px, py, force);
    }

    //constructeur 2 (coordonées et force)
    public NoeudAppui(double px, double py, Vecteur2D force) {
        super(px, py, force);
    }

    /*//constructeur 3 (coordonnées) 
    public NoeudAppui(double px, double py, List barreD, List barreA) {
        super(px, py, barreD, barreA);
    }
    */
    /*//constructeur 4 (force) 
    public NoeudAppui(Vecteur2D force) {
        super(force);
    }*/
    
    @Override
    public String toString() {
        return id + " : [" + "x =" + this.px + " ; " + "y =" + this.py + " // " + "force :" + this.force.toString() + "]";

    }
    
}
