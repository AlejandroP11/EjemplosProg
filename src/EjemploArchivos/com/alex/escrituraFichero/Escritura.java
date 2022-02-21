
package EjemploArchivos.com.alex.escrituraFichero;

import ejemploarchivos.Jugador;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dam1
 */
public class Escritura {
    FileWriter fich;
    PrintWriter escribir;
    BufferedWriter bf;
    Jugador x;
    public void escribirNumeros(String nombreFichero){
        try {
            //abrimos el flujo para escribir
            fich=new FileWriter(nombreFichero);//si le pongo false o nada es para escrbir y si le pongo true es para añadir
            escribir=new PrintWriter(fich);
            escribir.println(1);
            escribir.println(2);
            escribir.println(3);
            escribir.println(4);
            escribir.println(5);
            System.out.println("fichero creado con exito");
        } catch (IOException ex) {
            System.out.println("Error escritura 1 "+ex.getMessage());
        }
        finally{
            escribir.close();
        }
    }
        public void añadirNumeros(String nombreFichero){
        try {
            //abrimos el flujo para añadir
            fich=new FileWriter(nombreFichero,true);//si le pongo false o nada es para escrbir y si le pongo true es para añadir
            escribir=new PrintWriter(fich);
            escribir.println(11);
            escribir.println(12);
            escribir.println(13);
            escribir.println(14);
            escribir.println(15);
            System.out.println("elementos añadidos con exito");
        } catch (IOException ex) {
            System.out.println("Error escritura 2 "+ex.getMessage());
        }
        finally{
            escribir.close();
        }
    }
    public void escribirNombres(String nombreFichero){
        try {
            fich=new FileWriter(nombreFichero,true);
            bf=new BufferedWriter(fich);
            bf.write("aaaaaa\n");
            bf.write("bbbbbb\n");
            bf.write("cccccc\n");
            bf.write("dddddd\n");
            bf.close();
            System.out.println("archivo creado con exito");
        } catch (IOException ex) {
            System.out.println("Error escritura 3 "+ex.getMessage());
        }
        finally{
            try {
                fich.close();
            } catch (IOException ex) {
                System.out.println("No se puede cerrar el fichero");
            }
        }
    }
    public void escribirObjetos(String nombreFichero){
        try {
            fich=new FileWriter(nombreFichero,true);
            escribir=new PrintWriter(fich);
            x = new Jugador("aaaaa",111);
            escribir.println(x);
            escribir.println(x=new Jugador("bbbbb", 222));
            x = new Jugador("ccccc", 333);
            escribir.println(x.getNome()+","+x.getDorsal());
            System.out.println("creado el fichero");
        } catch (IOException ex) {
            System.out.println("Error escritura 4 "+ex.getMessage());
        }
        finally{
            try {
                escribir.close();
                fich.close();
            } catch (IOException ex) {
                System.out.println("No se puede cerrar el fichero");
            }
        }
    }
}
