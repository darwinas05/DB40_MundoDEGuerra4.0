
package controladores;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;

public class ExploradorFicheros {

    // JLabel para mostrar los archivos seleccionados por el usuario
    private static final JFileChooser Chooser = new JFileChooser();
    private static String ruta;


    public static String obtenerRuta() {
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Ficheros CSV","csv");
        Chooser.addChoosableFileFilter(filter);
        Chooser.setSelectedFile(new File("Heroes.csv"));


        try{
        if(Chooser.showOpenDialog(Chooser)== JFileChooser.APPROVE_OPTION) {
            File selectedFile = Chooser.getSelectedFile();
            if (!selectedFile.getName().endsWith(".csv")) {
                throw new Exception("Debes seleccionar un archivo CSV.");
            }
            ruta = Chooser.getSelectedFile().getAbsolutePath();
        }else {
            throw new Exception("No haz seleccionado ningún fichero");
        }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            return ruta;
    }

    public static String leerFichero(String path){

        StringBuilder contenido = new StringBuilder();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String linea;
            while((linea = br.readLine()) != null){
                contenido.append(linea).append("\n");
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return contenido.toString();
    }

    public static String getRuta() {
        return ruta;
    }

    public static void setRuta(String ruta) {
        ExploradorFicheros.ruta = ruta;
    }
}