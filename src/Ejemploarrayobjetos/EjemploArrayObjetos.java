
package Ejemploarrayobjetos;
import LibreriaAlex.LeerDatos;
import java.util.Arrays;
/**
 *
 * @author dam1
 */
public class EjemploArrayObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Alumnado alum1=new Alumnado("aa",5);
//        Alumnado alum2=new Alumnado("aa",5);
//        Alumnado alum3=alum1;
//        boolean res=(alum1==alum3)?true:false;
//        System.out.println(res);
//        System.out.println("con equals "+alum1.equals(alum2));
//        System.out.println("con equals alum3 "+alum1.equals(alum3));
        int op;
        Alumnado[]alumnos=new Alumnado[5];
        do{
            op=LeerDatos.leerInt("*** MENU ***\n1 Crear Array\n2 Mostrar Array\n3 Ordenar Array\n4 Cambiar nota");
            switch(op){
                case 1 : alumnos=Metodos.crearArray(alumnos);
                break;
                case 2 : Metodos.amosar(alumnos);
                break;
//                case 3 : alumnos=Metodos.ordenarArray(alumnos);
                case 3 : Arrays.sort(alumnos);
                break;
                case 4 : alumnos=Metodos.mudarNota(alumnos);
                break;
            }
        }while(op<10);
        
    }
    
}
