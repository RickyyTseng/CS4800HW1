package Aggregation;

public class Course {
    private String courseName;
    private Instructor instructor;
    private Textbook textbook;

    public Course(String courseName, Instructor instructor, Textbook textbook) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    public void print() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor: " + instructor.getFirstName() + " " + instructor.getLastName());
        System.out.println("Office Number: " + instructor.getOfficeNumber());
        System.out.println("Textbook: " + textbook.getTitle() + " by " + textbook.getAuthor());
    }
}
