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

        Car car = new Car("VW Golf", 42617);
        Motorcycle motorcycle = new Motorcycle("Simson Schwalbe", 9876, true);

//        car.printInformation();
//        motorcycle.printInformation();

//        printVehicleInformation(car);
//        printVehicleInformation(motorcycle);

        System.out.println(car);
        System.out.println(motorcycle);

        car.start();
        motorcycle.start();

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

