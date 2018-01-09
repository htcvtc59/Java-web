/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

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
public class TblproductFacade extends AbstractFacade<Tblproduct> {

    @PersistenceContext(unitName = "ent_ex-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TblproductFacade() {
        super(Tblproduct.class);
    }

    public void addProduct(int id, String name, float price) {
        Tblproduct tblpro = new Tblproduct();
        tblpro.setId(id);
        tblpro.setName(name);
        tblpro.setPrice((double) price);
        em.persist(tblpro);
    }

    public List<Tblproduct> viewallPro() {
        Query query = em.createNamedQuery("Tblproduct.findAll");
        return query.getResultList();
    }

}
