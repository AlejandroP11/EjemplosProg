
package ejemplogui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author dam1
 */
public class Eventos implements ActionListener{
    JFrame marco;
    JPanel panel;
    JButton bVerde;
    JButton bAzul;
    
    public void crearEvento(){
        //instanciar y darle caracteristicas a todos los componentes
        marco = new JFrame("*** EVENTOS ***");
        marco.setSize(800, 600);
        panel = new JPanel();
        panel.setSize(800, 600);
        bVerde = new JButton("VERDE");
        bAzul = new JButton("AZUL");
        
        //añadimos los componetes al panel
        panel.add(bVerde);
        panel.add(bAzul);
        
        //añadimos el panel al marco
        marco.add(panel);

        //gestion de eventos
        //ponemos Listeners al boton verde y al boton azul
        bVerde.addActionListener(this); //this porque el ActionPerformed esta en la misma clase 
        bAzul.addActionListener(this); 
        
        //le damos caracteristicas de posicion, cierre y visibilidad al marco
        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //instancio un objeto para recoger la fuente de la accion y saber que boton es el que se esta presionando
        Object ob = e.getSource(); //de no ser de la misma clase (botones) usariamos instanceOf 
        //si es el boton verde
        if(ob == bVerde)
            panel.setBackground(Color.green); //pone el fondo de color verde
        //si es el boton azul
        else  
            panel.setBackground(Color.blue); //pone el fondo de color azul
    }
}
