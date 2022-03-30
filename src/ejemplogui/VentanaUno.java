/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplogui;

import javax.swing.JFrame;

/**
 *
 * @author dam1
 */
public class VentanaUno {
    JFrame marco;
    
    public void crearVentana1 (){
        
        //instanciamos o marco
        marco = new JFrame("PRIMEIRA VENTANA");
        
        //damoslle características
        //hacerlo visible
        marco.setVisible(true);
        
        //cerrar la aplicacion al darle a la x
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //posicion del frame en medio
        marco.setLocationRelativeTo(marco);
        
        //modificar tamaño del frame
        marco.setSize(660, 500);
        
        
        
    }
}
