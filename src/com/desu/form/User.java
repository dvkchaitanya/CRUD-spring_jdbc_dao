/**
 * Created by IntelliJ IDEA.
 * User: venkatakrishnachaita
 * Date: 6/17/13
 * Time: 2:06 AM
 * To change this template use File | Settings | File Templates.
 */
package com.desu.form;

public class User {
    private int id;
    private String userName;
    private String city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
