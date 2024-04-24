package Interfaces;

import batallas.Batalla;
import batallas.Ejercito;
import componentes.*;
import componentes.animales.Elefante;
import componentes.animales.Tigre;
import componentes.personas.General;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class interfasEjercitoo extends javax.swing.JFrame{

    private static final Batalla batalla = new Batalla();
    private static final Ejercito ejercito = new Ejercito();
    private Componentes componentes;

    private Timer timer;
    private General general;
    private Elefante elefante;
    private Tigre trigre;
    DefaultTableModel modelo = new DefaultTableModel();


    public interfasEjercitoo() {
        initComponents();

        modelo.addColumn("Tipo");
        modelo.addColumn("ID");
        modelo.addColumn("Ataque");
        modelo.addColumn("Defensa");
        modelo.addColumn("Salud");
        this.Tablaa.setModel(modelo);

        barra.setMinimum(0);
        barra.setMaximum(Ejercito.getMaxPeso());
        barra.setStringPainted(true);
        barra.setString(ejercito.getSaldoPeso()+ "/"+ Ejercito.getMaxPeso());

    }
    // Metodo para agregar una imagen como icono.
    public Icon icono(String path, int width, int heigth) {
        Icon img = new ImageIcon(new ImageIcon(getClass()
                .getResource(path)).getImage().getScaledInstance(width,
                heigth, java.awt.Image.SCALE_SMOOTH));
        return img;
    }

        private void initComponents(){

        botones = new javax.swing.JPanel();
        NombreEjercito = new javax.swing.JButton();
        infanteria = new javax.swing.JButton();
        caballeria = new javax.swing.JButton();
        btnGeneral = new javax.swing.JButton();
        btnElefante = new javax.swing.JButton();
        btnTigre = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        ConfirmarElementos = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        barra = new javax.swing.JProgressBar();
        nombreEjercito = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        comfirmarEjercito = new javax.swing.JButton();
        totalElemt = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablaa = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 0));

        botones.setBackground(new java.awt.Color(153, 153, 0));

        NombreEjercito.setText("Nombrar Ejercito");
        NombreEjercito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreEjercitoActionPerformed(evt);
            }
        });

        infanteria.setText("Añadir infanteria");
        infanteria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infanteriaActionPerformed(evt);
            }
        });

        caballeria.setText("Añadir caballeria");
        caballeria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caballeriaActionPerformed(evt);
            }
        });

        btnGeneral.setText("Añadir General");
        btnGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeneralActionPerformed(evt);
            }
        });

        btnElefante.setText("Añadir Elefante");
        btnElefante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElefanteActionPerformed(evt);
            }
        });

        btnTigre.setText("Añadir Tigre");
        btnTigre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTigreActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar elemento");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        ConfirmarElementos.setText("Confirmar");
        ConfirmarElementos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarElementosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout botonesLayout = new javax.swing.GroupLayout(botones);
        botones.setLayout(botonesLayout);
        botonesLayout.setHorizontalGroup(
                botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(botonesLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(infanteria)
                                        .addComponent(NombreEjercito)
                                        .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(btnElefante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnGeneral, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(caballeria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnTigre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(btnEliminar)
                                        .addGroup(botonesLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(ConfirmarElementos)))
                                .addContainerGap(18, Short.MAX_VALUE))
        );
        botonesLayout.setVerticalGroup(
                botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(botonesLayout.createSequentialGroup()
                                .addComponent(NombreEjercito)
                                .addGap(33, 33, 33)
                                .addComponent(infanteria)
                                .addGap(18, 18, 18)
                                .addComponent(caballeria)
                                .addGap(20, 20, 20)
                                .addComponent(btnGeneral)
                                .addGap(18, 18, 18)
                                .addComponent(btnElefante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(btnTigre)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar)
                                .addGap(50, 50, 50)
                                .addComponent(ConfirmarElementos)
                                .addGap(44, 44, 44))
        );

        getContentPane().add(botones, java.awt.BorderLayout.LINE_END);

        jPanel2.setBackground(new java.awt.Color(153, 153, 0));

        jLabel1.setText("Saldo : ");

        jLabel2.setText("Ejército1:");

        barra.setMaximum(50);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombreEjercito, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(nombreEjercito, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(9, 9, 9)
                                                                .addComponent(jLabel1)))))
                                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(153, 153, 0));

        jLabel3.setText("Total :");

        comfirmarEjercito.setText("Confirmar");
        comfirmarEjercito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comfirmarEjercitoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalElemt, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                                .addComponent(comfirmarEjercito)
                                .addGap(52, 52, 52))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(comfirmarEjercito)
                                        .addComponent(totalElemt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(38, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        Tablaa.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        Tablaa.setMinimumSize(new java.awt.Dimension(50, 50));
        Tablaa.addMouseListener(new java.awt.event.MouseAdapter() {

        });
        jScrollPane1.setViewportView(Tablaa);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                                .addContainerGap())
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
    }


    private void NombreEjercitoActionPerformed(java.awt.event.ActionEvent evt) {

        // Agregamos un icono al JOptionPane, el mensaje a mostrar y el titulo de la ventana.
        String ingresaName = JOptionPane.showInputDialog(null, new JLabel("Ingresa un nombre para tu ejército",
                        icono("/imagenes/desplazarse.png", 40, 40), JLabel.CENTER),
                "Nombre del ejército", JOptionPane.PLAIN_MESSAGE);
        ejercito.asignarNombre(ingresaName);
        this.nombreEjercito.setText(ingresaName);
    }

    private void comfirmarEjercitoActionPerformed(java.awt.event.ActionEvent evt){


    }

    private void infanteriaActionPerformed(java.awt.event.ActionEvent evt){

    }

    private void caballeriaActionPerformed(java.awt.event.ActionEvent evt) {

    }
    private void btnElefanteActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void btnTigreActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void btnGeneralActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {


    }

    private void ConfirmarElementosActionPerformed(java.awt.event.ActionEvent evt) {
        int totalFilas = modelo.getRowCount();
        int totalAtaque = 0;
        int totalDefensa = 0;
        int totalSalud = 0;

        for (int i = 0; i < totalFilas; i++) {
            totalAtaque += (int) modelo.getValueAt(i, 2);
            totalDefensa += (int) modelo.getValueAt(i, 3);
            totalSalud += (int) modelo.getValueAt(i, 4);
        }

        totalElemt.setText("Total Ataque: " + totalAtaque + ", Total Defensa: " + totalDefensa + ", Total Salud: " + totalSalud);

    }




    //declaracion de variables, nombre de los botones.
    private javax.swing.JButton ConfirmarElementos;
    private javax.swing.JButton NombreEjercito;
    public javax.swing.JTable Tablaa;
    private javax.swing.JProgressBar barra;
    //para mas :
    private javax.swing.JPanel botones;
    private javax.swing.JButton btnElefante;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGeneral;
    private javax.swing.JButton btnTigre;
    private javax.swing.JButton caballeria;
    private javax.swing.JButton comfirmarEjercito;
    private javax.swing.JButton infanteria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombreEjercito;
    private javax.swing.JFormattedTextField totalElemt;


}
