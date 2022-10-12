package business.abstracts;

import entity.Category;
import entity.Course;

import java.util.List;

public interface CourseService {
    void addCourse(Course course);
    void updateCourse(Course course);

    void deleteCourse(Course course);

    void allCourses();
}

