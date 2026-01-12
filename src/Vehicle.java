public abstract class Vehicle implements Startable {

    //Constructor
    Vehicle(String model, int mileage, int tank){
        this.model = model;
        this.mileage = mileage;
        this.tank = tank;
    }

    //Attributes
    String model;
    int mileage;
    int tank;

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

}
