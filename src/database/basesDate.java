package database;

import java.sql.*;
import java.sql.Connection;
import java.util.Calendar;
import java.util.TimeZone;
import componentes.personas.General;
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
    public static void intoTable() {
        String sentencia = "INSERT INTO generales(Nombre, Ataque, Defensa, Salud, Peso) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = conectarBD("NOMBRE DE TU BASE DE DATOS");
             PreparedStatement stmt = connection.prepareStatement(sentencia)) {
            // Asignar valores de los atributos de la instancia de General a los marcadores de posición
            stmt.setString(1, general.getNombre());
            stmt.setInt(2, general.getAtaque());
            stmt.setInt(3, general.getDefensa());
            stmt.setInt(4, general.getSalud());
            stmt.setInt(5, general.getPeso());

            // Ejecutar la sentencia y obtener el número de filas afectadas
            int filasAfectadas = stmt.executeUpdate();
            System.out.println(filasAfectadas + " fila(s) insertada(s).");
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    }


