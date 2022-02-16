
package EjemploArchivos.com.alex.lecturaFichero;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dam1
 */
public class Lectura {
    Scanner sc;
    public void leerLinea(File fich){
        String nom;
        try {
            sc=new Scanner(fich);
            while(sc.hasNextLine()){
                nom=sc.nextLine();
                System.out.println(nom);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error 1 "+ex.getMessage());
        }
        finally{
            sc.close();
        }
    }
    public void leerNome(File fich){
        try {
            sc=new Scanner(fich);
            while(sc.hasNext()){
                System.out.println(sc.next()); //next lee hasta un espacio en blanco o \n
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error 2 "+ex.toString());
        }
        finally{
            sc.close();
        }
    }
    public void leerConDelimitadores(File fich, String delimitador){
        try {
            sc=new Scanner(fich).useDelimiter(delimitador);
            while(sc.hasNext()){
                System.out.println(sc.next());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error 3 "+ex.toString());
        }
        finally{
            sc.close();
        }
    }
}
