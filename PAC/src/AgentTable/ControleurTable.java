/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgentTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import org.jfree.data.xy.XYSeries;

/**
 *
 * @author Yassine
 */
public class ControleurTable {

    private Abstraction abst;
    private PresentationTable p;

    public ControleurTable(XYSeries data) {
        this.abst = new Abstraction(data);
        this.p = new PresentationTable();
    }

    public void afficherTable() {
        this.p.setTitle("Affichage de la table");
        //this.p.setSize(400, 400);
        this.p.setLocationRelativeTo(null);
        this.p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        System.out.println("size: " + this.abst.getData().getItemCount());
        List lx = new ArrayList<Number>();
        List ly = new ArrayList<Number>();
        for (int i = 0; i < this.abst.getData().getItemCount() - 1; i++) {
            lx.add(this.abst.getData().getX(i));
            ly.add(this.abst.getData().getY(i));
        }
        DefaultTableModel model = new DefaultTableModel(0, 2);
        String[] header = {"Modification", "Température"};
        model.setColumnIdentifiers(header);

        for (int j = 0; j < this.abst.getData().getItemCount(); j++) {

            String[] row1 = {this.abst.getData().getX(j).toString(), this.abst.getData().getY(j).toString()};
            model.addRow(row1);
        }

        this.p.getjTable1().setModel(model);
        this.p.show();

    }

}
