
package Ejemploarrays;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class EjemploArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;  
        int tam=Integer.parseInt(JOptionPane.showInputDialog("Cuántos elementos quieres"));
        float[]notas = new float[tam];
        MetodosArrays obj=new MetodosArrays();
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog("*** Menú Array ***\n1 Crear array\n2 Amosar array\n3 Buscar elemento\n4 Ordenar elementos\n5 Copiar lista\n6 Borrar elemento"
                    + "\n7 Añadir elemento\n8 SALIR\n*** Introduce la opción deseada ***"));
            switch(opcion){
                case 1 : notas = obj.crearArray(notas);
                break;
                case 2 : MetodosArrays.amosarArray(notas);
                break;
                case 3 : MetodosArrays.buscarElemento(notas);
                break;
                case 4 : MetodosArrays.ordenarElementos(notas);
                break;
                case 5 : notas=MetodosArrays.copiarLista(notas);
                break;
                case 6 : notas=MetodosArrays.borrarElemento(notas);
                break;
                case 7 : notas=MetodosArrays.añadir(notas);
                break;
                case 8 :obj.salir();
            }
            }while(opcion < 10);
    }
    
}
