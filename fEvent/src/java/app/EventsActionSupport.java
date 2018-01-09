/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import dao.Event;
import dbs.Dbs;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;


public class EventsActionSupport extends ActionSupport  implements ModelDriven<Event>{

    private Event e = new Event();
    private Dbs db = new Dbs();
    private ArrayList<Event> arrEvent = new ArrayList<>();
    
    private final static String SUCCESS = "success";

    public EventsActionSupport() {
    }

    public Event getE() {
        return e;
    }

    public void setE(Event e) {
        this.e = e;
    }

    public ArrayList<Event> getArrEvent() {
        return arrEvent;
    }

    public void setArrEvent(ArrayList<Event> arrEvent) {
        this.arrEvent = arrEvent;
    }
    
    
    public String execute() throws Exception {
        return SUCCESS;
    }

    public String action1() {
        arrEvent = db.listEvents();
        return SUCCESS;
    }

    public String action3() {
        db.addEvents(e.getDateevent(),e.getTimeevent(),e.getPlanning(),e.getWhereevent(), e.getMoreinfo());
        return SUCCESS;
    }


//    list data create
    private List<String> listTime = new ArrayList<>();
    
    public String actionlist() {
        listTime.add("1:00 am");
        listTime.add("2:00 am");
        listTime.add("3:00 pm");
        listTime.add("8:00 pm");
        return SUCCESS;
    }

    public List<String> getListTime() {
        return listTime;
    }

    public void setListTime(List<String> listTime) {
        this.listTime = listTime;
    }

    
    public Event getModel() {
        return e;
    }

    
    
}
