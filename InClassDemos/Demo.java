package InClassDemos;

import java.util.List;

public class Demo {

    public static void main(String [] args){

        Student std1 = new Student(111,"Dean");
        Student std2 = new Student(112,"Vo");

        Course crs1 = new Course(105, "PS");
        Course crs2 = new Course(201, "PP");
        Course crs3 = new Course(203, "OO");
        Course crs4 = new Course( 221 , "DS");


        std1.addCourse(crs1);  // std1 ArrayList --> [crs1 , crs2 , crs3]
        std1.addCourse(crs2);
        std1.addCourse(crs3);

        std2.addCourse(crs3);  // std2 ArrayList --> [crs3 , crs4]
        std2.addCourse(crs4);

        printCourses(std2);

    }

    public static void printCourses (Student std){
        List<Course> courses = std.getCourse();
        for (Course c : courses){
            System.out.println(c.getcName());
        }
    }

    public static boolean hasCourse( int id){
        // This method should return if a student has the course or not.
        return false;
    }
}
