package dataAccess.concretes.JDBC;

import dataAccess.abstracts.CategoryDao;
import entity.Category;

import java.util.ArrayList;
import java.util.List;

public class JDBCCategoryDao implements CategoryDao {

    List<Category> categories = new ArrayList<>();


    @Override
    public void addCategory(Category category) {
        System.out.println(category.getCategoryName()+" isimli karegori JDBC ile eklendi.");
    }

    @Override
    public void updateCategory(Category category) {   //yeni ismi vs yapılabilir
        System.out.println(category.getCategoryName()+" isimli karegori JDBC ile güncellendi.");

    }

    @Override
    public void deleteCategory(Category category) {
        System.out.println(category.getCategoryName()+" isimli karegori JDBC ile silindi.");

    }

    @Override
    public List<Category> allCategories() {
        return categories;

    }
}
