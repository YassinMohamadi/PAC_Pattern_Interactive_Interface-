/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgentPere;

import org.jfree.data.xy.XYSeries;

/**
 *
 * @author Yassine
 */
public class Abstraction {
    private  int xAxe=1;//la modification actuele
    private  int yAxe=0;//la temperature actuele
    private XYSeries series ;// pour sauvgarder tout les points

    public Abstraction() {
        series = new XYSeries("XYGraph");
        series.add(0, 0);
    }
    
    

    public  int getxAxe() {
        return xAxe;
    }

    public XYSeries getSeries() {
        return series;
    }

    public  int getyAxe() {
        return yAxe;
    }

    public void setxAxe(int xAxe) {
        this.xAxe = xAxe;
    }

    public void setyAxe(int yAxe) {
        this.yAxe = yAxe;
    }
}
