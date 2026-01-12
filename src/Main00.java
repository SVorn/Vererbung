public class Main00 {

    //main
    static void main(String[] args) {
//        Car car = new Car();
//        car.model = "VW Golf";
//        car.mileage = 42617;
//        Motorcycle motorcycle = new Motorcycle();
//        motorcycle.model = "Simson Schwalbe";
//        motorcycle.mileage = 9876;
//        motorcycle.isPillionRiderCapable = true;

        Car car = new Car("VW Golf", 42617, 50);
        Motorcycle motorcycle = new Motorcycle("Simson Schwalbe", 9876, 10, true);
        Console console = new Console();

//        car.printInformation();
//        motorcycle.printInformation();

//        printVehicleInformation(car);
//        printVehicleInformation(motorcycle);

        System.out.println(car);
        System.out.println(motorcycle);

        car.start();
        motorcycle.start();
        console.start();
        car.refuel(10);
        motorcycle.refuel(10);

    }


    static void printVehicleInformation(Vehicle vehicle) {
        //TODO
        if (vehicle instanceof Motorcycle) {
            System.out.println("Motorrad - soziustauglich: " + ((Motorcycle) vehicle).isPillionRiderCapable);
        } else {
            System.out.println("Fahrzeug - Kilometerleistung: " + vehicle.mileage);
        }
    }

}

