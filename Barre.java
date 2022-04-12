/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.metzger.treilli;

import static java.lang.Math.acos;
import static java.lang.Math.sqrt;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author lilou
 */
public class Barre {
    List barreD = new ArrayList<Barre>() ;
    List barreA = new ArrayList<Barre>() ; 
    int id ; Noeud a, d; double tmax, cmax, cout ; 
    /*noeudOppose, qui pour une barre b donnée, 
    et un noeud n donné qui est soit le
    noeud de départ de la barre, soit son noeud d’arrivée, 
    renvoie l’autre noeud de la barre*/
    
    public static Noeud noeudOppose (Barre b, Noeud n) {
        Noeud départ ;
        Noeud arrivée ; 
        départ = b.getD();
        arrivée = b.getA(); 
        if (n==départ) {
            return arrivée ; 
        }else{
            return départ ; 
        }
    }
    
    public static double angle (Noeud n, Barre b){
      Vecteur2D vect = new Vecteur2D(n.getPx()-noeudOppose(b,n).getPx() , n.getPy()-noeudOppose(b,n).getPy()); // on initialise le vecteur directeur de la barre
      Vecteur2D Ox = new Vecteur2D(1,0); // on initialise un vecteur horizontal
      //On retourne l'angle formé par les deux vecteurs en calculant le produit scalaire.
        return Math.toDegrees(acos((((vect.getVx()*Ox.getVx())+(vect.getVy()*Ox.getVy()))/(sqrt((vect.getVx()*vect.getVx())+(vect.getVy()*vect.getVy()))* sqrt((Ox.getVx()*Ox.getVx())+Ox.getVy()*Ox.getVy()))))) ;
    /// Angle retourné en degrés
    }
    
    //constructeur 
    public Barre (int id, Noeud d, Noeud a, double tmax, double cmax, double cout) {
        this.id = id ; 
        this.d = d ; 
        this.a = a ; 
        this.tmax = tmax ;
        this.cmax = cmax ; 
        this.cout = cout ;
    }
    
    //contructeur avec id et noeuds
    public Barre (int id, Noeud d, Noeud a){
        this.id = id ; 
        this.a = a ; 
        this.d = d ;
    }
    
    //constructeur avec juste les noeuds de départ et d'arrivée
    public Barre(Noeud d, Noeud a){
        this.d = d  ; 
        this.a = a ;
        this.id = 1 ; 
        this.tmax = this.cmax = 0 ; 
        this.cout = 0 ; 
        
    }

    /*public void ajouteB (Barre b){   
        b.getA().barreA.add(b);
    }*/
    
    public static void ajouteB (Barre b){
        b.a.barreA.add(b.id) ;
        b.d.barreD.add(b.id) ; 
    }
    
    
    //toString :
    @Override
    public String toString() {
        return "Barre "+this.id+": [(" + d.getId() +" vers " + a.getId() +") // traction max : " +this.tmax+" // compression max : " + this.cmax + " // COUT :" + this.cout  +"]" ;
    }
    
    
   // get id 
    public int getId() {
        return id;
    }
    // set id
    public void setId(int id) {
        this.id = id;
    }
    
    //get Noeud de départ 
    public Noeud getD (){
        return d ; 
    }
    //set Noeud de départ 
    public void setD (Noeud d) {
        this.d = d ;
    }
    
    //get Noeud d'arrivée 
    public Noeud getA (){
        return a ; 
    }
    //set Noeud de d'arrivée 
    public void setA (Noeud a) {
        this.a = a ;
    }
    
     
}
