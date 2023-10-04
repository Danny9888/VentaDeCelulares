import Model.Plan;
import jakarta.persistence.EntityManager;
import util.JpaUtil;

import java.util.List;

public class HibernateListar {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.getEntityManager();
        List<Plan> planes = em.createQuery("select p from Plan p").getResultList();
        planes.forEach(System.out::println);
        em.close();
    }
}
