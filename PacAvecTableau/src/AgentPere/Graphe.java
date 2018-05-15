/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgentPere;

import java.awt.BorderLayout;
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
public class Graphe extends JPanel {

    public Graphe() {
        super();
        /////////////////////
        XYSeries series = new XYSeries("XYGraph");
        series.add(0, 0);
        /*series.add(1, 1);
        series.add(1, 2);
        series.add(2, 1);
        series.add(3, 9);
        series.add(4, 10);*/

        // Add the series to your data set
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);

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

        this.setLayout(new java.awt.BorderLayout());

        ChartPanel CP = new ChartPanel(chart);
        this.add(CP, BorderLayout.CENTER);
        this.validate();
        
                
    }
    
}
