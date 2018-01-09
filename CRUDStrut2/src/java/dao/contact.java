/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author MacOS
 */
public class contact {
    private int id ;
    private String username;
    private String gender;
    private String country;
    private String about;
    private boolean likes;

    public contact() {
    }

    public contact(int id, String username, String gender, String country, String about, boolean likes) {
        this.id = id;
        this.username = username;
        this.gender = gender;
        this.country = country;
        this.about = about;
        this.likes = likes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public boolean isLikes() {
        return likes;
    }

    public void setLikes(boolean likes) {
        this.likes = likes;
    }
    
    
    
    
}
