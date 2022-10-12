package dataAccess.concretes.hibernate;

import dataAccess.abstracts.CourseDao;
import entity.Category;
import entity.Course;
import entity.Instructor;

import java.util.ArrayList;
import java.util.List;

public class HibernateCourseDao implements CourseDao {



    List<Course> courses = new ArrayList<>();

    public HibernateCourseDao() {
        Instructor instructor1= new Instructor(1l,"engin");


        Category category1=new Category(1l,"Java",null);
        Category category2=new Category(1l,"C#",null);
        Course course3 = new Course(1l,".Net",instructor1,category2,12.75);
        Course course4 = new Course(1l,"Angular",instructor1,category2,-2);
        courses.add(course3);
        courses.add(course4);
    }

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
