package Controller;

import View.InventarioLotes;
import View.Venta;
import jakarta.persistence.EntityManager;
import util.JpaUtil;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class CarroVenta {
    EntityManager em = JpaUtil.getEntityManager();
    private static final CarroVenta cv = new CarroVenta();
    private List<String> listaDeProductos = new ArrayList<>();

    public List<String> getListaDeProductos() {
        return listaDeProductos;
    }

    public void setListaDeProductos(List<String> listaDeProductos) {
        this.listaDeProductos = listaDeProductos;
    }

    public static CarroVenta getInstance(){
        return cv;
    }

    public void agregarCelular(JTable tabla, Object[] obj){
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        int cantidad = (int) obj[0];
        String imei = (String) obj[1];
        String producto = (String) obj[2];
        String descripcion = (String) obj[3];
        double precioVenta = (double) obj[5];
        model.addRow(new Object[]{cantidad, imei, producto, descripcion, precioVenta});
        listaDeProductos.add(imei);
    }

    public void agregarRecarga(JTable tabla, Object[] obj){
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        Integer cantidad = 1;
        String id = String.valueOf(obj[0]);
        String producto = (String) obj[1];
        String descripcion = (String) obj[2];
        double precioVenta = (double) obj[3];
        model.addRow(new Object[]{cantidad, id, producto, descripcion, precioVenta});
        listaDeProductos.add(id);
    }

    public void disminuirInventario(){
        InventarioLotes inv = InventarioLotes.getInstance();
        CarroVenta cv = CarroVenta.getInstance();
        JTable table = inv.getTablaInventarioCelularesLotes();
        List<String> lista = cv.getListaDeProductos();
        Set<String> listaSet = new HashSet<>(lista);
        int columna = 1;
        for (int i = 0; i < table.getRowCount(); i++) {
            String itemTabla = (String) table.getValueAt(i, columna);
            if (listaSet.contains(itemTabla)) {
                table.setValueAt(0, i, 0);
            }
        }
    }


    public void sumarTotal(){
        int columna = 3;
        double total = 0;
        Venta cv = Venta.getInstance();
        DefaultTableModel model = (DefaultTableModel) cv.getTablaListaProductos().getModel();
        int filas = model.getRowCount();
        System.out.println("Filas, " + filas);
        for(int i = 0 ; i < filas ; i++){
            Object valor = model.getValueAt(i, columna);
                if (valor instanceof Number) {
                    total += ((Number) valor).intValue();
                }
        }
        String totalString = String.valueOf( "Q"+ total);
        cv.getCampoTotal().setText(totalString);
    }

    public void eliminarProducto(){
        Venta venta = Venta.getInstance();
        DefaultTableModel model = (DefaultTableModel)  venta.getTablaListaProductos().getModel();
        CarroVenta cv = CarroVenta.getInstance();
        List<String> lista = cv.getListaDeProductos();
        JTable invLotes = InventarioLotes.getInstance().getTablaInventarioCelularesLotes();
        //Fila y columna de la tabla ventas
        int fila = venta.getTablaListaProductos().getSelectedRow();
        int columna = 1;
        String identificadorItem = (String) model.getValueAt(fila, columna);
        cv.listaDeProductos.remove(identificadorItem);
        model.removeRow(fila);
    }

}
