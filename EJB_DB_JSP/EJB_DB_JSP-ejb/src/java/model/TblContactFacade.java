/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entities.TblContact;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author MacOS
 */
@Stateless
public class TblContactFacade extends AbstractFacade<TblContact> {

    @PersistenceContext(unitName = "EJB_DB_JSP-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TblContactFacade() {
        super(TblContact.class);
    }

    public List<TblContact> search(String name) {
        Query query = em.createQuery("SELECT t FROM TblContact t WHERE t.name like :name");
        return query.setParameter("name", "%"+name+"%").getResultList();
    }
    
    

}
