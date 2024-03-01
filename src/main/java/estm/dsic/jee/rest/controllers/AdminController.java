package estm.dsic.jee.rest.controllers;

import java.util.List;

import estm.dsic.jee.rest.business.IUserServices;
import estm.dsic.jee.rest.models.UpdateRequest;
import estm.dsic.jee.rest.models.User;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/admin")
public class AdminController {

    @Inject
    IUserServices userServices;

    @Path("/validateUser")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean validateUser(User user) {
        // Call your service method with the received values
        return userServices.validateUser(true, user);
    }

    @Path("/deleteUser")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean deleteUser(User user){
        return userServices.deleteUser(user);
    }
    @Path("/updateUser")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean updateUser(UpdateRequest updateRequest){
        System.out.println(updateRequest.getEmail()+" new pass : "+updateRequest.getUser().getEmail());
        return userServices.updateUser(updateRequest.getUser(),updateRequest.getEmail());
    }

    @Path("/allUsers")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    
    public List<User> getAllUsers(UpdateRequest updateRequest){
        return userServices.getAllUsers();
    }
}
