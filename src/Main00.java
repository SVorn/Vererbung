public class Main00 {

    //main
    static void main(String[] args) {
        Car car = new Car();
        car.model = "VW Golf";
        car.mileage = 42617;
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.model = "Simson Schwalbe";
        motorcycle.mileage = 9876;
        motorcycle.isPillionRiderCapable = true;

        car.printInformation();
        motorcycle.printInformation();
    }
}
