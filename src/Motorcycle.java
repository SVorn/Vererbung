public class Motorcycle extends Vehicle implements Refuelable{

    //Attributes
    private Boolean isPillionRiderCapable;


    //Constructor is accessing constructor of vehicle superclass
    Motorcycle(String model, int mileage, int tank, Boolean isPillionRiderCapable){
        super(model, mileage, tank);
        this.isPillionRiderCapable = isPillionRiderCapable;
    }

    public void setPillionRiderCapable(Boolean pillionRiderCapable) {
        isPillionRiderCapable = pillionRiderCapable;
    }

    public Boolean getPillionRiderCapable() {
        return isPillionRiderCapable;
    }

    @Override
    public String toString() {
        return "Model: " + this.getModel() + " " + "Mileage: " + this.getMileage() + " - " + "soziustauglich: " + this.isPillionRiderCapable;
    }

    @Override
    public void start(){
        System.out.println("prött prött prött");
    }

    @Override
    public void refuel(int liters, Vehicle vehicle){
        vehicle.setTank(liters);
        System.out.println("Tank: " + getTank());
    }

}
