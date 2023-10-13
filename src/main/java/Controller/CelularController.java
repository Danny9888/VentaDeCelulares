package Controller;

import Model.Celular;
import Model.Plan;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import util.JpaUtil;

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
        celulares = em.createQuery("SELECT COUNT(c.codigoBarra),c.codigoBarra, MAX(c.marca), MAX(c.modelo), MAX(p.tipoPlan), MAX(c.precioVenta) " +
                "FROM Celular c INNER JOIN Plan p ON c.plan = p WHERE c.disponible = true " +
                "AND c.marca LIKE :filtroMarca " +
                "GROUP BY c.codigoBarra", Object[].class).setParameter("filtroMarca",  "%" + filtroMarca + "%").getResultList();
        return celulares;
    }

    public Object[] buscarCelular(String codigoBarra) {
        try {
            Object[] celular = em.createQuery("SELECT c.codigoBarra, c.marca, c.modelo, c.color, p.tipoPlan " +
                            "FROM Celular c INNER JOIN c.plan p WHERE c.codigoBarra = :codigoBarra " , Object[].class)
                    .setParameter("codigoBarra", codigoBarra).setMaxResults(1)
                    .getSingleResult();
            if (celular != null) {
                System.out.println("Celular encontrado");
                return celular;
            }
        }catch (NoResultException e){
                System.out.println("Celular no encontrado");
        }
        return null;
    }
}
