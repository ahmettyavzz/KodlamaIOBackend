package dataAccess.concretes.hibernate;

import dataAccess.abstracts.CourseDao;
import entity.Course;

import java.util.ArrayList;
import java.util.List;

public class HibernateCourseDao implements CourseDao {

    List<Course> courses = new ArrayList<>();

    @Override
    public void addCourse(Course course) {
        System.out.println(course.getCourseName()+" isimli kurs hibernate ile eklendi.");

    }

    @Override
    public void updateCourse(Course course) {
        System.out.println(course.getCourseName()+" isimli kurs hibernate ile güncellendi.");
    }

    @Override
    public void deleteCourse(Course course) {
        System.out.println(course.getCourseName()+" isimli kurs hibernate ile silindi.");
    }

    @Override
    public List<Course> allCourses() {
        return courses;
    }
}
