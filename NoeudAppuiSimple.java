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

public class NoeudAppuiSimple extends Noeud {
    
    //constructeur 1 (tous les attriibuts)
    public NoeudAppuiSimple(int id, double px, double py, Vecteur2D force) {
        super(id, px, py, force);
    }

    //constructeur 2 (coordonées et force)
    public NoeudAppuiSimple(double px, double py, Vecteur2D force) {
        super(px, py, force);
    }

    //constructeur 3 (coordonnées) 
    public NoeudAppuiSimple(double px, double py) {
        super(px, py);
    }
    
    /*//constructeur 4 (force) 
    public NoeudAppuiSimple(Vecteur2D force) {
        super(force);
        this.force = force ; 
        this.id = -1 ; 
        this.px = 0 ; 
        this.py = 0 ; 
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
        return "Appui Simple : "+id + " : [" + "x =" + this.px + " ; " + "y =" + this.py + " // " + "force :" + this.force.toString() + "]";

    }
}
    

