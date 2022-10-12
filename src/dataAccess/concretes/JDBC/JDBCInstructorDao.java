package dataAccess.concretes.JDBC;

import dataAccess.abstracts.InstructorDao;
import entity.Instructor;

import java.util.ArrayList;
import java.util.List;

public class JDBCInstructorDao implements InstructorDao {

    List<Instructor> instructors = new ArrayList<>();


    public JDBCInstructorDao() {
        Instructor instructor1= new Instructor(1l,"engin");
        instructors.add(instructor1);
    }
    @Override
    public void addInstructor(Instructor instructor) {
        System.out.println(instructor.getInstructorName()+" isimli eğitmen JDBC ile eklendi.");

    }

    @Override
    public void updateInstructor(Instructor instructor) {
        System.out.println(instructor.getInstructorName()+" isimli eğitmen JDBC ile güncellendi.");

    }

    @Override
    public void deleteInstructor(Instructor instructor) {
        System.out.println(instructor.getInstructorName()+" isimli eğitmen JDBC ile silindi.");

    }

    @Override
    public List<Instructor> allInstructors() {
        return instructors;
    }
}
