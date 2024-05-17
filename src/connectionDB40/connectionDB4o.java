package connectionDB40;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.ext.Db4oException;
import com.db4o.query.Query;
import componentes.personas.Condecorados;
import lecturaFichero.LeerArchivos;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class connectionDB4o {

    public static LeerArchivos leerFiche = new LeerArchivos();
    private static ObjectContainer bd = null;


    /**
     * Método estático para conectar a la base de datos DB4O y realizar una consulta y crear el fichero "Heroes2"
     * @return
     */
    public static ObjectContainer conectarDB40(List<LeerArchivos> condecorados) {
        try {
            // Abre la base de datos (o la crea si no existe) con la configuración por defecto y el nombre de archivo "Heroes2.db4o"
            bd = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "Heroes2.db4o");

            // Crea una nueva consulta
            Query consulta = bd.query();

            // Restringe la consulta a objetos de la clase Condecorados
            consulta.constrain(Condecorados.class);

            // Crea un nuevo objeto Condecorados con algunos valores iniciales
            Condecorados condecoradoss = new Condecorados(null,null,null,"HEROIC","BRONZE STAR MEDAL");
            // Crea una lista vacía para almacenar objetos Condecorados
            List<Condecorados>listaCondecoradoss = new ArrayList<>();

            // Realiza una consulta por ejemplo usando la lista condecorados como ejemplo
            ObjectSet sentencia = bd.queryByExample(condecorados);

            // Itera sobre los resultados de la consulta y los imprime en la consola
            while (sentencia.hasNext()){
                System.out.println(sentencia.next());
            }
        }catch(Db4oException ex){

            System.out.println("Error al conectar " + ex.getMessage());

        }
        return bd;
    }



    /**
     * Metodo para agregar los condecorados a la base de datos.
     * @param condecorados Elemento a guardar a la bases de datos.
     */
    public static void agregarCondecorados(List<Condecorados>condecorados) {
        bd = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"Heroes.csv");
    //para operar.

        bd.store(leerFiche.condecorados);

        System.out.println("Datos insertados:");
        connectionDB4o.cerrarDB40();

    }

// Metodo para cerrar la base de datos...
public static void cerrarDB40(){
        try{
            bd.close();
        }catch (Db4oException e){
            System.out.println("Error al cerrar " + e.getMessage());
        }


}

    public static boolean BBDD(ObjectContainer bd){
    return bd.queryByExample(Condecorados.class).isEmpty();
    }




}
