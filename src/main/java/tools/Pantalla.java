package tools;

import javax.swing.*;

public class Pantalla {
    private static final Pantalla pantalla = new Pantalla();



    private Pantalla(){
    }

    public void abrirPantalla(JFrame ventana, int width, int height){
        ventana.setSize(width, height);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static Pantalla getInstance(){
        return pantalla;
    }


}
