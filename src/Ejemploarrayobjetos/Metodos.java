
package Ejemploarrayobjetos;
import LibreriaAlex.*;
import javax.swing.JOptionPane;
/**
 *
 * @author dam1
 */
public class Metodos {
    public static Alumnado[] crearArray(Alumnado[]lista){
        for(int i=0; i<lista.length; i++){
            String nome=LeerDatos.leerStrting("Introduce el nombre del alumno");
            int nota=LeerDatos.leerInt("Introduce la nota del alumno");
            lista[i]=new Alumnado(nome, nota);
        }
        return lista;
    }
    public static void amosar(Alumnado[]lista){
        for(int i=0; i<lista.length; i++){
            System.out.println("Nombre: "+lista[i].getNombre()+" nota: "+ lista[i].getNota());
        }
    }
//    public static Alumnado[] ordenarArray(Alumnado[]lista){
//        for(int i=0; i<lista.length-1; i++){
//            for(int j=i+1; j<lista.length; j++){
//                if(lista[i].compareTo(lista[j])==1){
//                    Alumnado aux=new Alumnado(null, 0);
//                    aux=lista[i];
//                    lista[i]=lista[j];
//                    lista[j]=aux;
//                }
//            }
//        }
//        return lista;
//    }
//     Con un simple sort vale
    public static Alumnado[] mudarNota(Alumnado[]lista){
        int posicion=0;
        int atopado=0;
        String nome=LeerDatos.leerStrting("Introduce el nombre del alumno a buscar");
//        int nota=LeerDatos.leerInt("Introduce la nota del alumno");
        Alumnado al=new Alumnado(nome, 0);
        for(int i=0; i<lista.length-1; i++){
//            if(lista[i].equals(al)){
            if(lista[i].compareTo(al)==0){
                JOptionPane.showMessageDialog(null, lista[i].getNombre()+" está en la lista ");
                posicion=i;
                atopado=1;
            }
        }
        if(atopado==0){
            JOptionPane.showMessageDialog(null, "No está en la lista");
            posicion=-1;
        }
        if(posicion>=0){
            al.setNota(LeerDatos.leerInt("Introduce la nueva nota"));
            lista[posicion]=al;}
        return lista;
    }
}
