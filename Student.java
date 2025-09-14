public class Student {
    private long studentId;
    private String name;
    private String email;

    public Student(long studentId, String name, String email) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
    }

    public long getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void displayInfo() {
        System.out.println("ID/NIM: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}
