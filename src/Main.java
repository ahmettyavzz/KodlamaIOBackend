import business.abstracts.CourseService;
import business.concretes.CourseManager;
import dataAccess.abstracts.CourseDao;
import dataAccess.concretes.JDBC.JDBCCourseDao;
import dataAccess.concretes.hibernate.HibernateCourseDao;
import entity.Category;
import entity.Course;
import entity.Instructor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Instructor instructor1= new Instructor(1l,"engin");


        Category category1=new Category(1l,"Java",null);
        Category category2=new Category(1l,"C#",null);


        Course course1 = new Course(1l,"Spring Boot",instructor1,category1);
        Course course2 = new Course(1l,"Spring Framework",instructor1,category1);
        List<Course> javaCourses= new ArrayList<>();
        javaCourses.add(course1);
        javaCourses.add(course2);


        Course course3 = new Course(1l,".Net",instructor1,category2);
        Course course4 = new Course(1l,"Angular",instructor1,category2);
        List<Course> csharpCourses= new ArrayList<>();
        javaCourses.add(course3);
        javaCourses.add(course4);


        CourseDao courseDao= new JDBCCourseDao();

        CourseService courseManager = new CourseManager(courseDao);

        courseManager.deleteCourse(course1);
   


}
}