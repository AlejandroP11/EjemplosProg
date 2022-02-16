
package Ejemplocolecciones;

import java.util.ArrayList;
import LibreriaAlex.LeerDatos;
import java.util.Iterator;

/**
 *
 * @author dam1
 */
public class MetodosArrayList {
    public static ArrayList<Integer> añadir (ArrayList<Integer> lista){
        int v=LeerDatos.leerInt("teclea número");
//        lista.add(new Integer(v)) ---> también lo podríamos hacer así
        lista.add(v);
        return lista;
    }
    public static void amosarFor(ArrayList<Integer> lista){
        for(int i=0;i<lista.size();i++)
            System.out.println(lista.get(i));
    }
    public static void amosarIterator(ArrayList<Integer> lista){
        Iterator it=lista.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}
