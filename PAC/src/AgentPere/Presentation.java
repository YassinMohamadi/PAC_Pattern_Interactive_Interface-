/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgentPere;

import AgentChSaisie.PresentationChSaisie;
import AgentPalette.PresentationPalette;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Label;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Yassine
 */
public class Presentation extends JFrame {

    private Controleur cnt;
    PresentationPalette pan ;
    PresentationChSaisie pan1 ;
    private JPanel panDiagrame;
    private Container c;

    public Presentation() {
        this.cnt = new Controleur();
        pan = new PresentationPalette();
        pan1  = new PresentationChSaisie();
        c = this.getContentPane();
        panDiagrame = new Graphe();
        this.setTitle("TP PAC");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        pan.setBackground(Color.ORANGE);
        pan1.setBackground(Color.WHITE);  
    }

    public void inialiser() {
        
        //panDiagrame.setBackground(Color.GREEN);

        c.add(pan, "North");
        c.add(pan1, "South");
        c.add(panDiagrame, "Center");

        this.setVisible(true);
    }

    public JPanel getPanDiagrame() {
        return panDiagrame;
    }

    public Container getC() {
        return c;
    }
   
    public JFrame getJframe() {
        return this;
    }
    

}
