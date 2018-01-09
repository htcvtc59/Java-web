/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.ejb.EJB;
import model.TblContactFacade;

import java.util.*;
import entities.*;

public class ContactBean {

    @EJB
    private TblContactFacade tblContactFacade;

    private TblContact tblcontact = new TblContact();

    public TblContact getTblcontact() {
        return tblcontact;
    }

    public void setTblcontact(TblContact tblcontact) {
        this.tblcontact = tblcontact;
    }

    public ContactBean() {
    }

    public List<TblContact> findAll() {
        return this.tblContactFacade.findAll();
    }

    public String create() {
        this.tblContactFacade.create(this.tblcontact);
        this.tblcontact = new TblContact();
        return "success";
    }

    public void delete(TblContact tblcontact) {
        this.tblContactFacade.remove(tblcontact);
    }

    public String edit(TblContact tblContact) {
        this.tblcontact = tblContact;
        return "edit";
    }

    public String edit() {
        this.tblContactFacade.edit(this.tblcontact);
        this.tblcontact = new TblContact();
        return "success";
    }

    public List<TblContact> search() {
        if (this.tblcontact.getName() != null) {
            return this.tblContactFacade.search(this.tblcontact.getName());
        } else {
            return this.tblContactFacade.findAll();
        }
    }

}
