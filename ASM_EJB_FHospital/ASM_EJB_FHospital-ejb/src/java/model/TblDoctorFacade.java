/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entities.TblDoctor;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author MacOS
 */
@Stateless
public class TblDoctorFacade extends AbstractFacade<TblDoctor> {

    @PersistenceContext(unitName = "ASM_EJB_FHospital-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TblDoctorFacade() {
        super(TblDoctor.class);
    }
    
}
