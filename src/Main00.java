public class Main00 {

    static void main(String[] args) {
        Car car = new Car();
        car.model = "VW Golf";
        car.mileage = 42617;
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.model = "Simson Schwalbe";
        motorcycle.mileage = 9876;
        motorcycle.isPillionRiderCapable = true;

        car.printinformation();
        motorcycle.printinformation();
    }
}
