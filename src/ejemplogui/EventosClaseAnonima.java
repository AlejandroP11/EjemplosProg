
package ejemplogui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author dam1
 */
public class EventosClaseAnonima {
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
        bVerde.addActionListener(new ActionListener(){//llamamos a la interfaz ActionListener e instanciamos la clase anonima con el unico metodo de esta interfaz
            @Override
            public void actionPerformed(ActionEvent e) {//cuando se presione el boton 
                panel.setBackground(Color.green);//pone el fondo de color verde
            }
        });
        bAzul.addActionListener(new ActionListener(){//llamamos a la interfaz ActionListener e instanciamos la clase anonima con el unico metodo de esta interfaz
            @Override
            public void actionPerformed(ActionEvent e) {//cuando se presione el boton
                panel.setBackground(Color.blue);//pone el fondo de color azul 
            }
        });
        
        //le damos caracteristicas de posicion, cierre y visibilidad al marco
        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}
