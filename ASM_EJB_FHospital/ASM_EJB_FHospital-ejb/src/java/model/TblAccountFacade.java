/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entities.TblAccount;
import java.util.Iterator;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Parameter;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author MacOS
 */
@Stateless
public class TblAccountFacade extends AbstractFacade<TblAccount> {

    @PersistenceContext(unitName = "ASM_EJB_FHospital-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TblAccountFacade() {
        super(TblAccount.class);
    }

    public List<TblAccount> search(String name, String role) {
        Query query = em.createQuery("SELECT t FROM TblAccount t WHERE t.name like ?1 and t.role like ?2");
        query.setParameter(1, "%" + name + "%");
        query.setParameter(2, "%" + role + "%");
        return query.getResultList();
    }

    public String login(String name, String pass) {
        Query query = em.createQuery("SELECT t FROM TblAccount t WHERE t.name like ?1 and t.password like ?2");
        query.setParameter(1, "%" + name + "%");
        query.setParameter(2, "%" + pass + "%");
        return ((TblAccount)query.getResultList().get(0)).getRole();
    }

}
