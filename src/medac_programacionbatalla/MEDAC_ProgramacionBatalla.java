/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medac_programacionbatalla;


import Interfaces.interfasPrincipal;
import batallas.Batalla;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author danie
 */
public class MEDAC_ProgramacionBatalla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        Connection_DB40.DB40.conectarDB40();

        //        basesDate conecBases = new basesDate();
        interfasPrincipal interfasprincipal = new interfasPrincipal();
        interfasprincipal.setVisible(true);
        interfasprincipal.setLocationRelativeTo(null);


//           try {
//               basesDate.conectarBD("waw");
//           } catch (SQLException e) {
//               throw new RuntimeException(e);
//           }


    }
}
    


