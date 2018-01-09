/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Employees;
import java.util.List;
import javax.ejb.EJB;
import model.EmployeesFacade;

/**
 *
 * @author MacOS
 */
public class EmployeesBean {

    @EJB
    private EmployeesFacade employeesFacade;

    private Employees e = new Employees();

    public Employees getE() {
        return e;
    }

    public void setE(Employees e) {
        this.e = e;
    }

    public EmployeesBean() {
    }

    public List<Employees> findAllEmployees() {
        return this.employeesFacade.findAll();
    }

    public String createEmployee() {
        this.employeesFacade.create(this.e);
        this.e = new Employees();
        return "success";
    }

}
