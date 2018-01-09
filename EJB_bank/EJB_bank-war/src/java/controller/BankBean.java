/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.TblAccount;
import java.util.List;
import javax.ejb.EJB;
import model.TblAccountFacade;

public class BankBean {

    @EJB
    private TblAccountFacade tblAccountFacade;

    private TblAccount tblAccount = new TblAccount();

    public TblAccount getTblAccount() {
        return tblAccount;
    }

    public void setTblAccount(TblAccount tblAccount) {
        this.tblAccount = tblAccount;
    }

    public BankBean() {
    }

    public List<TblAccount> findAll() {
        return this.tblAccountFacade.findAll();
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
        return "edit";
    }

    public String edit() {
        this.tblAccountFacade.edit(this.tblAccount);
        this.tblAccount = new TblAccount();
        return "success";
    }

}
