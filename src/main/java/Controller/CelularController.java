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

    public List<Object[]> listarInventarioCelular(String filtroMarca){
        List<Object[]> celulares;
        celulares = em.createQuery("SELECT COUNT(c.codigoBarra),c.codigoBarra, c.marca, c.modelo, p.tipoPlan,c.precioVenta " +
                "FROM Celular c INNER JOIN Plan p ON c.plan = p WHERE c.disponible = true " +
                "AND c.marca LIKE :filtroMarca " +
                "GROUP BY(c.codigoBarra)", Object[].class).setParameter("filtroMarca",  "%" + filtroMarca + "%").getResultList();
        return celulares;
    }
}
