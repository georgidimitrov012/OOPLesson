package students;

public class UniversityStudent extends Student {
    private String majority;

    public UniversityStudent(String name, int age, String course, String majority) {
        super(name, age, course);
        this.majority = majority;
    }

    public String getMajority() {
        return majority;
    }

    public void setMajority(String majority) {
        this.majority = majority;
    }
}
