
package controladores;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExploradorFicheros {

    // JLabel para mostrar los archivos seleccionados por el usuario
    private static final JFileChooser fileChooser = new JFileChooser();
    private static String ruta;

    public static String obtenerRuta() {
    if(fileChooser.showOpenDialog(fileChooser)== JFileChooser.APPROVE_OPTION){
        try{
            ruta = fileChooser.getSelectedFile().getAbsolutePath();
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

    public static String escribirFichero(){
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showSaveDialog(fileChooser) == JFileChooser.APPROVE_OPTION){
            try {
                return fileChooser.getSelectedFile().getAbsolutePath();

            } catch (NullPointerException e) {
                System.out.println("No se ha seleccionado ningún fichero");
                return null;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return null;
            }
        }
        else {
            return null;
        }

    }

    public String getNombreFichero(){
        System.out.println(ruta);
        return ruta;
    }

    public static String getRuta() {
        return ruta;
    }
}