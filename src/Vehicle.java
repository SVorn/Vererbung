import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.random.RandomGenerator;

public abstract class Vehicle implements Startable{

    //Attributes
    private int tank;
    private String model;
    private int mileage;

    //Constructor
    Vehicle(String model, int mileage, int tank){
        this.model = model;
        this.mileage = mileage;
        this.tank = tank;
    }

    public void setTank(int tank) {
        this.tank += tank;
    }

    public int getTank() {
        return this.tank;
    }

    public void setMileage(int mileage) {
        if(mileage < 0){
            throw new IllegalArgumentException("ungültige mileage Angabe: " + mileage);
        }
        this.mileage = mileage;
    }

    public int getMileage() {
        return this.mileage;
    }

    public void setModel(String model) {
        if(model == null || model.length() == 0){
            throw new IllegalArgumentException("ungültiges model: " + model);
        }
        this.model = model;
    }

    public String getModel(){
        return this.model;
    }

    //Methods
    @Override
    public void start() {

    }

    public void printInformation(){
        System.out.println("Model: " + this.model + " Mileage: " + this.mileage);
    }

    @Override
    public String toString(){
        return "Model: " + this.model + " Mileage: " + this.mileage;
    }

    static void printVehicles(ArrayList<Vehicle> vehicles){
        System.out.println("Fahrzeuge: " + vehicles.size());
        Iterator<Vehicle> iterator = vehicles.iterator();

        while(iterator.hasNext()){
            Vehicle vehicle = iterator.next();
            System.out.println(vehicle);
        }
    }

    static ArrayList<Vehicle> gatherVehicles(int numberOfCars, int numberOfMotorcycles){
        ArrayList<Vehicle> listOfVehicles = new ArrayList<>(numberOfCars+numberOfMotorcycles);

        for (int i = 1; i <= numberOfCars; i++){
            String model = "Auto #" + i;
            int mileage = RandomGenerator.getDefault().nextInt(0, 20000);
            int tank = 0;
            Car car = new Car(model, mileage, tank);
            listOfVehicles.add(car);

        }

        for (int i = 1; i <= numberOfMotorcycles; i++){
            String model = "Motorrad #" + i;
            int mileage = 0;
            Boolean soziustauglich = false;
            int tank = 0;
            Motorcycle motorcycle = new Motorcycle(model, mileage, tank, soziustauglich);
            listOfVehicles.add(motorcycle);

        }

        return listOfVehicles;
    }

}
