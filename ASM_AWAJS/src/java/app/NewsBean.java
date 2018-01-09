package app;

import entity.News;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;
import javax.faces.context.FacesContext;
import model.DataProcessHome;

public class NewsBean {

    private int id;
    private String title;
    private String type;
    private String subcontent;
    private String content;
    private String date;
    private String image;

    private ArrayList items;
    private ArrayList itemstype;

    private Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubcontent() {
        return subcontent;
    }

    public void setSubcontent(String subcontent) {
        this.subcontent = subcontent;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ArrayList getItems() {
        return items;
    }

    public void setItems(ArrayList items) {
        this.items = items;
    }

    public ArrayList getItemstype() {
        return itemstype;
    }

    public void setItemstype(ArrayList itemstype) {
        this.itemstype = itemstype;
    }

    public NewsBean() throws SQLException {
        items = new DataProcessHome().getAll();
        itemstype = new DataProcessHome().listType();
    }

    public String save() throws SQLException {
        DataProcessHome dp = new DataProcessHome();
        if (dp.addNews(getTitle(), getType(), getSubcontent(), getContent(), getDate(), getImage())) {
            return "111";
        } else {
            return "-1";
        }
    }

    public String updatepro(News p) throws SQLException {
        DataProcessHome dp = new DataProcessHome();
        if (dp.updateNews(p.getId(), p.getTitle(), p.getType(), p.getSubcontent(), p.getContent(), p.getDate(), p.getImage())) {
            return "1";
        } else {
            return "-1";
        }
    }

    public String viewedit(int id) throws SQLException {
        itemstype = new DataProcessHome().listType();
        DataProcessHome dp = new DataProcessHome();
        News DetailPro = dp.getNewsById(id);
        System.out.println(DetailPro);
        if (DetailPro != null) {
            System.out.println(DetailPro.getId());
            sessionMap.put("editPro", DetailPro);
            sessionMap.put("editProlist", itemstype);

            return "1";
        } else {
            return "-1";
        }

    }

    public String delete(int id) throws SQLException {
        DataProcessHome dp = new DataProcessHome();
        if (dp.deleteNews(id)) {
            return "11";
        } else {
            return "-1";
        }
    }

    public String newcontent(int id) throws SQLException {
        DataProcessHome dp = new DataProcessHome();
        News DetailPro = dp.getNewsById(id);
        System.out.println(DetailPro);
        if (DetailPro != null) {
            sessionMap.put("editProContent", DetailPro);
            return "11111";
        } else {
            return "-1";
        }

    }

    private ArrayList<News> itemssearch;

    public ArrayList<News> getItemssearch() {
        return itemssearch;
    }

    public void setItemssearch(ArrayList<News> itemssearch) {
        this.itemssearch = itemssearch;
    }

    public String searchbyTitle() throws SQLException {
        itemssearch = new DataProcessHome().SearchByTitle(getTitle());
        sessionMap.put("itemssearchList", itemssearch);
        return "11";
    }

    public String searchbyDate() throws SQLException {
        itemssearch = new DataProcessHome().SearchByDate(getDate());
        sessionMap.put("itemssearchList", itemssearch);
        return "111";
    }

}
