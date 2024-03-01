package estm.dsic.jee.rest.models;

import jakarta.json.bind.annotation.JsonbProperty;

public class User {
    
    private int id ; 
    private String email;
    private String password;
    private Boolean isAdmin;
    @JsonbProperty("isverify")
    private boolean isVerify;

    public boolean getVerify() {
        return isVerify;
    }
    public void setVerify(boolean isverify) {
        this.isVerify = isverify;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean isAdmin() {
        return isAdmin;
    }
    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    } 
    
}
