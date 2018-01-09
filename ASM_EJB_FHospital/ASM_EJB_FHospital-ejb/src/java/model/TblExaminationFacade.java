/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entities.TblAccount;
import entities.TblExamination;
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
public class TblExaminationFacade extends AbstractFacade<TblExamination> {

    @PersistenceContext(unitName = "ASM_EJB_FHospital-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TblExaminationFacade() {
        super(TblExamination.class);
    }

    public List<TblAccount> search(String a_date) {
        Query query = em.createQuery("SELECT t FROM TblAccount t, TblExamination e WHERE e.aDate like ?1 and t.id = e.accId",TblAccount.class);
        query.setParameter(1, "%" + a_date + "%");
        return query.getResultList();
    }

    public List<TblAccount> searchd_date(String d_date) {
        Query query = em.createQuery("SELECT t FROM TblAccount t,TblExamination e WHERE e.dDate like ?1 and t.id = e.accId");
        query.setParameter(1, "%" + d_date + "%");
        return query.getResultList();
    }

    public List<TblAccount> searchname(String name) {
        Query query = em.createQuery("SELECT t FROM TblAccount t WHERE t.name like ?1");
        query.setParameter(1, "%" + name + "%");
        return query.getResultList();
    }
    
    
     public List<TblExamination> patientname(String name) {
        Query query = em.createQuery("SELECT e FROM TblExamination e WHERE e.accId IN (SELECT t.id FROM TblAccount t WHERE t.name like ?1)");
        query.setParameter(1, "%" + name + "%");
        return query.getResultList();
    }

}
