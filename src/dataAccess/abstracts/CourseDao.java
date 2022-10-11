package dataAccess.abstracts;

import entity.Course;

import java.util.List;

public interface CourseDao {

    void addCourse(Course course);
    void updateCourse(Course course);
    void deleteCourse(Course course);

    List<Course> allCourses();

}
