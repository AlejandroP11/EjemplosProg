
package Ejemploexcepciones;

/**
 *
 * @author dam1
 */
public class EjemploExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MetodosExcepciones obj1=new MetodosExcepciones();
//        obj1.divisionSinExcepcion();0
//        obj1.divisionConCondicionales();
//        obj1.divisionCapturaExcepcion();
//        obj1.divisionConFinally();
//        obj1.divisionLanzandoExcepcion(); -> rompe el programa porque no capturamos la excepción 
////        capturamos la excepción
        try{
            obj1.divisionLanzandoExcepcion();
        }catch(ArithmeticException ex){
            System.out.println("ERROR 2 "+ex.getMessage());
        }
        System.out.println("Fin del programa");
    }
    
}
