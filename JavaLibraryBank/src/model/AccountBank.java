/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author MacOS
 */
public class AccountBank implements Serializable{

    private String cusNo;
    private String cusName;
    private String passcode;
    private String balance;
    
    public AccountBank(){}

    public AccountBank(String cusNo, String cusName, String passcode, String balance) {
        this.cusNo = cusNo;
        this.cusName = cusName;
        this.passcode = passcode;
        this.balance = balance;
    }

    public String getCusNo() {
        return cusNo;
    }

    public void setCusNo(String cusNo) {
        this.cusNo = cusNo;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getPasscode() {
        return passcode;
    }

    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
    
    
    

}
