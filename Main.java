/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.metzger.treilli;

import static fr.insa.metzger.treilli.Barre.noeudOppose;
import static fr.insa.metzger.treilli.Noeud.entreeNoeud;
import static fr.insa.metzger.treilli.Noeud.inconnues;
import static fr.insa.metzger.treilli.Barre.ajouteB;
import static fr.insa.metzger.treilli.Noeud.barresIncidentes;
import static fr.insa.metzger.treilli.Treillis.maxIdBarre;
import static fr.insa.metzger.treilli.Treillis.maxIdNoeud;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lilou
 */
public class Main {

    public static void main(String[] args) {

        /*//test entreeNoeud 
        Noeud n;
        n = entreeNoeud();
        System.out.println("Test entreeNoeud : ");
        System.out.println();
        System.out.println(n);

        //test inconnues
        System.out.println("Nombre d'inconnues : " + inconnues(n));

        //test classe barre.
        System.out.println();
        System.out.println("Test création d'une barre : ");
        System.out.println();

        Vecteur2D f1 = new Vecteur2D(2, 3);
        Vecteur2D f2 = new Vecteur2D(-6, 8);
        Noeud noeud1 = new NoeudAppuiSimple(1, 2, 6, f1);
        Noeud noeud2 = new NoeudSimple(2, 6, 9, f2);
        int id = 1;
        double tmax = 3000;
        double cmax = 473;
        double cout = 343;

        Barre b = new Barre(id, noeud1, noeud2, tmax, cmax, cout);
        System.out.println(b);

        //test noeudOppose : 
        System.out.println();
        System.out.println("Test noeudOppose");
        System.out.println();

        System.out.println("Le deuxième noeud de cette barre est " + noeudOppose(b, noeud1));

        //test angle : 
        System.out.println();
        System.out.println("Test angle");
        System.out.println();

        System.out.println("Angle formé entre la barre et l'horizontale: " + Barre.angle(noeud2, b) + " degrés");*/

        //test des listes barreD, barreA 
        Vecteur2D force1 = new Vecteur2D(2, 3);
        Vecteur2D force2 = new Vecteur2D(-6, 8);

        Noeud n1 = new NoeudAppuiSimple(1, 1, 1, force1);
        Noeud n2 = new NoeudAppuiDouble(2, 6, 9, force2);
        Noeud n3 = new NoeudSimple(3, 4, 3, force2);
        Noeud n4 = new NoeudSimple(4, 5, 4, force2);
        Noeud n5 = new NoeudAppuiDouble(5, 6, 5, force1);

        Barre b1 = new Barre(1, n1, n2);
        ajouteB(b1);

        Barre b2 = new Barre(2, n1, n3);
        ajouteB(b2);

        Barre b3 = new Barre(3, n4, n1);
        ajouteB(b3);

        Barre b4 = new Barre(4, n1, n5);
        ajouteB(b4);

        Barre b5 = new Barre(5, n3, n4);
        ajouteB(b5);

        /*System.out.println("n1 départ " + n1.barreD);
        System.out.println("  arrivée " + n1.barreA);
        System.out.println("Les barres incidentes à n1 sont :" + barresIncidentes(n1));
        System.out.println();
        System.out.println("n2 départ " + n2.barreD);
        System.out.println("  arrivée " + n2.barreA);
        System.out.println();
        System.out.println("n3 départ " + n3.barreD);
        System.out.println("  arrivée " + n3.barreA);
        System.out.println();
        System.out.println("n4 départ " + n4.barreD);
        System.out.println("  arrivée " + n4.barreA);
        System.out.println();
        System.out.println("n5 départ " + n5.barreD);
        System.out.println("  arrivée " + n5.barreA);*/
        
        List Noeud = new ArrayList <Noeud> () ; 
        List Barre = new ArrayList <Barre>() ; 
        Noeud.add(n2) ;
        Noeud.add(n1) ; 
        Noeud.add(n3) ;
        Noeud.add(n4) ; 
        Noeud.add(n5) ; 
        Barre.add(b1) ; 
        Barre.add(b2) ; 
        Barre.add(b3) ; 
        Barre.add(b4) ; 
        Barre.add(b5) ; 
              
        Treillis t = new Treillis(Noeud, Barre);
        System.out.println(b1);
        System.out.println(t);
        System.out.println("noeud max = "+ maxIdNoeud(t)) ; 
        System.out.println("barre max = "+ maxIdBarre(t)) ; 


    }

}
