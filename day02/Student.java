public class Student extends Person {
    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age); // Gọi constructor lớp cha
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void showInfo() {
        introduce(); // dùng hàm từ lớp cha
        System.out.println("Student ID: " + studentId);
    }
}
