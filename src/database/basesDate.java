package database;

import componentes.personas.General;
import controladores.GestorFichero;
import java.io.IOException;
import java.sql.*;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import static controladores.GestorFichero.obtenerNombreGeneral;
import static Interfaces.interfasPrincipal.mostrarBD;

public class basesDate {

    private  General general = new General();
    private static String USUARIO = "root";
    private static String PASS = "";
    private static String HOST = "localhost:3306";
    private static boolean connectionOK = true;
    private static Connection conn = null;
    private static List<General> generales = new ArrayList<>();

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
     * Metodo para obtener los atriburos randon de los
     * generales.
     *
     * @return int random
     */
    private static int Atributos() {
        return (int) (Math.random() * 100);
    }

    public static Connection getConnection() {
        return conn;
    }

    //Metodo para desconectar la bases de datos.
    public void desconectar() {
        try {
            conn.close();
            conn = null;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

        // agramanos los generales.
        public static void agregarGeneral(General general){

            try (Connection connection = basesDate.getConnection();
                 Statement stmt = connection.createStatement()) {
                String sentencia = "INSERT INTO generales(Nombre, Ataque, Defensa, Salud, Peso) VALUES ("
                        + "'" + general.getNombre() + "', "
                        + general.getAtaque() + ","
                        + general.getDefensa() + ","
                        + general.getSalud() + ","
                        + General.PESO_GENERAL + ");";


                System.out.println("Generales insertados.");
            } catch (SQLException ex) {
                System.out.println("Error con la insercion de los generales: " + ex.getMessage());
            }
        }

        public static  void updateGenerales(Connection connection){
        String query = "delete from generales";
        try (PreparedStatement statement = connection.prepareStatement(query)){
            statement.execute();
            System.out.println("Generales reiniciados");
        } catch (SQLException e) {
            System.out.println("Error en el update de los generales ");
            System.out.println(e.getMessage());
        }
        }

        private static void generalSel(){
        try(Connection connection = basesDate.getConnection();
            Statement stmt = connection.createStatement()){
            String query = "Select * from generales ";

            stmt.executeQuery(query);

            while (stmt.getResultSet().next()){
                General general = new General();
                general.setNombre(stmt.getResultSet().getString("Nombre"));
                general.setAtaque(stmt.getResultSet().getInt("Ataque"));
                general.setDefensa(stmt.getResultSet().getInt("Defensa"));
                general.setSalud(stmt.getResultSet().getInt("Salud"));
                general.setPeso(stmt.getResultSet().getInt("Peso"));
                generales.add(general);
            }
            System.out.println("Generales seleccionados");
        }catch(SQLException e){
            System.out.println("Error al seleccionar generales" +
                    e.getMessage());

        }
        }

        public static List<General> getGenerales(){
        return generales;
        }


    }

