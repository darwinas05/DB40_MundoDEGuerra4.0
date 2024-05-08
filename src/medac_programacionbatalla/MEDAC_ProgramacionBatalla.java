/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medac_programacionbatalla;


import ConnectionDB40.connectionDB40;
import Interfaces.interfasPrincipal;

/**
 * @author danie
 */
public class MEDAC_ProgramacionBatalla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        connectionDB40.conectarDB40();

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
    


