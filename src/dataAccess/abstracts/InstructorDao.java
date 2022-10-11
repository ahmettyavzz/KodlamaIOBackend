package dataAccess.abstracts;

import entity.Instructor;

import java.util.List;

public interface InstructorDao {
    void addInstructor(Instructor instructor);
    void updateInstructor(Instructor instructor);
    void deleteInstructor(Instructor instructor);

    List<Instructor> allInstructors();
}
