package InClassDemos;

import java.util.ArrayList;
import java.util.List;

public class Student{

    // Data members
    private int id;
    private String name;
    private List<Course> courses;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public List<Course> getCourse() {
        return courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    // Methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
