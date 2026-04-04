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
import com.example.exception.DataNotFoundException;

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
        Teacher teacher = teacherDAO.getById(teacherId);
        if (teacher == null) { // This will be caught by our DataNotFoundExceptionMapper!
            throw new DataNotFoundException("Teacher with ID " + teacherId + "not found.");
        }
        return teacher;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addTeacher(Teacher teacher) {
        teacherDAO.add(teacher);
    }

    @PUT
    @Path("/{teacherId}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateTeacher(@PathParam("teacherId") int teacherId) {
        Teacher t = teacherDAO.getById(teacherId);
        if (t== null) { // This will be caught by our DataNotFoundExceptionMapper!
            throw new DataNotFoundException("Teacher with ID " + teacherId+ "not found.");
        }
        teacherDAO.update(t);
    }

    @DELETE
    @Path("/{teacherId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void delete(@PathParam("teacherId") int teacherId) {
        Teacher t = teacherDAO.getById(teacherId);
        if (t== null) { // This will be caught by our DataNotFoundExceptionMapper!
            throw new DataNotFoundException("Teacher with ID " + teacherId + "not found.");
        }
    
        teacherDAO.delete(teacherId);
    }
}

