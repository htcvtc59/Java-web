package controller;

import javax.ejb.EJB;
import model.TblExaminationFacade;
import entities.*;
import java.util.List;
import model.*;

public class ExaminationBean {

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

    public ExaminationBean() {
    }

    public List<TblExamination> findAll() {
        return this.tblExaminationFacade.findAll();
    }

    public String create() {
        this.tblExaminationFacade.create(this.tblExamination);
        this.tblExamination = new TblExamination();
        return "success";
    }

    public void delete(TblExamination tblExamination) {
        this.tblExaminationFacade.remove(tblExamination);
    }

    public String edit(TblExamination tblExamination) {
        this.tblExamination = tblExamination;
        return "editexamination";
    }

    public String edit() {
        this.tblExaminationFacade.edit(this.tblExamination);
        this.tblExamination = new TblExamination();
        return "success";
    }

    public List<TblAccount> findAllAccount() {
        return this.tblAccountFacade.findAll();
    }

    public List<TblDoctor> findAllDoctor() {
        return this.tblDoctorFacade.findAll();
    }

}
