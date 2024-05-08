package Connection_DB40;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.ext.Db4oIOException;
import componentes.personas.General;

public class DB40 {

    private static ObjectContainer bd = null;

    public static ObjectContainer conectarDB40() {
        bd = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"C:\\Users\\darwi\\OneDrive\\Documentos\\TrabajosProgramación\\mundos de guerra\\ Heroes2.db4o");
        return bd;
    }


public static void desconectarDB40(){
        bd.close();
}



}
