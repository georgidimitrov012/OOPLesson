package students;

public class HighSchoolStudents extends Student {
    private int grade;

    public HighSchoolStudents(String name, int age, String course, int grade) {
        super(name, age, course);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
