import students.HighSchoolStudents;
import students.Student;
import students.StudentManagementSystem;
import students.UniversityStudent;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        /*cat.name = "";
        cat.age = -1000;
        cat.weight = 0;*/

        cat.setName("tom");
        cat.setAge(2);
        cat.setWeight(12);

        Cat cat2 = new Cat("alex", 3, 13);

        System.out.println(cat.getName());

        System.out.println("====================================");


        StudentManagementSystem system = new StudentManagementSystem();
        Student ivan = new HighSchoolStudents("Ivan", 15, "Math", 9);
        Student Mitko = new UniversityStudent("Mitko", 26, "Computer Science", "QA Automation");
        system.addStudents(ivan);
        system.addStudents(Mitko);

        system.displayAllStudents();



    }
}
