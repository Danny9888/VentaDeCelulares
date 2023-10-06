package Controller;

import Model.Celular;
import Model.Plan;
import jakarta.persistence.EntityManager;
import util.JpaUtil;

import java.util.ArrayList;
import java.util.List;

public class CelularController {
    EntityManager em = JpaUtil.getEntityManager();
    public void guardarCelular(Celular celular, int idPlan){
        try{
            em.getTransaction().begin();
            Plan plan = em.find(Plan.class, idPlan);
            celular.setPlan(plan);
            em.persist(celular);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
            e.printStackTrace();
        }finally{
            em.close();
        }
    }

    public List<Object[]> listarInventarioCelular(){
        List<Object[]> celulares;
        celulares = em.createQuery("SELECT COUNT(c.codigoBarra), c.marca, c.modelo, c.precioVenta FROM Celular c " +
                "GROUP BY(c.codigoBarra)", Object[].class).getResultList();
        return celulares;
    }
}
