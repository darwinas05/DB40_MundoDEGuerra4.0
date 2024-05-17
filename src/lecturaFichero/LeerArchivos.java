package lecturaFichero;

import componentes.personas.Condecorados;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase LeerArchivosDeExcel
 * Esta clase proporciona la funcionalidad para leer un archivo ".csv".
 */
public class LeerArchivos {

    public List<Condecorados> ListadeCondecorados = new ArrayList<>();
    private BufferedReader leer;
    private String linia;
    private String partes[] = null;

    /**
     * Lee un archivo CSV y muestra su contenido en la consola.
     *
     * @param nombreFichero Nombre del archivo CSV a leer.
     */
    public void leerFichero(String nombreFichero){
        try(BufferedReader leer = new BufferedReader(new FileReader(nombreFichero))){
            String linea;

            while ((linea = leer.readLine()) != null){
                String[] partes = linea.split(";");
                if (partes.length == 5){
                    String lastName = partes[0];
                    String firstName = partes[1];
                    String officerOrEnlisted = partes[2];
                    String typeOfActionComm = partes[3];
                    String nameOfApprovedAward = partes[4];
                    /**
                     *Creamos un objeto de tipo Condecorados para almacenar
                     *los datos del fichero.
                     */
                    Condecorados condecorado = new Condecorados(lastName, firstName, officerOrEnlisted, typeOfActionComm, nameOfApprovedAward);
                    /**
                     *A las lista condecorados que ya creamos anterior mente le agregamos
                     *el contenido que guarda "condecorado".
                     */
                    ListadeCondecorados.add(condecorado);
                }else{
                    System.out.println(linea);
                    imprimirCondecorados();

                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Imprime una línea de datos en la consola.
     */
    public void imprimirCondecorados() {
        for (Condecorados condecorado : ListadeCondecorados) {

            System.out.printf(condecorado.getLastName(), condecorado.getFirstName(),
                    condecorado.getOfficerOrEnlisted(), condecorado.getTypeOfActionComm(), condecorado.getNameOfApprovedAward());
        }
    }
}