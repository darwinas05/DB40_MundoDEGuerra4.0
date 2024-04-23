package database;

import java.util.Calendar;
import java.sql.DriverManager;
import java.sql.Connection;
import java.util.TimeZone;
public class basesDate {
    String USUARIO = "root";
        String PASS = "";
        String HOST = "localhost:3306";
        String BD = "waw";
        boolean connectionOK = true;

private void Conneccion(){


try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connection = DriverManager.getConnection("jdbc:mysql://"+ HOST + "/" + BD,USUARIO,PASS);
} catch (Exception exception){
    connectionOK = false;
    System.out.println(exception.getMessage());
}
    System.out.println(connectionOK);

}
Calendar now = Calendar.getInstance();
TimeZone zonaHoraria = now.getTimeZone();

}

