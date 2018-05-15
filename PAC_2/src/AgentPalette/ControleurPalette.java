/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgentPalette;

import AgentChSaisie.ControleurChSaisie;
import AgentPere.Controleur;

/**
 *
 * @author Yassine
 */
public class ControleurPalette {
    
    public static Controleur cnt=null;
    

    public ControleurPalette() {
            this.cnt = new Controleur();
    }
    
    public void remettreZero(){
        this.cnt.RemettreZero();
    }
    
    public void augmenter(int n){
        System.out.println(n);
        this.cnt.augmenter(n);
    }
    
    public void diminuer(int n){
        this.cnt.diminuer(n);
    }

    public Controleur getCnt() {
     
            return cnt;
        
    }
    
    
    
}
