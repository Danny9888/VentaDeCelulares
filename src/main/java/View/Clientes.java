package View;
import javax.swing.*;
import java.awt.*;

public class Clientes {

    private JButton guardarButton;
    private JTextField textNombre;
    private JTextField textApellido;
    private JTextField textNit;
    private JTextField textTelefono;
    private JTextField textDireccion;
    private JTextField textDpi;


    public static void main(String[] args) {
        JFrame frame = new JFrame("Registro de Cliente");
        frame.setUndecorated(true);
        frame.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 700);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        frame.setBackground(new Color(0, 0, 0, 150));

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));
        panel.setBackground(new Color(0, 0, 0, 150));

        JLabel titulo = new JLabel("Registro de Cliente");
        titulo.setFont(new Font("SansSerif", Font.BOLD, 32));
        titulo.setForeground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = 2;
        gbc.insets = new Insets(10, 10, 30, 10);
        gbc.gridy = 0;
        panel.add(titulo, gbc);

        // Campos solicitados
        JTextField textNombre = addField(panel, "Nombre", 1);
        JTextField textApellido = addField(panel, "Apellido", 2);
        JTextField textNit = addField(panel, "NIT", 3);
        JTextField textTelefono = addField(panel, "Teléfono", 4);
        JTextField textDireccion = addField(panel, "Dirección", 5);
        JTextField textDpi = addField(panel, "DPI", 6);



        JButton guardarButton = new JButton("Guardar");
        guardarButton.setFont(new Font("SansSerif", Font.PLAIN, 16));
        guardarButton.setBackground(Color.BLACK);  // Color negro para el fondo
        guardarButton.setForeground(Color.WHITE);  // Letras en blanco
        gbc.gridy = 7;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(10, 10, 10, 10);
        panel.add(guardarButton, gbc);

        frame.add(panel);
        frame.setVisible(true);
    }

    private static JTextField addField(JPanel panel, String labelText, int gridy) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridy = gridy;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 10, 10, 10);

        JLabel label = new JLabel(labelText);
        label.setFont(new Font("SansSerif", Font.PLAIN, 16));
        label.setForeground(Color.WHITE);
        gbc.gridx = 0;
        panel.add(label, gbc);

        JTextField textField = new JTextField();
        textField.setFont(new Font("SansSerif", Font.PLAIN, 16));
        textField.setPreferredSize(new Dimension(250, 30));
        textField.setMinimumSize(new Dimension(250, 30));
        textField.setBorder(BorderFactory.createCompoundBorder(textField.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        gbc.gridx = 1;
        panel.add(textField, gbc);

        return textField;


    }
    public JButton getGuardarButton() {
        return guardarButton;
    }

    public JTextField getTextNombre() {
        return textNombre;
    }

    public JTextField getTextApellido() {
        return textApellido;
    }

    public JTextField getTextNit() {
        return textNit;
    }

    public JTextField getTextTelefono() {
        return textTelefono;
    }

    public JTextField getTextDireccion() {
        return textDireccion;
    }

    public JTextField getTextDpi() {
        return textDpi;
    }
}

