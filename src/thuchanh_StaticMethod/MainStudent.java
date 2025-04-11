package thuchanh_StaticMethod;

public class MainStudent {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111, "Hưng");
        Student s2 = new Student(222,"Khánh");
        Student s3 = new Student(333,"Hiếu");

        s1.display();
        s2.display();
        s3.display();
    }
}
