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
import com.example.exception.DataNotFoundException;
import com.example.model.Student;
import com.example.model.Teacher;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/students")
public class StudentResource {

    //Instantate the generic DAO with the Teacher type and list
    private GenericDAO<Student> studentDAO
            = new GenericDAO<>(MockDatabase.STUDENTS);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> getAllStudents() {
        return studentDAO.getAll();
    }

    @GET
    @Path("/{studentId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Student getTeacherById(@PathParam("studentId") int studentId) {
        return studentDAO.getById(studentId);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addTeacher(Student student) {
        studentDAO.add(student);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateTeacher( Student student) {
        studentDAO.update(student);
    }
    
    @PUT
    @Path("/{studentId}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateStudent(@PathParam("studentId") int studentId) {
        Student t = studentDAO.getById(studentId);
        if (t== null) { // This will be caught by our DataNotFoundExceptionMapper!
            throw new DataNotFoundException("Teacher with ID " + studentId+ "not found.");}
        studentDAO.update(t);
    }
    
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    public void delete(int i){
        studentDAO.delete(i);
    }
}
