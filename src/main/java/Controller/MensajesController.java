package Controller;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import util.JpaUtil;

import java.util.List;

public class MensajesController implements RecargaController{
    EntityManager em = JpaUtil.getEntityManager();
    @Override
    public List<Object[]> listarRecargas() {
        List<Object[]> mensajes;
        try {
            mensajes = em.createQuery("SELECT m.id ,m.plan, m.descripcion, m.precio FROM Mensajes m", Object[].class).getResultList();
            return mensajes;
        }catch (NoResultException e){
            return null;
        }finally {
            em.close();
        }
    }
}
