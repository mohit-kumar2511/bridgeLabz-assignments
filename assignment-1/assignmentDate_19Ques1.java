class Car {
    String model;
    int year;
}

public class assignmentDate_19Ques1 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.model = "Toyota";
        c1.year = 2020;

        Car c2 = new Car();
        c2.model = "Honda";
        c2.year = 2022;

        System.out.println(c1.model + " - " + c1.year);
        System.out.println(c2.model + " - " + c2.year);
    }
}
