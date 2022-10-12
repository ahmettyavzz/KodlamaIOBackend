package business.concretes;

import business.abstracts.CategoryService;
import dataAccess.abstracts.CategoryDao;
import entity.Category;

import java.util.List;

public class CategoryManager implements CategoryService {

    private CategoryDao categoryDao;


    public CategoryManager(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    @Override
    public void addCategory(Category category) {
        if (categoryNameControl(category)){
            categoryDao.addCategory(category);
        }else {
            System.out.println("Ayni isimde kategori olamaz.");
        }
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
    public void allCategories() {
        for (int i=0;i<categoryDao.allCategories().size();i++){
            System.out.println(categoryDao.allCategories().get(i).getCategoryName());
        }
    }

    private boolean categoryNameControl(Category category){
        for (Category categoryy: categoryDao.allCategories()) {
            if (categoryy.getCategoryName()==category.getCategoryName()){
                return false;
            }
        }
        return true;
    }
}
