public class Main {
    public static void main(String[] args) {
        // Tes Student
        Student s1 = new Student(2311510354L, "Hadi Bagus Indrawan", "2311510354@student.budiluhur.ac.id");
        s1.displayInfo();
        System.out.println();

        // Tes Graduate Student
        GraduateStudent s2 = new GraduateStudent(2311510354L, "Hadi Bagus Indrawan", "2311510354@student.budiluhur.ac.id", "Quantum Computing");
        s2.displayInfo();
        System.out.println();

        // Tes Shape
        Shape circle = new Circle(7);
        Shape square = new Square(5);
        Shape triangle = new Triangle(6, 4);

        System.out.println("Luas Circle: " + circle.calculateArea());
        System.out.println("Luas Square: " + square.calculateArea());
        System.out.println("Luas Triangle: " + triangle.calculateArea());
    }
}