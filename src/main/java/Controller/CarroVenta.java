package Controller;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import util.JpaUtil;


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

}
