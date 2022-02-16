
package Ejemplotabla;
import LibreriaAlex.LeerDatos;
/**
 *
 * @author dam1
 */
public class MetodosTabla {
    public static int[][] crear (int[][]tabla){
        for(int fila=0;fila<tabla.length;fila++){
            for(int colum=0;colum<tabla[fila].length;colum++){
                tabla[fila][colum]=LeerDatos.leerInt("Dame valores enteros");
            }
        }
        return tabla;
    }
}
