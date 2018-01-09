
package dao;

public class Event {

    private int id;
    private String dateevent;
    private String timeevent;
    private String planning;
    private String whereevent;
    private String moreinfo;
    
    public Event() {}

    public Event(int id, String dateevent, String timeevent, String planning, String whereevent, String moreinfo) {
        this.id = id;
        this.dateevent = dateevent;
        this.timeevent = timeevent;
        this.planning = planning;
        this.whereevent = whereevent;
        this.moreinfo = moreinfo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateevent() {
        return dateevent;
    }

    public void setDateevent(String dateevent) {
        this.dateevent = dateevent;
    }

    public String getTimeevent() {
        return timeevent;
    }

    public void setTimeevent(String timeevent) {
        this.timeevent = timeevent;
    }

    public String getPlanning() {
        return planning;
    }

    public void setPlanning(String planning) {
        this.planning = planning;
    }

    public String getWhereevent() {
        return whereevent;
    }

    public void setWhereevent(String whereevent) {
        this.whereevent = whereevent;
    }

    public String getMoreinfo() {
        return moreinfo;
    }

    public void setMoreinfo(String moreinfo) {
        this.moreinfo = moreinfo;
    }
    
    
    

}
