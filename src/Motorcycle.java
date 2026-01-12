public class Motorcycle extends Vehicle implements Refuelable{

    //Attributes
    Boolean isPillionRiderCapable;


    //Constructor is accessing constructor of vehicle superclass
    Motorcycle(String model, int mileage, int tank, Boolean isPillionRiderCapable){
        super(model, mileage, tank);
        this.isPillionRiderCapable = isPillionRiderCapable;
    }


    @Override
    public void printInformation() {
        System.out.println(this.model + " " + "(" + this.mileage + ") - " + "soziustauglich: " + this.isPillionRiderCapable);
    }

    @Override
    public void start(){
        System.out.println("prött prött prött");
    }

    @Override
    public void refuel(int liters){
        tank += liters;
        System.out.println("Tank: " + tank);
    }

}
