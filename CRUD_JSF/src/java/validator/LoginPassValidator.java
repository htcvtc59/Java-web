/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("validator.LoginPassValidator")
public class LoginPassValidator implements Validator {

    public LoginPassValidator() {

    }

    @Override
    public void validate(FacesContext fc, UIComponent uic, Object value) throws ValidatorException {

        if (value.toString().length() <= 4) {
            FacesMessage msg
                    = new FacesMessage("Password validation failed.",
                            "Invalid Password for more than 4 length");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(msg);
        }
        if (value.toString().length() == 0) {
            FacesMessage msg
                    = new FacesMessage("Invalid Password value is required");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(msg);
        }
    }

}
