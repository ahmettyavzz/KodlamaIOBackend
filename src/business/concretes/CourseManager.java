package business.concretes;

import business.abstracts.CourseService;
import dataAccess.abstracts.CourseDao;
import entity.Course;

import java.util.List;

public class CourseManager implements CourseService {
    private CourseDao courseDao;
    private List<Course> courses;
    public CourseManager(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    @Override
    public void addCourse(Course course) {
        courseDao.addCourse(course);
    }

    @Override
    public void updateCourse(Course course) {
        courseDao.updateCourse(course);
    }

    @Override
    public void deleteCourse(Course course) {
        courseDao.deleteCourse(course);
    }

    @Override
    public List<Course> allCourses() {
        return courses;
    }
}
