package dataAccess.concretes.hibernate;

import dataAccess.abstracts.InstructorDao;
import entity.Instructor;

import java.util.ArrayList;
import java.util.List;

public class HibernateInstructorDao implements InstructorDao {

     	List<Instructor> instructors = new ArrayList<>();

    @Override
    public void addInstructor(Instructor instructor) {
        System.out.println(instructor.getInstructorName()+" isimli eğitmen hibernate ile eklendi.");

    }

    @Override
    public void updateInstructor(Instructor instructor) {
        System.out.println(instructor.getInstructorName()+" isimli eğitmen hibernate ile güncellendi.");

    }

    @Override
    public void deleteInstructor(Instructor instructor) {
        System.out.println(instructor.getInstructorName()+" isimli eğitmen hibernate ile silindi.");

    }

    @Override
    public List<Instructor> allInstructors() {
        return instructors;
    }
}
