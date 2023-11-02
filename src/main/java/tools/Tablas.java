package tools;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Tablas {

    private static final Tablas tabla = new Tablas();

    public static Tablas getInstance(){
        return tabla;
    }



    public void enter(JTable tablaInventarioCelularesLotes){
        tablaInventarioCelularesLotes.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // No necesitas implementar esto, pero debes proporcionar una implementación
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    // Realizar una acción personalizada en lugar de seleccionar la siguiente fila
                    int selectedRow = tablaInventarioCelularesLotes.getSelectedRow();
                    int selectedColumn = tablaInventarioCelularesLotes.getSelectedColumn();
                    // Aquí puedes realizar la acción que deseas
                    System.out.println("Enter key pressed. Selected Row: " + selectedRow + ", Selected Column: " + selectedColumn);

                    // Evitar que seleccione la siguiente fila automáticamente
                    e.consume();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // No necesitas implementar esto, pero debes proporcionar una implementación
            }
        });
    }
}
