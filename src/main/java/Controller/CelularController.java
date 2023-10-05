package Controller;

import Model.Celular;
import Model.Plan;
import jakarta.persistence.EntityManager;
import util.JpaUtil;

public class CelularController {
    public void guardarCelular(Celular celular, int idPlan){
        EntityManager em = JpaUtil.getEntityManager();
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

}
