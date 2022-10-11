package entity;

public class Course {

    private Long courseId;
    private String courseName;
    private Instructor instructor;
    private Category category;

    public Course(Long courseId, String courseName, Instructor instructor, Category category) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructor = instructor;
        this.category = category;
    }
    public Course() {
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
