package Controller;

import Model.Cliente;
import View.Clientes;

import javax.swing.*;

public class ClientesController {

    private Cliente modelo;
    private Clientes vista;

    public ClientesController(Cliente modelo, Clientes vista) {
        this.modelo = modelo;
        this.vista = vista;

        initController();
    }

    private void initController() {
        vista.getJButton1().addActionListener(e -> guardarCliente());
    }

    private void guardarCliente() {
        try {
            String dpi = vista.getJTextField1().getText();
            String nombre = vista.getJTextField9().getText();
            String apellido = vista.getJTextField2().getText();
            String nit = vista.getJTextField8().getText();
            String telefono = vista.getJTextField7().getText();
            String direccion = vista.getJTextField7().getText();

            modelo.setDpi(dpi);
            modelo.setNombre(nombre);
            modelo.setApellido(apellido);
            modelo.setNit(nit);
            modelo.setTelefono(telefono);
            modelo.setDireccion(direccion);



            JOptionPane.showMessageDialog(null, "Cliente guardado con éxito");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el cliente: " + e.getMessage());
        }
    }


    public void setModelAndView(Cliente modelo, Clientes vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
}
