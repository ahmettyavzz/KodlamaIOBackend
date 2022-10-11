package dataAccess.abstracts;

import entity.Category;

import java.util.List;

public interface CategoryDao {

    void addCategory(Category category);
    void updateCategory(Category category);
    void deleteCategory(Category category);

    List<Category> allCategories();

}
