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
        this.mileage = mileage;
    }

    public int getMileage() {
        return this.mileage;
    }

    public void setModel(String model){
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

}
