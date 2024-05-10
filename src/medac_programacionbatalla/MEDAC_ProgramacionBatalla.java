/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medac_programacionbatalla;


import componentes.personas.Condecorados;
import connectionDB40.connectionDB4o;
import Interfaces.interfasPrincipal;
import lecturaXlsx.LeerArchivosDeExcel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;


/**
 * @author danie
 */
public class MEDAC_ProgramacionBatalla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


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
    


