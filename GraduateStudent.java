public class GraduateStudent extends Student {
    private String thesisTopic;

    public GraduateStudent(long studentId, String name, String email, String thesisTopic) {
        super(studentId, name, email);
        this.thesisTopic = thesisTopic;
    }

    public String getThesisTopic() {
        return thesisTopic;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Thesis Topic: " + thesisTopic);
    }
}
