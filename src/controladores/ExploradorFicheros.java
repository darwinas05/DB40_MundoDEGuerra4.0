
package controladores;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExploradorFicheros {

    // JLabel para mostrar los archivos seleccionados por el usuario
    private static final JFileChooser Chooser = new JFileChooser();
    private static String ruta;

    public static String obtenerRuta() {
    if(Chooser.showOpenDialog(Chooser)== JFileChooser.APPROVE_OPTION){
        try{
            ruta = Chooser.getSelectedFile().getAbsolutePath();
        }catch(NullPointerException e){
            System.out.println("No haz seleccionado ningún fichero");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

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