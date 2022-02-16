
package Ejemplocolecciones;

import java.util.ArrayList;

/**
 *
 * @author dam1
 */
public class EjemploColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        ArrayList listaNum=new ArrayList();
//        listaNum.add(3);
//        listaNum.add(4);
//        listaNum.add(3.6);
//        listaNum.add("****");
//        for(int i=0;i<listaNum.size();i++){
//            System.out.println(listaNum.get(i));
//        }
        ArrayList <Integer> listaNum2=new ArrayList <Integer>();
        listaNum2.add(1);
        listaNum2.add(2);
        listaNum2.add(3);
        listaNum2.add(4);
        MetodosArrayList.amosarFor(listaNum2);
        System.out.println("eliminamos el elemento de la posicion 3 (para el usuario)");
        listaNum2.remove(2);
//        MetodosArrayList.añadir(listaNum2);
//        MetodosArrayList.amosarFor(listaNum2);
        MetodosArrayList.amosarIterator(listaNum2);
        listaNum2.add(2, 3);
        MetodosArrayList.amosarFor(listaNum2);
        System.out.println("Damos de baja el número dos");
        listaNum2.remove(new Integer(2));
//        listaNum2.remove(listaNum2.indexOf(2)); ---> tambien lo puedo hacer asi
        MetodosArrayList.amosarIterator(listaNum2);
    }
    
}
