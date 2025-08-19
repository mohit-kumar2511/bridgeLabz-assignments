class Student {
    String name;
    int marks;

    Student(String n, int m) {
        name = n;
        marks = m;
    }
}
public class assignmentDate_19Ques4 {
    public static void main(String[] args) {
        Student s1 = new Student("Mohit", 90);
        Student s2 = new Student("Vishal", 85);

        System.out.println(s1.name + " - " + s1.marks);
        System.out.println(s2.name + " - " + s2.marks);
    }
}
