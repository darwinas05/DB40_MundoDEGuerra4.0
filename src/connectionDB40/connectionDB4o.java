package connectionDB40;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.ext.Db4oException;
import com.db4o.query.Query;
import componentes.personas.Condecorados;

import java.util.ArrayList;

public class connectionDB4o {

    public ArrayList<Condecorados>obtenerCondecorados = new ArrayList<>();
    private static ObjectContainer bd = null;

    /**
     * Metodo para connection el db4o y crear el fichero "Heroes2"
     * @return
     */
    public static ObjectContainer conectarDB40() {
        try {
            bd = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "Heroes2.db4o");
            Query consulta = bd.query();

            consulta.constrain(Condecorados.class);
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

// Metodo para cerrar la base de datos...
public static void cerrarDB40(){
        try{
            bd.close();
        }catch (Db4oException e){
            System.out.println("Error al cerrar " + e.getMessage());
        }


}



}
