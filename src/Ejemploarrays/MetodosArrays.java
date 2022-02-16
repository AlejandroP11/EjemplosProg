
package Ejemploarrays;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class MetodosArrays {
    public static float[] crearArray(float[]lista){
        for(int i = 0; i<lista.length;i++){
            lista[i]=Float.parseFloat(JOptionPane.showInputDialog("Teclea nota"));
        }
        return lista;
    }
    public static void amosarArray(float[]lista){
        int op;
            op=Integer.parseInt(JOptionPane.showInputDialog("MENU\n1 con for\n2con for each\n3 con la clase Arrays"));
            switch(op){
                case 1: for(int i=0;i<lista.length;i++){
                        System.out.println("posicion " +i+" = "+lista [i]);
                        }
                        break;
                case 2: for(float elemento:lista)
                        System.out.println(elemento);
                        break;
                case 3: System.out.println(Arrays.toString(lista));
                        break;
                default:System.out.println("Opción incorrecta");        
            }
    }
    public static int buscarElemento(float[]lista){
        float elebus=Float.parseFloat(JOptionPane.showInputDialog("Introduce el elemento a buscar"));
        int atopado=0; //si es cero no está
        int posicion=0;
        for(int i = 0; i<lista.length;i++){
            if(elebus == lista[i]){
                System.out.println(elebus+" está en la lista");
                posicion=i;
                atopado=1;
                break;
            }
        }
        if(atopado==0){
            System.out.println(elebus+" no está");
            posicion=-1;
        }
        return posicion;
    }
    public static float[] ordenarElementos(float[]lista){
//        float aux=0;
//        for(int i=0; i<lista.length-1; i++){
//            for(int j=1; j==lista.length; j++){
//                if(lista[i]>lista[j]){
//                    aux=lista[i];
//                    lista[i]=lista[j];
//                    lista[j]=aux;
//                }
//            }
//        }
        Arrays.sort(lista); 
        return lista;
    }
    public static float[] copiarLista(float[]lista){
        lista=Arrays.copyOf(lista, 8);
        return lista;
    }
    public static float[] borrarElemento(float[]lista){
        int pos=MetodosArrays.buscarElemento(lista); 
        if(pos<0)
            System.out.println("El elemento no se puede borrar");
        else{
            for(int i = pos;i<lista.length-1; i++)
                lista[i]=lista[i+1];
        }
        lista=Arrays.copyOf(lista, lista.length-1);
        return lista;
    }
    public static float[]añadir(float[]lista){
        float eleAña=Float.parseFloat(JOptionPane.showInputDialog("Ingresa el elemento que deseas añadir"));
        lista=Arrays.copyOf(lista, lista.length+1);
        lista[lista.length-1]=eleAña;
        return lista;
    }
    public void salir(){
        System.exit(0);
    }
}
