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
public class Treillis {
    List noeuds ;
    List barres ; 
    
    public Treillis (List noeuds, List barres) {
        this.noeuds = noeuds ;
        this.barres = barres ; 
    }
    
    public Treillis () {
        List noeuds = new ArrayList () ; 
        List barres = new ArrayList () ; 
        this.barres = barres ; 
        this.noeuds = noeuds  ;    
    }
    
    
    public List getNoeuds () {
        return this.noeuds ; 
    }
    
    public List getBarres () {
        return this.barres ; 
    }
    
    public void setNoeuds (List noeuds){
        this.noeuds = noeuds  ;
    }
    
    public void setBarres (List barres){
        this.barres = barres  ;
    }
  
    @Override
    public String toString(){ 
        List idBarre = new ArrayList () ; 
        for (int i=0 ; i<this.barres.size() ; i++){
            Barre b =(Barre) this.barres.get(i);
            idBarre.add(b.id) ; 
        }
        List idNoeud = new ArrayList () ; 
        for (int i=0 ; i<this.noeuds.size() ; i++){
            Noeud n = (Noeud) this.noeuds.get(i);
            idNoeud.add(n.id) ;
        }
        return "Treilli : [ Barres " + idBarre + " Noeuds "  + idNoeud + " ]" ; 
    }
    
    public static int maxIdNoeud(Treillis t) {    
        int n = t.noeuds.size();
        int max = 0 ; 
        for (int i = 0 ; i < n; i++ ){
            Noeud n1 =(Noeud) t.noeuds.get(i); // ?
            if (max < n1.id ) {
                max = n1.id ; 
           }
        }
        return max ;
    }
    
    public static int maxIdBarre(Treillis t) {
        int n = t.barres.size();
        int max = 0 ; 
        for (int i = 0 ; i < n; i++ ){
            Barre b =(Barre) t.barres.get(i); // ?
            if (max < b.id ) {
                max = b.id ; 
           }
        }
      return max ;
    }
    
    public static void ajouteNoeud (Noeud n) {
        //to do 
    }
    
    public static void ajouteBarre (Barre b){
        //to do 
    }
    
}
