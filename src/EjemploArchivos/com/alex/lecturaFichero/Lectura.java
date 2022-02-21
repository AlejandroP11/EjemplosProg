
package EjemploArchivos.com.alex.lecturaFichero;

import ejemploarchivos.Jugador;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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
    public void amosarPares(File fich){
        String cadena;
        try {
            sc=new Scanner(fich);
            while(sc.hasNextLine()){
                cadena=sc.nextLine();
                String[]lista=cadena.split(",");
                for(int i=0; i<lista.length;i++){
                    if(Integer.parseInt(lista[i])%2==0)
                    System.out.println(lista[i]);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error 4 "+ex.getMessage());
        }
    }
    public void leerObjeto(File fich){
        try {
            String cadena;
            sc=new Scanner(fich);
            while(sc.hasNextLine()){
                cadena=sc.nextLine();
                System.out.println(cadena);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error 5 "+ex.getMessage());
        }
        finally{
            sc.close();
        }
    }
    public ArrayList<Jugador> leerObjetoMeterArray(File fich, String delimitador){
        ArrayList<Jugador>lista = new ArrayList<Jugador>();
        Jugador ju;
        try {
            String cadena;
            sc=new Scanner(fich);
            while(sc.hasNextLine()){
                cadena=sc.nextLine();
                String[]linea=cadena.split(delimitador);
                ju=new Jugador(linea[0], Integer.parseInt(linea[1]));
                lista.add(ju);
            }
            for(Jugador x:lista)
                System.out.println(x);
        } catch (FileNotFoundException ex) {
            System.out.println("Error 5 "+ex.getMessage());
        }
        finally{
            sc.close();
        }
        return lista;
    }
}
