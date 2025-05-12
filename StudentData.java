import java.util.*;

public class StudentData {

    static class Student {
        String name, program, semester;
        HashMap<String, Integer> courses = new HashMap<>();
    
        Student(String name, String program, String semester) {
            this.name = name;
            this.program = program;
            this.semester = semester;
        }
    
        void addCourse(String course, int marks) {
            courses.put(course, marks);
        }
    
        void displayRegisteredCourses() {
            System.out.println("Student: " + name);
            System.out.println("Program: " + program);
            System.out.println("Semester: " + semester);
            System.out.println("Courses: " + courses.keySet());
        }
    
        void displayLowScores() {
            for (Map.Entry<String, Integer> entry : courses.entrySet()) {
                if (entry.getValue() < 40) {
                    System.out.println("Course with low score: " + entry.getKey() + " - " + entry.getValue());
                }
            }
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Rohit", "BCA", "4th");
        s1.addCourse("Math", 35);
        s1.addCourse("Java", 80);
        s1.displayRegisteredCourses();
        s1.displayLowScores();
    }
}
