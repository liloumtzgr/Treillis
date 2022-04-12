/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.metzger.treilli;

/**
 *
 * @author lilou
 */
public class Vecteur2D {

    double vx;
    double vy;

    //constructeur :
    public Vecteur2D(double vx, double vy) {
        this.vx = vx;
        this.vy = vy;
    }
    //constructeur qui initialise à zéro si pas de paramètres entrés

    public Vecteur2D() {
        this(0,0) ; 
    }
    


    //méthode toString :
    @Override
    public String toString() {
        return "(" + this.vx + "," + this.vy + ")";
    }

    // set vx
    public void setVx(double vx) {
        this.vx = vx;
    }

    // get vx
    public double getVx() {
        return vx;
    }

    // set vy
    public void setVy(double vy) {
        this.vy = vy;
    }

    // get vy
    public double getVy() {
        return vy;
    }
}
