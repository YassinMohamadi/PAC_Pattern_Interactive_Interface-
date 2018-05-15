/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgentChSaisie;

import AgentPalette.ControleurPalette;
import AgentPere.Controleur;

/**
 *
 * @author Yassine
 */
public class ControleurChSaisie {
    
    private Controleur cnt;
    

    public ControleurChSaisie( ) {       
            this.cnt = ControleurPalette.cnt;
    }

    public Controleur getCnt() {
        if (this.cnt != null)
            return cnt;
        else 
            return null;
    }
    
    public void set(int setedTmp){
        this.cnt.set(setedTmp);
    }
    
    
}
