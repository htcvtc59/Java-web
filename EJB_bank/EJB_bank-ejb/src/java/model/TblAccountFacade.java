/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entities.TblAccount;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author MacOS
 */
@Stateless
public class TblAccountFacade extends AbstractFacade<TblAccount> {

    @PersistenceContext(unitName = "EJB_bank-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TblAccountFacade() {
        super(TblAccount.class);
    }
    
}
