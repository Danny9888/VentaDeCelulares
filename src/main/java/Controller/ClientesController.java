package Controller;

import Model.Cliente;
import View.Clientes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientesController {

    private Clientes vista;

    public ClientesController(Clientes vista) {
        this.vista = vista;
        this.vista.getGuardarButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarCliente();
            }
        });
    }

    private void guardarCliente() {
        String nombre = vista.getTextNombre().getText();
        String apellido = vista.getTextApellido().getText();
        String nit = vista.getTextNit().getText();
        String telefono = vista.getTextTelefono().getText();
        String direccion = vista.getTextDireccion().getText();
        String dpi = vista.getTextDpi().getText();

        Cliente cliente = new Cliente(nombre, apellido, nit, telefono, direccion, dpi);
        System.out.println(cliente); // Por ahora, simplemente imprimimos el cliente creado.
        // Puedes reemplazar esta línea por la lógica para guardar el cliente en la base de datos.
    }

    public static void main(String[] args) {
        Clientes vista = new Clientes();
        ClientesController controlador = new ClientesController(vista);
    }
}

