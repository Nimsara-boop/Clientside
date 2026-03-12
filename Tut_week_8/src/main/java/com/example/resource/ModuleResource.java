/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.resource;

import com.example.dao.GenericDAO;
import com.example.dao.MockDatabase;
import com.example.model.Module;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Nimsara
 */
@Path("/modules")
public class ModuleResource {

    //Instantate the generic DAO with the Teacher type and list
    private GenericDAO<Module> moduleDAO
            = new GenericDAO<>(MockDatabase.MODULES);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Module> getAllModules() {
        return moduleDAO.getAll();
    }

    @GET
    @Path("/{moduleId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Module getModuleById(@PathParam("moduleId") int module) {
        return moduleDAO.getById(module);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addTeacher(Module module) {
        moduleDAO.add(module);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateModule( Module module) {
        moduleDAO.update(module);
    }
    
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    public void delete(int i){
        moduleDAO.delete(i);
    }
}

