/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.resource;

/**
 *
 * @author Nimsara
 */
import com.example.dao.GenericDAO;
import com.example.dao.MockDatabase;
import com.example.model.Teacher;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/teachers")
public class TeachersResource {

    //Instantate the generic DAO with the Teacher type and list
    private GenericDAO<Teacher> teacherDAO
            = new GenericDAO<>(MockDatabase.TEACHERS);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Teacher> getAllTeachers() {
        return teacherDAO.getAll();
    }

    @GET
    @Path("/{teacherId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Teacher getTeacherById(@PathParam("teacherId") int teacherId) {
        return teacherDAO.getById(teacherId);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addTeacher(Teacher teacher) {
        teacherDAO.add(teacher);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateTeacher(Teacher teacher) {
        teacherDAO.update(teacher);
    }
    
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    public void delete(int i){
        teacherDAO.delete(i);
    }
}
