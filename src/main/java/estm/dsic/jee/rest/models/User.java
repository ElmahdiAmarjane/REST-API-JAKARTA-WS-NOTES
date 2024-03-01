package estm.dsic.jee.rest.models;

public class User {
    
    private int id ; 
    private String email;
    private String password;
    private boolean isAdmin;
    private boolean isVerify;

    public boolean getVerify() {
        return isVerify;
    }
    public void setVerify(boolean isVerify) {
        this.isVerify = isVerify;
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
