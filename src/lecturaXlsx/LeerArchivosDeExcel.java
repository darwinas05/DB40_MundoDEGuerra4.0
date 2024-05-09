package lecturaXlsx;

import componentes.personas.Condecorados;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Clase LeerArchivosDeExcel
 */
public class LeerArchivosDeExcel {


    /**
     * Constructor de la clase, recibe un objeto File con el nombre del archivo
     *
     * @param fileName Objeto File con el nombre del archivo Excel (.xlsx)
     */
    public LeerArchivosDeExcel(File fileName) {

        // Lista para almacenar los datos de las celdas
        List obtenerCondecorados = new ArrayList<>();

        try {
            // FileInputStream obtiene bytes de entrada desde un archivo en
            // un sistema de archivos.
            FileInputStream fileInputStream = new FileInputStream(fileName);

            // XSSFWorkbook crea un libro de trabajo de Excel (.xlsx)
            XSSFWorkbook workBook = new XSSFWorkbook(fileInputStream);
            XSSFSheet hddfSheet = workBook.getSheetAt(0);

            //Creamos un iterador para recorrer las filas del fichero.
            Iterator rowIterator = hddfSheet.rowIterator();

            //Creamos un while para mobernos entre las filas.
            while (rowIterator.hasNext()){
                XSSFRow hssfRow = (XSSFRow) rowIterator.next();

                //Ahora almacenamos los datos en el iterador.
                //creamos el objeto iterator de tipo Iterator al cual le asignamos el objeto "hssfRow"
                // con el metodo" cellIterator() ", es dicir que el objeto "iterator" sera de tipo: "hssfRow".
                Iterator iterator = hssfRow.cellIterator();

                //
                List cellTemporal = new ArrayList();
                // Este while nos va a permitir movernos por los datos de cada fila.
                while (iterator.hasNext()){
                //Almacenamos los datos de cada celda en el hssfCell
                    XSSFCell hssfCell = (XSSFCell) iterator.next();
                    //Los datos almacenados en el hssfCell los almacenamos en el objeto cellTemporal
                    cellTemporal.add(hssfCell);
                }
                //datos almacenados en el cellTemporal los almacenamos en el obtenerCondecorados.
                obtenerCondecorados.add(cellTemporal);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        obtener(obtenerCondecorados);
    }


    /**
     *
     * @param listaDeDatos
     */
    private void obtener(List listaDeDatos){
        for (int i = 0; i < listaDeDatos.size(); i ++ ){
            //obtenemos los datos listaDeDatos y los almacenamos en listaTemporal
            List listaTemporal = (List) listaDeDatos.get(i);
            for (int b = 0; b < listaTemporal.size(); b++){
                XSSFCell hssfCell = (XSSFCell) listaTemporal.get(b);
                System.out.println(hssfCell+" ");
            }
            System.out.println( );
    }
}



}
