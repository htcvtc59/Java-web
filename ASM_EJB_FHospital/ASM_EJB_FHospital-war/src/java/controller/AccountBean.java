/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.ejb.EJB;
import model.TblAccountFacade;
import entities.*;
import java.util.List;
import model.*;

public class AccountBean {

    @EJB
    private TblAccountFacade tblAccountFacade;

    @EJB
    private TblDoctorFacade tblDoctorFacade;

    @EJB
    private TblExaminationFacade tblExaminationFacade;

    private TblExamination tblExamination = new TblExamination();

    public TblExamination getTblExamination() {
        return tblExamination;
    }

    public void setTblExamination(TblExamination tblExamination) {
        this.tblExamination = tblExamination;
    }

    private TblAccount tblAccount = new TblAccount();

    public TblAccount getTblAccount() {
        return tblAccount;
    }

    public void setTblAccount(TblAccount tblAccount) {
        this.tblAccount = tblAccount;
    }

    public AccountBean() {
    }

    public List<TblAccount> findAll() {
        return this.tblAccountFacade.findAll();
    }

    private String nameacc;

    public String getNameacc() {
        return nameacc;
    }

    public void setNameacc(String nameacc) {
        this.nameacc = nameacc;
    }

    public String login() {
        String login = this.tblAccountFacade.login(this.tblAccount.getName(), this.tblAccount.getPassword());
        this.setNameacc(this.tblAccount.getName());
        this.tblAccount = new TblAccount();
        if (login.equalsIgnoreCase("admin")) {
            return "admin";
        } else {
            return "patient";
        }
    }

    public String create() {
        this.tblAccountFacade.create(this.tblAccount);
        this.tblAccount = new TblAccount();
        return "success";
    }

    public void delete(TblAccount tblAccount) {
        this.tblAccountFacade.remove(tblAccount);
    }

    public String edit(TblAccount tblAccount) {
        this.tblAccount = tblAccount;
        return "editaccount";
    }

    public String edit() {
        this.tblAccountFacade.edit(this.tblAccount);
        this.tblAccount = new TblAccount();
        return "success";
    }

    private String keyname;
    private String keyadate;
    private String keyddate;

    public String getKeyname() {
        return keyname;
    }

    public void setKeyname(String keyname) {
        this.keyname = keyname;
    }

    public String getKeyadate() {
        return keyadate;
    }

    public void setKeyadate(String keyadate) {
        this.keyadate = keyadate;
    }

    public String getKeyddate() {
        return keyddate;
    }

    public void setKeyddate(String keyddate) {
        this.keyddate = keyddate;
    }

    public List<TblAccount> search() {
        try {
            if (this.getKeyname().length() > 0) {
                return this.tblExaminationFacade.searchname(this.getKeyname());
            }
            if (this.getKeyadate().length() > 0) {
                return this.tblExaminationFacade.search(this.getKeyadate());
            }
            if (this.getKeyddate().length() > 0) {
                return this.tblExaminationFacade.searchd_date(this.getKeyddate());
            }
            return this.tblAccountFacade.findAll();
        } catch (Exception e) {
        }
        return null;
    }

    public List<TblExamination> patient() {
        return this.tblExaminationFacade.patientname(this.getNameacc());
    }

}
