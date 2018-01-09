/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.ejb.EJB;
import model.TblDoctorFacade;
import entities.*;
import java.util.List;
import model.*;

public class DoctorBean {

    @EJB
    private TblDoctorFacade tblDoctorFacade;

    private TblDoctor tblDoctor = new TblDoctor();

    public TblDoctor getTblDoctor() {
        return tblDoctor;
    }

    public void setTblDoctor(TblDoctor tblDoctor) {
        this.tblDoctor = tblDoctor;
    }

    public DoctorBean() {
    }
    
    public List<TblDoctor> findAll() {
        return this.tblDoctorFacade.findAll();
    }

    public String create() {
        this.tblDoctorFacade.create(this.tblDoctor);
        this.tblDoctor = new TblDoctor();
        return "success";
    }

    public void delete(TblDoctor tblDoctor) {
        this.tblDoctorFacade.remove(tblDoctor);
    }

    public String edit(TblDoctor tblDoctor) {
        this.tblDoctor = tblDoctor;
        return "editdoctor";
    }

    public String edit() {
        this.tblDoctorFacade.edit(this.tblDoctor);
        this.tblDoctor = new TblDoctor();
        return "success";
    }
}
