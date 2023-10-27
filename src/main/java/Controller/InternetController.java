package Controller;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import util.JpaUtil;

import java.util.List;

public class InternetController implements RecargaController{
    EntityManager em = JpaUtil.getEntityManager();
    @Override
    public List<Object[]> listarRecargas() {
        List<Object[]> listaInternet;
        try{
            listaInternet = em.createQuery("SELECT i.plan, i.descripcion, i.precio FROM Internet i", Object[].class).getResultList();
            return listaInternet;
        }catch (NoResultException e){
            return null;
        }finally {
            em.close();
        }
    }
}
