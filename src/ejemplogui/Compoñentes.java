/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplogui;

import java.awt.Color;
import javax.swing.*;

public class Compoñentes {
    
    //Declaramos todo lo que vamos a meter en el frame
    JFrame marco;
    JPanel panel;
    JLabel etiqueta;
    JTextField lineatexto;
    JButton boton1, boton2;
    
    public void crearCompoñentes(){
    
        //instaniamos compoñentes
        marco = new JFrame();
        panel = new JPanel();
        etiqueta = new JLabel("Etiqueta");
        lineatexto = new JTextField();
        boton1 = new JButton("boton 1");
        boton2 = new JButton("boton 2");
        
        //damoslle caracteristicas os compoñentes
        marco.setSize(650, 650);
        lineatexto.setSize(150, 100);
        panel.setSize(600, 600);
        marco.setBackground(Color.BLUE);
        boton1.setSize(75, 50);
        boton2.setSize(75, 50);
        boton1.setBackground(Color.GRAY);
        boton2.setBackground(Color.GRAY);
        boton1.setToolTipText("Limpa o texto");
        boton2.setToolTipText("Garda o texto");
        
        //posiciones x e y de los complementos
        etiqueta.setBounds(275, 50, 50, 20);
        lineatexto.setBounds(375, 50, 50, 20);
        boton1.setBounds(200, 200, 120, 60);
        boton2.setBounds(375, 200, 120, 60);
        
        //quitar layout automatico para que se posicione bien
        panel.setLayout(null);
        
        //engadimos compoñentes ao panel e o panel ao marco
        panel.add(etiqueta);
        panel.add(lineatexto);
        panel.add(boton1);
        panel.add(boton2);
        marco.add(panel);
        
        //damoslle características
        //hacerlo visible
        marco.setVisible(true);
        
        //cerrar la aplicacion al darle a la x
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //posicion del frame en medio
        marco.setLocationRelativeTo(marco);
                
    }
}