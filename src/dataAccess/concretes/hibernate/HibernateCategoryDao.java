package dataAccess.concretes.hibernate;

import dataAccess.abstracts.CategoryDao;
import entity.Category;

import java.util.ArrayList;
import java.util.List;

public class HibernateCategoryDao implements CategoryDao {

    List<Category> categories = new ArrayList<>();

    public HibernateCategoryDao() {
        Category category1=new Category(1l,"Java",null);
        Category category2=new Category(1l,"C#",null);
        categories.add(category1);
        categories.add(category2);
    }

    @Override
    public void addCategory(Category category) {
        System.out.println(category.getCategoryName()+" isimli karegori hibernate ile eklendi.");
    }

    @Override
    public void updateCategory(Category category) {   //yeni ismi vs yapılabilir
        System.out.println(category.getCategoryName()+" isimli karegori hibernate ile güncellendi.");

    }

    @Override
    public void deleteCategory(Category category) {
        System.out.println(category.getCategoryName()+" isimli karegori hibernate ile silindi.");

    }

    @Override
    public List<Category> allCategories() {
        return categories;

    }
}
