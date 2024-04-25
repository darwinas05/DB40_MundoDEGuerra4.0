package database;

import componentes.personas.General;

import java.sql.*;
import java.sql.Connection;
import java.util.Calendar;
import java.util.TimeZone;
public class basesDate {



private static General general = new General();
        public static Connection conectarBD(String BD) throws SQLException {

            Connection connection = null;
            String USUARIO = "root";
            String PASS = "";
            String HOST = "localhost:3306";
            boolean connectionOK = true;

            Calendar ahora = Calendar.getInstance();
            TimeZone zonahorario = ahora.getTimeZone();

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = (Connection) DriverManager.getConnection(
                        "jdbc:mysql://" + HOST + "/" + BD, USUARIO, PASS);
                System.out.println("Conección satisfactoria");
            } catch (Exception exception) {
                connectionOK = false;
                System.out.println(exception.getMessage());
            } finally {
                System.out.print(connectionOK);
                return connection;
            }


        }

    //metodo para agregar datos a las columnas de la tabla de mi base de datos.
    public static void intoTable() {
        int filas_afectadas = -1;
        String sentencia = "INSERT INTO generales(Nombre, Ataque, Defensa, Salud, Peso) VALUES ('" + general.getNombre() + ',' + general.getAtaque() + ',' + general.getDefensa() + ',' + general.getSalud() + ')";

        try{
            Statement stmt = connection.createStatement() ;
            filas_afectadas = stmt.executeUpdate(sentencia);
            System.out.println(filas_afectadas + "filas(s) insertadas(s).");
        }catch (SQLException ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }


    // Ejecutar la sentencia y obtener el número de filas afectadas

    }


