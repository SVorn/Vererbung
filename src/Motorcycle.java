public class Motorcycle extends Vehicle{

    //Attributes
    Boolean isPillionRiderCapable;


    //Constructor is accessing constructor of vehicle superclass
    Motorcycle(String model, int mileage, Boolean isPillionRiderCapable){
        super(model, mileage);
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

}
