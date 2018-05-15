/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgentPere;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JPanel;
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
public class Controleur {

    private Abstraction data;

    public Controleur() {
        data = new Abstraction();
    }

    public void RemettreZero() {

        data.getSeries().clear();
        data.getSeries().add(0, 0);
        data.setxAxe(1);
        data.setyAxe(0);
        // Add the series to your data set
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(data.getSeries());

        // Generate the graph
        JFreeChart chart = ChartFactory.createXYLineChart(
                "Gestion temperature", // Title
                "Modif", // x-axis Label
                "Temp", // y-axis Label
                dataset, // Dataset
                PlotOrientation.VERTICAL, // Plot Orientation
                true, // Show Legend
                true, // Use tooltips
                false // Configure chart to generate URLs?
        );

        pac.PAC.fen.getPanDiagrame().setLayout(new java.awt.BorderLayout());

        ChartPanel CP = new ChartPanel(chart);

        pac.PAC.fen.getC().add(CP, BorderLayout.CENTER);
        pac.PAC.fen.validate();

    }

    public void augmenter(int n) {

        data.setyAxe(data.getyAxe() + n);
        data.getSeries().add(data.getxAxe(), data.getyAxe());
        System.out.println("augmenter xaxe" + data.getxAxe() + " " + data.getyAxe());
        data.setxAxe(data.getxAxe() + 1);
        this.modifierGraphe();

    }

    public void diminuer(int pasDiminution) {

        data.setyAxe(data.getyAxe() - pasDiminution);
        data.getSeries().add(data.getxAxe(), data.getyAxe());
        System.out.println("diminuer xaxe" + data.getxAxe() + " " + data.getyAxe());
        data.setxAxe(data.getxAxe() + 1);

        this.modifierGraphe();
    }

    public void set(int setedTmp) {

        data.setyAxe(data.getyAxe() + setedTmp);
        data.getSeries().add(data.getxAxe(), data.getyAxe());
        System.out.println(" set xaxe" + data.getxAxe() + " " + data.getyAxe());
        data.setxAxe(data.getxAxe() + 1);

        this.modifierGraphe();
    }

    public void modifierGraphe() {
        // Add the series to your data set
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(data.getSeries());

        // Generate the graph
        JFreeChart chart = ChartFactory.createXYLineChart(
                "Gestion temperature", // Title
                "Modif", // x-axis Label
                "Temp", // y-axis Label
                dataset, // Dataset
                PlotOrientation.VERTICAL, // Plot Orientation
                true, // Show Legend
                true, // Use tooltips
                false // Configure chart to generate URLs?
        );

        pac.PAC.fen.getPanDiagrame().setLayout(new java.awt.BorderLayout());

        ChartPanel CP = new ChartPanel(chart);

        pac.PAC.fen.getC().add(CP, BorderLayout.CENTER);
        pac.PAC.fen.validate();
    }
}
