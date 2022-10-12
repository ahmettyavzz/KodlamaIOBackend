import business.abstracts.CategoryService;
import business.abstracts.CourseService;
import business.concretes.CategoryManager;
import business.concretes.CourseManager;
import dataAccess.abstracts.CategoryDao;
import dataAccess.abstracts.CourseDao;
import dataAccess.concretes.JDBC.JDBCCourseDao;
import dataAccess.concretes.hibernate.HibernateCategoryDao;
import dataAccess.concretes.hibernate.HibernateCourseDao;
import entity.Category;
import entity.Course;
import entity.Instructor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CourseDao courseDao= new JDBCCourseDao();
        CourseService courseManager = new CourseManager(courseDao);

        CategoryDao categoryDao=new HibernateCategoryDao();
        CategoryService categoryService= new CategoryManager(categoryDao);
        categoryService.allCategories();





}
}