package Interfaces;

import controladores.ExploradorFicheros;
import controladores.GestorFichero;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class interfasPrincipal extends javax.swing.JFrame {

    fondoPanel fondo = new fondoPanel();

    public interfasPrincipal(){
        this.setContentPane(fondo);
        initComponents();
    }

    private void initComponents(){
        primera = new fondoPanel();
        paraSeleccionar = new javax.swing.JButton();
        luchar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        paraSeleccionar.setBackground(new java.awt.Color(102, 102, 102));
        paraSeleccionar.setForeground(new java.awt.Color(204, 204, 204));
        paraSeleccionar.setText("Cargar Generales");
        paraSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paraSeleccionarActionPerformed(evt);
            }
        });

        luchar.setBackground(new java.awt.Color(102, 102, 102));
        luchar.setForeground(new java.awt.Color(204, 204, 204));
        luchar.setText("Luchar");
        luchar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lucharActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido al mundo de guerra");

        javax.swing.GroupLayout primeraLayout = new javax.swing.GroupLayout(primera);
        primera.setLayout(primeraLayout);
        primeraLayout.setHorizontalGroup(
                primeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(primeraLayout.createSequentialGroup()
                                .addGroup(primeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(primeraLayout.createSequentialGroup()
                                                .addGap(106, 106, 106)
                                                .addComponent(jLabel1))
                                        .addGroup(primeraLayout.createSequentialGroup()
                                                .addGap(199, 199, 199)
                                                .addComponent(luchar))
                                        .addGroup(primeraLayout.createSequentialGroup()
                                                .addGap(175, 175, 175)
                                                .addComponent(paraSeleccionar)))
                                .addGap(128, 128, 128))
        );
        primeraLayout.setVerticalGroup(
                primeraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(primeraLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                                .addComponent(luchar)
                                .addGap(56, 56, 56)
                                .addComponent(paraSeleccionar)
                                .addGap(66, 66, 66))
        );

        getContentPane().add(primera, new java.awt.GridBagConstraints());

        pack();
    }

private void paraSeleccionarActionPerformed(java.awt.event.ActionEvent evt){
    JFileChooser fileChooser = new JFileChooser();
    ExploradorFicheros.obtenerRuta();

    fileChooser.setDialogTitle("Seleciona un fichero");//la ventana tendra este titulo.
    fileChooser.setSelectedFile(new File("Generales.txt"));

    try {
        GestorFichero.obtenerNombreGeneral(ExploradorFicheros.obtenerRuta());
    } catch (IOException ex) {
        System.out.printf(ex.getMessage());
    }

}

    private void lucharActionPerformed(java.awt.event.ActionEvent evt) {

        if (ExploradorFicheros.getRuta() == null) {
            JOptionPane.showMessageDialog(null, "No se ha cargado un general");
        } else {
            new interfasEjercitoo();

            dispose();
        }
    }
    // Variables declaration - do not modify
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton luchar;
    private javax.swing.JButton paraSeleccionar;
    private javax.swing.JPanel primera;
    class fondoPanel extends JPanel{
        private Image imagen;

        @Override
        public void paint (Graphics g){
            imagen = new ImageIcon(getClass().getResource("/imagenes/para_guerra.jpg")).getImage();

            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);

            super.paint(g);

        }
    }

}