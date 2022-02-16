
package ejemploherdanza;

import paqueteMasajista.Masajista;

/**
 *
 * @author dam1
 */
public class EjemploHerdanza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Futbolista jugador=new Futbolista();
//        System.out.println(jugador);
        Entrenador entrenador=new Entrenador("11111",1,"entrenador","aa",45);
        entrenador.concentrarse();
        entrenador.dirigirPartido();
//        Visibilidad de los métodos
        Masajista mas=new Masajista();
//        mas.darMasaje(); No me deja porque el método es privado
//        mas.darMasaje(); Si es visible porque no tiene modificador
        mas.metodo();
        
    }
    
}
