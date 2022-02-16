
package EjemploArchivos.ejemploarchivos;

import EjemploArchivos.com.alex.lecturaFichero.Lectura;
import java.io.File;

/**
 *
 * @author dam1
 */
public class EjemploArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lectura objLec=new Lectura();
//        File fic=new File("Nomes.txt"); //solo ponemos el nombre porque esta en el directorio raiz del proyecto
//        objLec.leerLinea(fic);
//        File f=new File("/home/dam1/Escritorio/numeros.txt");
//        objLec.leerLinea(f);
        File fi=new File("Nomes.txt");
        objLec.leerNome(fi);
        objLec.leerConDelimitadores(fi, ",");//Al ser con delimitadores, me separa el nombre con el delimitador que decido
    }
    
}
