package Controller;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import util.JpaUtil;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class CarroVenta {
    EntityManager em = JpaUtil.getEntityManager();

    public Object[] agregarProducto(String IMEI){

        try{
            Object[] celular = em.createQuery("SELECT c.marca, c.modelo, c.precioVenta FROM Celular c " +
                            "WHERE c.IMEI = :imei", Object[].class)
                    .setParameter("imei", IMEI).getSingleResult();
            return celular;
        }catch (NoResultException e){
            e.printStackTrace();
            return null;
        }finally {
            em.close();
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
