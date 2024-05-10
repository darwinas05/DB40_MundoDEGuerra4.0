package lecturaXlsx;



import componentes.personas.Condecorados;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.AreaReference;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Table;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Clase LeerArchivosDeExcel
 * Esta clase proporciona la funcionalidad para leer un archivo Excel (`.xlsx`) y mostrar los valores de la primera celda de cada fila en la consola.
 */
public class LeerArchivosDeExcel {

//
//    /**
//     * Método para leer una tabla específica en un archivo Excel.
//     *
//     * @param nombreFichero La ruta del archivo Excel.
//     * @param nombreTabla El nombre de la tabla que deseas leer.
//     */
//    public static void leerExcel(String nombreFichero, String nombreTabla) {
//        File file = new File(nombreFichero);
//
//        try (InputStream input = new FileInputStream(file)) {
//            // Abre el libro de trabajo
//            XSSFWorkbook workbook = new XSSFWorkbook(input);
//
//            // Buscar la tabla por nombre en el libro de trabajo
//            Table table = workbook.getTable(nombreTabla);
//
//            // Si se encontró la tabla, leer los datos
//            if (table != null) {
//                readTableData(table);
//            } else {
//                System.out.println("Tabla no encontrada: " + nombreTabla);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    /**
//     * Método para leer los datos de una tabla de Excel.
//     *
//     * @param table La tabla de Excel que se va a leer.
//     */
//    private static void readTableData(Table table) {
//        // Obtener el rango de celdas de la tabla
//        AreaReference areaReference = table.getArea();
//        Sheet sheet = table.getSheet();
//        CellReference[] cellReferences = areaReference.getAllReferencedCells();
//
//        // Recorre las filas de la tabla
//        for (CellReference cellReference : cellReferences) {
//            // Obtener la fila correspondiente de la hoja
//            Row row = sheet.getRow(cellReference.getRow());
//
//            // Verificar si la fila es nula
//            if (row != null) {
//                // Obtener la celda correspondiente de la fila
//                Cell cell = row.getCell(cellReference.getCol());
//
//                // Verificar si la celda es nula
//                if (cell != null) {
//                    // Imprimir el valor de la celda
//                    switch (cell.getCellType()) {
//                        case STRING:
//                            System.out.println(cell.getStringCellValue());
//                            break;
//                        case NUMERIC:
//                            System.out.println(cell.getNumericCellValue());
//                            break;
//                        case BOOLEAN:
//                            System.out.println(cell.getBooleanCellValue());
//                            break;
//                        default:
//                            System.out.println("Tipo de celda no soportado: " + cell.getCellType());
//                            break;
//                    }
//                }
//            }
//        }
//    }

    //para leer csv.

    public List<Condecorados> leerCsv() {

        List<Condecorados> obtenerCondecorados = new ArrayList<>();
        String csvFile = "Heroes.csv";
        String linea;
        String csvSplitby = " ; ";

        try(BufferedReader br = new BufferedReader(new FileReader (csvFile))){

            linea = br.readLine();
            String[] encabezado = linea.split(csvSplitby);
            int indiceLastName = 0;
            int indiceFirstName = 1;
            int indiceOfficerOrEnlisted = 5;
            int indiceTypeOfAction = 13;
            int indiceNameOfApproved = 23;

            while ((linea = br.readLine()) != null) {
                String[] columna = linea.split(csvSplitby);

                Condecorados objeto = new Condecorados(
                        columna[indiceLastName].trim(),
                        columna[indiceFirstName].trim(),
                        columna[indiceOfficerOrEnlisted].trim(),
                        columna[indiceTypeOfAction].trim(),
                        columna[indiceNameOfApproved].trim()
                );

                obtenerCondecorados.add(objeto);
            }

        }catch (Exception ex){
            System.out.println(ex.getMessage());

        }
        return obtenerCondecorados;
    }

}



