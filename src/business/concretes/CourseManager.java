package business.concretes;

import business.abstracts.CourseService;
import dataAccess.abstracts.CourseDao;
import entity.Course;

import java.util.List;

public class CourseManager implements CourseService {
    private CourseDao courseDao;


    public CourseManager(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    @Override
    public void addCourse(Course course) {
        if (coursePriceControl(course)){
            if (courseNameControl(course)){
                courseDao.addCourse(course);
            }
            else {
                System.out.println("Aynı isme ait iki kurs olamaz.");
            }
        }else {
            System.out.println("Kurs fiyatı 0'dan küçük olamaz.");
        }

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
    public void allCourses() {

        for (int i=0;i<courseDao.allCourses().size();i++){
            System.out.println(courseDao.allCourses().get(i).getCourseName());
        }

    }


    private boolean coursePriceControl(Course course){
        if(course.getPrice()<0) {
            return false;
        }else {
            return true;
        }
    }

    private boolean courseNameControl(Course course){
        for (Course coursee:courseDao.allCourses()) {
                if (course.getCourseName()==coursee.getCourseName()){
                    return false;
                }
        }
        return true;
    }
}
