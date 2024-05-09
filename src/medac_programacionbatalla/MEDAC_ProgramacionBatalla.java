/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medac_programacionbatalla;


import connectionDB40.connectionDB4o;
import Interfaces.interfasPrincipal;
import lecturaXlsx.LeerArchivosDeExcel;

import java.io.File;

/**
 * @author danie
 */
public class MEDAC_ProgramacionBatalla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        File file = new File("Heroes.xlsx");
        if(file.exists()){

            //Instancia de la clase LeerArchivosDeExcel le pasamos el nombre del fichero que queremos leer
            LeerArchivosDeExcel leerArchivosDeExcel = new LeerArchivosDeExcel(file);
        }



        connectionDB4o.conectarDB40();

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
    


