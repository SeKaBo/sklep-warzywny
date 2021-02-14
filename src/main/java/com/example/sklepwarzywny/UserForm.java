package com.example.sklepwarzywny;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserForm {

    private String username;

    private String password;

    private String passwordConfirm;

    public UserForm() {
        this.username = "";
        this.password = "";
        this.passwordConfirm = "";
    }

    public UserForm(String username, String password, String passwordConfirm) {
        this.username = username;
        this.password = password;
        this.passwordConfirm = passwordConfirm;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }
}
