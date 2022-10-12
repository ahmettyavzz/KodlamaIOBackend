package business.abstracts;

import entity.Category;

import java.util.List;

public interface CategoryService {
    void addCategory(Category category);
    void updateCategory(Category category);

    void deleteCategory(Category category);

    List<Category> allCategories();
}
