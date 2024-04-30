//package database;
//
//import componentes.personas.General;
//
//import java.sql.Connection;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;
//
//public class insertGenerales {
//
//    private static Connection connection;
//    private static List<General> generaless = new ArrayList<>();
//
//    private static String newTable;
//
//    public static void createTable(String nombre) throws SQLException {
//
//            Statement statement = connection.createStatement() {
//                String query = "create table if not exits '" + nombre + "`("
//                        + "ID int auto_increment primary key,"
//                        + "Nombre varchar2(100) not null,"
//                        + "Ataque INT NOT NULL,"
//                        + "Defenda INT NOT NULL,"
//                        + "Salud INT NOT NULL,"
//                        + "Peso  INT NOT NULL"
//                        + ");";
//
//                newTable = nombre;
//                statement.executeUpdate(query);
//                System.out.println("Tabla creada");
//
//            }catch(SQLException e){
//                System.err.println("Error en la creación de la tabla");
//                System.err.println(e.getMessage());
//            }
//
//        }
//    }
//public static void insertGeneral(General general) throws SQLException {
//
//             Statement statement = connection.createStatement() {
//            String query = "INSERT INTO GENERAL(NAME, HEALTH, ATTACK, DEFEND, WEIGHT) VALUES("
//                    + "'" + general.getNombre() + "', "
//                    + general.getSalud() + ", "
//                    + general.getAtaque() + ", "
//                    + general.getDefensa() + ", "
//                    + General.PESO_GENERAL
//                    + ");";
//
//            statement.executeUpdate(query);
//
//            System.out.println("Inserción realizada");
//            System.out.println("Conexión cerrada");
//        } catch (SQLException e) {
//            System.err.println("Error en la inserción");
//            System.err.println(e.getMessage());
//        }
//    }
//
//}
