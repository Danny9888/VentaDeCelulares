package Controller;

import Model.Celular;
import Model.Plan;
import jakarta.persistence.EntityManager;
import util.JpaUtil;

public class CelularController {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.getEntityManager();
        try{
            em.getTransaction().begin();
            Celular celular = new Celular();
            Plan plan = em.find(Plan.class, 1);
            celular.setCodigoBarra("1343443");
            celular.setMarca("HUAWEI");
            celular.setModelo("NOVA");
            celular.setColor("GRIS");
            celular.setIMEI("43197625");
            celular.setNoCelular("50237924768");
            celular.setPrecioCosto(2000);
            celular.setPrecioVenta(5000);
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
