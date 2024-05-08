package ConnectionDB40;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.ext.Db4oException;
import componentes.personas.Condecorados;
import componentes.personas.General;

import java.util.ArrayList;
import java.util.List;

public class connectionDB40 {

    public ArrayList<Condecorados>obtenerCondecorados = new ArrayList<>();
    private static ObjectContainer bd = null;

    /**
     * Metodo para connection el db4o y crear el fichero "Heroes2"
     * @return
     */
    public static ObjectContainer conectarDB40() {
        try {
            bd = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "C:\\Users\\darwi\\OneDrive\\Documentos\\TrabajosProgramación\\mundos de guerra\\DB40_MundoDEGuerra4.0-conDB40\\ Heroes2.db4o");
            Condecorados condecorados = new Condecorados(null,null,null,null,null);
            ObjectSet sentencia = bd.queryByExample(condecorados);

            while (sentencia.hasNext()){
                System.out.println(sentencia.next());
            }
        }catch(Db4oException ex){
            System.out.println("Error al conectar " + ex.getMessage());

        }
        return bd;
    }

// Metodo para cerrar la base de datos.
public static void cerrarDB40(){
        try{
            bd.close();
        }catch (Db4oException e){
            System.out.println("Error al cerrar " + e.getMessage());
        }


}



}
