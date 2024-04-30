package database;

import componentes.personas.General;
import controladores.GestorFichero;


import java.io.IOException;
import java.sql.*;
import java.sql.Connection;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import static controladores.GestorFichero.obtenerNombreGeneral;
import static Interfaces.interfasPrincipal.mostrarBD;

public class basesDate {

    private static String USUARIO = "root";
    private static String PASS = "";
    private static String HOST = "localhost:3306";
    private static General general = new General();
    public static Connection conn = null;
   private static boolean connectionOK = true;

    public static Connection conectarBD(String BD) throws SQLException {

        Calendar ahora = Calendar.getInstance();
        TimeZone zonahorario = ahora.getTimeZone();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(
                    "jdbc:mysql://" + HOST + "/" + BD, USUARIO, PASS);
            mostrarBD.setText("Conección satisfactoria");
            System.out.println("Conexión satisfactoria");


        } catch (Exception exception) {
            connectionOK = false;
            mostrarBD.setText("Conexión fallida.");
            System.out.println(exception.getMessage());
        } finally {
            System.out.print(connectionOK);
            return conn;
        }


    }public Connection getConnection(){
        return conn;
    }

    //Metodo para desconectar la bases de datos.
    public void desconectar(){
        try{
            conn.close();
            conn = null;
        }catch(SQLException e){
           e.printStackTrace();
        }
    }

    // metodo para agregar datos a las columnas de la tabla de mi base de datos.
//    public static void intoTable(Connection connection, String rutaFichero) {
//
//        List<String> nameOfGenerales = null;
//        try {
//            nameOfGenerales = GestorFichero.obtenerNombreGeneral(rutaFichero);
//        } catch (IOException e) {
//            Logger.getLogger(basesDate.class.getName()).log(Level.SEVERE,null,e);
//        }
//        for(String nombre : nameOfGenerales) {
//            int Ataque = Atributos();
//            int Defensa = Atributos();
//            int Salud = Atributos();
//            int Peso = General.PESO_GENERAL;
//
//            agregarGeneral(connection, nombre,Ataque,Defensa,Salud,Peso);
//        }
//
//    }


    /**
     * Metodo para botener los atriburos randon de los
     * generales.
     * @return int random
     */
    private static int Atributos(){
        return (int) (Math.random() * 100);
    }
    public static void agregarGeneral(Connection connection, String nombre, int ataque, int defensa, int salud, int peso){

        int filas_afectadas = -1;
        String sentencia = "INSERT INTO generales(Nombre, Ataque, Defensa, Salud, Peso) VALUES (" + general.getNombre() + "', " + general.getAtaque() +
                "," + general.getDefensa() + "," + general.getSalud() + ");";


        try{
            Statement stmt =  connection.createStatement() ;
            filas_afectadas = stmt.executeUpdate(sentencia);
            System.out.println(filas_afectadas + "filas(s) insertadas(s).");
        }catch (SQLException ex){
            System.out.println("Error con la insercion de los generales: " + ex.getMessage());
        }
    }


    }



