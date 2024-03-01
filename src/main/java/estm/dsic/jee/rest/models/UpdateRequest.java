package estm.dsic.jee.rest.models;

public class UpdateRequest {
       private String email;
       private User user;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
       
}
