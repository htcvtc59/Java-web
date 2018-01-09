/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author MacOS
 */
@Stateless
public class TblcontactFacade extends AbstractFacade<Tblcontact> {

    @PersistenceContext(unitName = "ent_example-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TblcontactFacade() {
        super(Tblcontact.class);
    }

    public int Count() {
        return em.createNamedQuery("Tblcontact.findAll").getResultList().size();
    }
    
    
}
