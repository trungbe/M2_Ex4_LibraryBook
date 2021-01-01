public class Student {
    private String name;
    private int studentId;
    private String birthday;
    private String classStudent;

    public Student(String name, int studentId, String birthday, String classStudent) {
        this.name = name;
        this.studentId = studentId;
        this.birthday = birthday;
        this.classStudent = classStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(String classStudent) {
        this.classStudent = classStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                ", birthday='" + birthday + '\'' +
                ", classStudent='" + classStudent + '\'' +
                '}';
    }
}
