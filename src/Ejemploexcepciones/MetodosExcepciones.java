
package Ejemploexcepciones;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class MetodosExcepciones {
    public void divisionSinExcepcion(){
        int numerador, denominador, resultado;
        numerador=Integer.parseInt(JOptionPane.showInputDialog("Introducir el numerador"));
        denominador=Integer.parseInt(JOptionPane.showInputDialog("Introduce el denominador"));
        resultado=numerador/denominador;
        System.out.println("division="+resultado);
    }
    public void divisionConCondicionales(){
        int numerador, denominador, resultado;
        numerador=Integer.parseInt(JOptionPane.showInputDialog("Introducir el numerador"));
        denominador=Integer.parseInt(JOptionPane.showInputDialog("Introduce el denominador"));
        if(denominador==0)
            System.out.println("no se puede dividir entre cero");
        else{
        resultado=numerador/denominador;
        System.out.println("division="+resultado);
        }
    }
    public void divisionCapturaExcepcion(){
        int numerador, denominador, resultado;
        numerador=Integer.parseInt(JOptionPane.showInputDialog("Introducir el numerador"));
        denominador=Integer.parseInt(JOptionPane.showInputDialog("Introduce el denominador"));
        try{
            resultado=numerador/denominador;
            System.out.println("division="+resultado);
        }catch(ArithmeticException ex){
            System.out.println("ERROR 1 "+ ex.getMessage());
        }//Si tuviera más excepciones irían una seguida de la otra, además debemos ir siempre del más específico al más general
        System.out.println("Finaliza el programa");
    }
    public void divisionConFinally(){
        int numerador, denominador, resultado;
        numerador=Integer.parseInt(JOptionPane.showInputDialog("Introducir el numerador"));
        denominador=Integer.parseInt(JOptionPane.showInputDialog("Introduce el denominador"));
        try{
            resultado=numerador/denominador;
            System.out.println("division="+resultado);
        }catch(ArithmeticException ex){
            System.out.println("ERROR 1 "+ ex.getMessage());
        }finally{
            System.out.println("Este bloque se ejecuta siempre");
        }
        System.out.println("Finaliza el programa");
    }
    public void divisionLanzandoExcepcion() throws ArithmeticException{
        int numerador, denominador, resultado;
        numerador=Integer.parseInt(JOptionPane.showInputDialog("Introducir el numerador"));
        denominador=Integer.parseInt(JOptionPane.showInputDialog("Introduce el denominador"));
        if(denominador==0)
            throw new ArithmeticException("OJO, no puedes dividir entre cero");
        else{
        resultado=numerador/denominador;
        System.out.println("division="+resultado);
        }     
    }
}
