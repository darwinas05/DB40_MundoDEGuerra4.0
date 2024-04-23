
package controladores;

import javax.swing.*;

public class ExploradorFicheros {

    // JLabel para mostrar los archivos seleccionados por el usuario
   private static String ruta;

    public ExploradorFicheros() {

    }

    public static String leerFichero(){

        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(fileChooser) == JFileChooser.APPROVE_OPTION){
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