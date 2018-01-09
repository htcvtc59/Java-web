/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import javax.ejb.EJB;
import model.TblExamFacade;

/**
 *
 * @author MacOS
 */
public class ViewBean {

    @EJB
    private TblExamFacade tblExamFacade;

    
    public ViewBean() {
    }
    
     public List<ViewBean> viewList() {
        List<ViewBean> listarr = this.tblExamFacade.findAll();

        List<ViewBean> listtbl = new ArrayList<>();

        for (TblExam tblExam1 : listarr) {
            ViewBean tbl = new ViewBean();
            tbl.setExcode(tblExam1.getExamcode());

            DateTimeFormatter f = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
            DateTime dateTime = f.parseDateTime("2012-01-10 23:13:26");

            tbl.setStatus(tblExam1.getDate());
            listtbl
        }

        return;
    }
    
}
