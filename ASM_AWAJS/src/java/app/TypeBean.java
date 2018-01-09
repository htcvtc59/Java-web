
package app;

import entity.TypeCate;
import java.util.ArrayList;
import java.util.Map;
import javax.faces.context.FacesContext;
import model.DataProcessHome;

public class TypeBean {

    private int id;
    private String type;
    private ArrayList items;
    private Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList getItems() {
        return items;
    }

    public void setItems(ArrayList items) {
        this.items = items;
    }

    public TypeBean() {
        items = new DataProcessHome().listType();

    }

    public String save() {
        System.out.println(getType());
        DataProcessHome dp = new DataProcessHome();
        if (dp.addType(getType())) {
            return "111";
        } else {
            return "-1";
        }
    }

    public String updatepro(TypeCate p) {
        DataProcessHome dp = new DataProcessHome();
        if (dp.editType(p.getId(), p.getType())) {
            return "1";
        } else {
            return "-1";
        }
    }

    public String viewedit(int id) {
        DataProcessHome dp = new DataProcessHome();
        TypeCate DetailPro = dp.detailType(id);
        System.out.println(DetailPro);
        if (DetailPro != null) {
            System.out.println(DetailPro.getId());
            sessionMap.put("editPro", DetailPro);

            return "1";
        } else {
            return "-1";
        }

    }

    public String delete(int id) {
        DataProcessHome dp = new DataProcessHome();
        if (dp.deleteType(id)) {
            return "11";
        } else {
            return "-1";
        }
    }

}
