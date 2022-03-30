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
public class VentanaDos extends JFrame{
        public void crearVentanaDos (){
    //instanciamos o marco y le damos nombre extendiendo el jframe
        this.setTitle("Ventana 2");
        
        //damoslle características
        //hacerlo visible
        this.setVisible(true);
        
        //cerrar la aplicacion al darle a la x
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //posicion del frame en medio
        this.setLocationRelativeTo(this);
        
        //modificar tamaño del frame
        this.setSize(660, 500);
        
    }
}
