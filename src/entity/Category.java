package entity;


public class Category {

    private Long categoryId;
    private String categoryName;
    private Course[] courses;

    public Category(Long categoryId, String categoryName, Course[] courses) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.courses = courses;
    }

    public Category() {
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }
}
