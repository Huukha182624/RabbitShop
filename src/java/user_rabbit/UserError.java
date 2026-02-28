/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_rabbit;

/**
 *
 * @author straw
 */
public class UserError {
    private String userId;
    private int password;
    private String fullName;
    private int role;
    private String confirm;

    public UserError() {
    }

    public UserError(String userId, int password, String fullName, int role, String confirm) {
        this.userId = userId;
        this.password = password;
        this.fullName = fullName;
        this.role = role;
        this.confirm = confirm;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    

   
}
