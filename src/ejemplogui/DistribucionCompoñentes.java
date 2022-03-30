package ejemplogui;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DistribucionCompoñentes {
    JFrame marco;
    JPanel panel;
    JButton boton1, boton2, boton3, boton4, boton5;
    public void disFlowLayout(){
        marco = new JFrame("Flow Layout");
        marco.setSize(600, 600);
        panel = new JPanel();
        panel.setSize(600, 600);
        boton1 = new JButton("boton1");
        boton2 = new JButton("boton2");
        boton3 = new JButton("boton3");
        boton4 = new JButton("boton4");
        boton5 = new JButton("boton5");
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 20));
        //indicamos el layout que vamos a utilizar
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
        //posicion del frame en medio
        marco.setLocationRelativeTo(marco);
        
        //cerrar la aplicacion al darle a la x
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //damoslle características
        //hacerlo visible
        marco.setVisible(true);
    }
    
    public void Compoñentes(String tipo){
        marco = new JFrame(tipo);
        marco.setSize(600, 600);
        panel = new JPanel();
        panel.setSize(600, 600);
        boton1 = new JButton("boton1");
        boton2 = new JButton("boton2");
        boton3 = new JButton("boton3");
        boton4 = new JButton("boton4");
        boton5 = new JButton("boton5");
    }
    
    public void pecharVentana(){
        //posicion del frame en medio
        marco.setLocationRelativeTo(marco);
        
        //cerrar la aplicacion al darle a la x
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //damoslle características
        //hacerlo visible
        marco.setVisible(true);
    }
    
    public void layout2(){
        this.Compoñentes("FLowLayout");
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 20));
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
        this.pecharVentana();
    }
    
    public void disBoxLayout(){
        this.Compoñentes("BoxLayout");
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
        this.pecharVentana();
    }
    
    public void disBorderLayout(){
        this.Compoñentes("BorderLayout");
        panel.setLayout(new BorderLayout());
        panel.add(boton1, BorderLayout.NORTH);
        panel.add(boton2, BorderLayout.SOUTH);
        panel.add(boton3, BorderLayout.CENTER);
        panel.add(boton4, BorderLayout.EAST);
        panel.add(boton5, BorderLayout.WEST);
        marco.add(panel);
        this.pecharVentana();
    }
    
    public void disGridLayout(){
        this.Compoñentes("GridLayout");
        panel.setLayout(new GridLayout(2,3));
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
        this.pecharVentana();
    }
}
