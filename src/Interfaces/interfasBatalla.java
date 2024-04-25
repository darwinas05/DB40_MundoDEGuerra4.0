package Interfaces;


import batallas.Ronda;
import controladores.ExploradorFicheros;
import controladores.GestorFichero;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.IOException;
import java.util.Arrays;
import java.util.Vector;

public class interfasBatalla extends JFrame {

    DefaultTableModel batallaModel = new DefaultTableModel();

    public interfasBatalla(){
        initComponents();

        batallaModel.addColumn("Ronda");
        batallaModel.addColumn("Ataque");
        batallaModel.addColumn("Defensa");
        batallaModel.addColumn("Resultado");
        this.BatallaTable.setModel(batallaModel);
    }

    private void initComponents(){

        jScrollPane1 = new javax.swing.JScrollPane();
        BatallaTable = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        seleccionar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        XML = new javax.swing.JButton();

    }

    private JButton Salir;
    private JTable BatallaTable;
    private JButton XML;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JScrollPane jScrollPane1;
    private JTextField jTextField1;
    private JButton seleccionar;
}


