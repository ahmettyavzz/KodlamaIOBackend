package entity;


public class Instructor {

    private Long instructorId;
    private String instructorName;

    public Instructor(Long instructorId, String instructorName) {
        this.instructorId = instructorId;
        this.instructorName = instructorName;
    }
    public Instructor() {
    }

    public Long getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(Long instructorId) {
        this.instructorId = instructorId;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }
}
