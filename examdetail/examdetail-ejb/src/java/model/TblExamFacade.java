/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entities.TblExam;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author MacOS
 */
@Stateless
public class TblExamFacade extends AbstractFacade<TblExam> {

    @PersistenceContext(unitName = "examdetail-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TblExamFacade() {
        super(TblExam.class);
    }
    
    
    
}
