import java.util.ArrayList;
import java.util.Iterator;

public class Main00 {

    //main
    static void main(String[] args) throws GarageException{
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
        Garage garage = new Garage();

//        car.printInformation();
//        motorcycle.printInformation();

//        printVehicleInformation(car);
//        printVehicleInformation(motorcycle);

//        System.out.println(car);
//        System.out.println(motorcycle);
//
//        car.start();
//        motorcycle.start();
//        console.start();
//        car.refuel(10, car);
//        motorcycle.refuel(10, motorcycle);

//        car.setModel("");
//        car.setMileage(-1);
//        garage.replaceEngine(car, -1, "VW Golf");
//        ArrayList<Vehicle> vehicleList = new ArrayList<>();
//        vehicleList.add(car);
//        vehicleList.add(motorcycle);
//        Vehicle.printVehicles(vehicleList);
        ArrayList<Vehicle> vlist = Vehicle.gatherVehicles(5,3);
        Vehicle.printVehicles(vlist);
    }


    static void printVehicleInformation(Vehicle vehicle) {
        //TODO
        if (vehicle instanceof Motorcycle) {
            System.out.println("Motorrad - soziustauglich: " + ((Motorcycle) vehicle).getPillionRiderCapable());
        } else {
            System.out.println("Fahrzeug - Kilometerleistung: " + vehicle.getMileage());
        }
    }

//    static void printVehicles(ArrayList<Vehicle> vehicles){
//        System.out.println("Fahrzeuge: " + vehicles.size());
//        Iterator<Vehicle> iterator = vehicles.iterator();
//
//        while(iterator.hasNext()){
//            Vehicle vehicle = iterator.next();
//            System.out.println(vehicle);
//        }
//    }

}

