package business.abstracts;

import entity.Course;
import entity.Instructor;

import java.util.List;

public interface InstructorService {
    void addInstructor(Instructor instructor);
    void updateInstructor(Instructor instructor);

    void deleteInstructor(Instructor instructor);

    void allInstructors();
}
