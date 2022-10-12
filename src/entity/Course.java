package entity;

public class Course {

    private Long courseId;
    private String courseName;

    private double price;
    private Instructor instructor;


    private Category category;

    public Course(Long courseId, String courseName, Instructor instructor, Category category,double price) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructor = instructor;
        this.category = category;
        this.price=price;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price>0){
            this.price = price;
        }
        else {
            System.out.println("Kurs fiyatı 0'dan küçük olamaz.");
        }

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
