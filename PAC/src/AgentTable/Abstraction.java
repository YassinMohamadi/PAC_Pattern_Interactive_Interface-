/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgentTable;

import org.jfree.data.xy.XYSeries;

/**
 *
 * @author Yassine
 */
public class Abstraction  {
    
    private XYSeries data;

    public Abstraction(XYSeries data) {
        this.data = data;
    }

    public XYSeries getData() {
        return data;
    }
    
    
    
}
