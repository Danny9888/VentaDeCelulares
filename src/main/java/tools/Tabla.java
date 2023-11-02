package tools;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Tabla {

    private static final Tabla tabla = new Tabla();

    public static Tabla getInstance(){
        return tabla;
    }



    public void enter(JTable tablaInventarioCelularesLotes){
        tablaInventarioCelularesLotes.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    int selectedRow = tablaInventarioCelularesLotes.getSelectedRow();
                    int selectedColumn = tablaInventarioCelularesLotes.getSelectedColumn();
                    e.consume();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    }
}
