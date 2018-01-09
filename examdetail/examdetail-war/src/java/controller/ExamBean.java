/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.TblExam;
import java.util.List;
import javax.ejb.EJB;
import model.TblExamFacade;

/**
 *
 * @author MacOS
 */
public class ExamBean {

    @EJB
    private TblExamFacade tblExamFacade;

    private TblExam tblExam = new TblExam();

    public TblExam getTblExam() {
        return tblExam;
    }

    public void setTblExam(TblExam tblExam) {
        this.tblExam = tblExam;
    }

    public ExamBean() {
    }

    public List<TblExam> findAll() {
        return this.tblExamFacade.findAll();
    }

    public String create() {
        this.tblExamFacade.create(this.tblExam);
        this.tblExam = new TblExam();
        return "success";
    }

    public void delete(TblExam tblExam) {
        this.tblExamFacade.remove(tblExam);
    }

    public String edit(TblExam tblExam) {
        this.tblExam = tblExam;
        return "edit";
    }

    public String edit() {
        this.tblExamFacade.edit(this.tblExam);
        this.tblExam = new TblExam();
        return "success";
    }


}
