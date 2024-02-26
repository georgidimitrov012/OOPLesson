package students;

import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {
    private List<Student> students;

    public StudentManagementSystem() {
        students = new ArrayList<>();
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println("Name " + student.getName());
            System.out.println("Age " + student.getAge());
            System.out.println("Course " + student.getCourse());

            if (student instanceof HighSchoolStudents) {
                System.out.println("Grade " + ((HighSchoolStudents) student).getGrade());
            } else if (student instanceof UniversityStudent) {
                System.out.println("Majority " + ((UniversityStudent) student).getMajority());
            }
        }
    }
    // Da dobawim metod za tyrsene na student po ime
}
