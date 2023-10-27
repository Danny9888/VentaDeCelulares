package Controller;

import Model.Saldo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import util.JpaUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SaldoController implements RecargaController{
    EntityManager em = JpaUtil.getEntityManager();

    @Override
    public List<Object[]> listarRecargas() {
        List<Object[]> listaSaldo;
        try{
            listaSaldo = em.createQuery("SELECT  s.plan, s.descripcion, s.precio FROM Saldo s", Object[].class).getResultList();
            return listaSaldo;
        }catch (NoResultException e){
            return null;
        }finally {
            em.close();
        }
    }
}
