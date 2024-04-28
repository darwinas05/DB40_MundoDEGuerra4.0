package Interfaces;


import batallas.Ronda;
import controladores.ExploradorFicheros;
import controladores.GestorFichero;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
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
        batallaModel.addRow(data);

        infoBatalla();

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
        data = new Vector<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BatallaTable.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BatallaTable.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        BatallaTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        BatallaTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BatallaTable.setGridColor(new java.awt.Color(51, 0, 0));
        jScrollPane1.setViewportView(BatallaTable);

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Batalla");

        jLabel2.setText("Ganador: ");

        seleccionar.setText("Serializar");
        seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarActionPerformed(evt);
            }
        });

        Salir.setText("Salir");
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirMouseExited(evt);
            }
        });
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        XML.setText("XML");
        XML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XMLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap(93, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(162, 162, 162)
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(XML)
                                                                .addGap(89, 89, 89)
                                                                .addComponent(seleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(64, 64, 64)
                                                                .addComponent(Salir)
                                                                .addGap(43, 43, 43))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Salir)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(XML)
                                                .addComponent(seleccionar)))
                                .addGap(28, 28, 28))
        );

        pack();
    }

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {

    }
    private void SalirMouseEntered(java.awt.event.MouseEvent evt){
        Salir.setBackground(Color.RED);
        Salir.getBackground();
    }
    private void SalirMouseClicked(java.awt.event.MouseEvent evt){
        System.exit(0);
    }
    private void SalirMouseExited(java.awt.event.MouseEvent evt){
        Salir.setBackground(Color.lightGray);
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText(interfasEjercitoo.getBatalla().getGanador().getNombre());
    }

    private void XMLActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void seleccionarActionPerformed(java.awt.event.ActionEvent evt) {

        //para regresar a la ventana de los archivos.
        //fileChooserHandler.showFileChooser();
    }


    private void infoBatalla(){
        for (Ronda ronda : interfasEjercitoo.getBatalla().getRondas()){
            Vector<Object> row = new Vector<>();
            row.add(ronda.getNumRonda() + 1);
            row.add(ronda.getAtacante().getNombre());
            row.add(ronda.getDefensor().getNombre());
            row.add(ronda.getResultado());
            data = new Vector<>();
        }
    }

    private JButton Salir;
    private JTable BatallaTable;
    private JButton XML;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JScrollPane jScrollPane1;
    private JTextField jTextField1;
    private JButton seleccionar;
    private Vector<Vector<Object>>data;
    //*Metodo que agrega los datos de la batalla a la table

}


