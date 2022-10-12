package business.concretes;

import business.abstracts.CategoryService;
import dataAccess.abstracts.CategoryDao;
import entity.Category;

import java.util.List;

public class CategoryManager implements CategoryService {

    private CategoryDao categoryDao;
    private List<Category> categories;


    public CategoryManager(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    @Override
    public void addCategory(Category category) {
        categoryDao.addCategory(category);
    }

    @Override
    public void updateCategory(Category category) {
        categoryDao.updateCategory(category);
    }

    @Override
    public void deleteCategory(Category category) {
        categoryDao.deleteCategory(category);
    }

    @Override
    public List<Category> allCategories() {
        return categories;
    }
}
