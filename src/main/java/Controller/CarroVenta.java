package Controller;

import View.InventarioLotes;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import util.JpaUtil;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;


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

    public void agregarProducto(JTable tabla, Object[] obj){
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        int cantidad = (int) obj[0];
        String imei = (String) obj[1];
        String producto = (String) obj[2];
        String descripcion = (String) obj[3];
        double precioVenta = (double) obj[5];
        model.addRow(new Object[]{cantidad, producto, descripcion, precioVenta});
        listaDeProductos.add(imei);

    }


    public void disminuirInventario(){
        InventarioLotes inv = InventarioLotes.getInstance();
        CarroVenta cv = CarroVenta.getInstance();
        JTable table = inv.getTablaInventarioCelularesLotes();
        List<String> lista = cv.getListaDeProductos();
        String itemLista = lista.get(0);
        String itemTabla = (String) table.getValueAt(0,1);
        if (itemTabla.equals(itemLista)){
            table.setValueAt(0,0,0);
        }
    }


    public String sumarTotal(JTable tabla){
        int columna = 3;
        double total = 0;
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        int filas = model.getRowCount();
        System.out.println("Filas, " + filas);
        for(int i = 0 ; i < filas ; i++){
            Object valor = model.getValueAt(i, columna);
                if (valor instanceof Number) {
                    total += ((Number) valor).intValue();
                }
        }
        String totalString = String.valueOf(total);
        return totalString;
    }

}
