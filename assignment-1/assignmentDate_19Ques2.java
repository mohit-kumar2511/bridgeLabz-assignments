class Car {
    String model;
    int year;
    static int numberOfCars = 0;

    Car(String m, int y) {
        model = m;
        year = y;
        numberOfCars++;
    }
}
public class assignmentDate_19Ques2 {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", 2020);
        Car c2 = new Car("Honda", 2022);

        System.out.println("Cars created: " + Car.numberOfCars);
    }
}
