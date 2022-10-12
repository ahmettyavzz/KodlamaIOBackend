package business.concretes;

import business.abstracts.InstructorService;
import dataAccess.abstracts.InstructorDao;
import entity.Course;
import entity.Instructor;

import java.util.List;

public class InstructorManager implements InstructorService {

    private InstructorDao instructorDao;
    private List<Instructor> instructors;

    public InstructorManager(InstructorDao instructorDao) {
        this.instructorDao = instructorDao;
    }

    @Override
    public void addInstructor(Instructor instructor) {
        instructorDao.addInstructor(instructor);
    }

    @Override
    public void updateInstructor(Instructor instructor) {
        instructorDao.updateInstructor(instructor);
    }

    @Override
    public void deleteInstructor(Instructor instructor) {
        instructorDao.deleteInstructor(instructor);
    }

    @Override
    public void allInstructors() {
        for (int i=0;i<instructorDao.allInstructors().size();i++){
            System.out.println(instructorDao.allInstructors().get(i).getInstructorName());
        }
    }
}
