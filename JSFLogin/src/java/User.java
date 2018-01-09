
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "user")
@RequestScoped

public class User {

    String name;
    String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String save() {
        if (name.equals("admin") && password.equals("admin")) {
            return "home.xhtml?faces-redirect=true";
        } else {
            return "index.xhtml?faces-redirect=true";
        }
    }

}
