/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.metzger.treilli;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lilou
 */
public abstract class Noeud {

    double px;
    double py;
    int id;
    Vecteur2D force;
    double abs;
    double ord;
    List barreD = new ArrayList<Barre>() ; 
    List barreA = new ArrayList<Barre>() ; 


    /* un noeud est def par 
     - un identificateur 
     - une position x, y 
     - une force associée (Vecteur2D)
     */
    
    //pour entrer les pptés du noeud à la main : 
    public static Noeud entreeNoeud() {
        double px, py, abs, ord;
        String type;
        Vecteur2D f = new Vecteur2D();
        Noeud n = null ; 

        System.out.println("Entrer le type de noeud :");
        System.out.println("'simple', 'appui simple', 'appui double'");
        type = Lire.S();

        System.out.println("Entrer l'ordonnée du noeud :");
        px = Lire.d();
        System.out.println("Entrer l'abscisse du noeud :");
        py = Lire.d();

        System.out.println("Entrer les coordonnées du vecteur force :");
        System.out.println("x = ");
        abs = Lire.d();
        System.out.println("y = ");
        ord = Lire.d();

        f.vx = abs;
        f.vy = ord;

        if (type.equals("simple") == true) {
            n = new NoeudSimple(px, py, f);
            n.px = px;
            n.py = py;
            //System.out.println(n);
        }
        if (type.equals("appui simple") == true) {
            n = new NoeudAppuiSimple(px, py, f);
            n.px = px;
            n.py = py;
            //System.out.println(n) ; 
        }
        if (type.equals("appui double") == true) {
            n = new NoeudAppuiDouble(px, py, f);
            n.px = px;
            n.py = py;
            //System.out.println(n);
        }

        return n;
    }
    
    //nombre d'inconnues : 
    public static int inconnues(Noeud n) {
        int inc = 0;
        String type;
        type = (n.getClass().getSimpleName()); //permet de retourner la classe d'un attribut.
        //System.out.println("Type de Noeud : "+ type);
        if (type.equals("NoeudSimple") == true) {
            inc = 0;
        }
        if (type.equals("NoeudAppuiSimple") == true) {
            inc = 1;
        }
        if (type.equals("NoeudAppuiDouble") == true) {
            inc = 2;
        }
        return inc;
    }
    
    public static List barresIncidentes(Noeud n){
        List BIncidentes = new ArrayList();
        BIncidentes.addAll(n.barreA) ; // si on met .add ça affiche les deux chaînes séparément 
        BIncidentes.addAll(n.barreD) ; 
        return BIncidentes;
    }
    
    

    //constructeur 1 : fixe valeur de id, px, py et la force
    public Noeud(int id, double px, double py, Vecteur2D force) {
        this.force = force;
        this.id = id;
        this.px = px;
        this.py = py;
        List barreArrivee = new ArrayList () ; 
        List barreDepart = new ArrayList () ; 
        this.barreA = barreArrivee ; 
        this.barreD = barreDepart ; 
    }

    //constructeur 2 : fixe uniquement la position et la force (id=-1 par défaut) 
    public Noeud(double px, double py, Vecteur2D force) {
        this.force = force;
        id = (-1);
        this.px = px;
        this.py = py;
        List barreArrivee = new ArrayList () ; 
        List barreDepart = new ArrayList () ; 
        this.barreA = barreArrivee ; 
        this.barreD = barreDepart ; 
    }
    
    public Noeud() {
        this.force = new Vecteur2D(0, 0);
        this.id = (-1);
        this.px = 0;
        this.py = 0;
        List barreArrivee = new ArrayList () ; 
        List barreDepart = new ArrayList () ; 
        this.barreA = barreArrivee ; 
        this.barreD = barreDepart ; 
    }

    // constructeur 3 : fixe uniquement la position (id=-1 et force=[0;0] par défaut)
    public Noeud(double px, double py) {
        this.force = new Vecteur2D(0,0);
        this.px = px;
        this.py = py;
        List barreArrivee = new ArrayList () ; 
        List barreDepart = new ArrayList () ; 
        this.barreA = barreArrivee ; 
        this.barreD = barreDepart ; 
        
        
       
        
    }
    /*//constructeur 4 : juste la force 
    public Noeud(Vecteur2D force) {
        this.force = force;
        this.id = (-1);
        this.px = 0;
        this.py = 0;
    }*/


    // set px
    public void setPx(double px) {
        this.px = px;
    }

    // get px
    public double getPx() {
        return px;
    }
    public List getBarreA(){
    return barreA;
    }
    public void setBarreA(List barreA){
        
        this.barreA= barreA;
    }
    
    public void setBarreD (List barreD){
    
    this.barreD = barreD;
    }
    
    public List getBarreD(){
    return barreD;
    }

    // set py
    public void setPy(double py) {
        this.py = py;
    }

    // get py
    public double getPy() {
        return py;
    }

    // get id 
    public int getId() {
        return id;
    }

    @Override //défini une méthode héritée de la classe parente 
    public String toString() {
        return id + " : [" + "x =" + this.px + " ; " + "y =" + this.py + " // " + "force :" + this.force.toString() + "]";
    }
}