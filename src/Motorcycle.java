public class Motorcycle extends Vehicle{

    //Attributes
    Boolean isPillionRiderCapable;


    //Constructor is accessing constructor of vehicle superclass
    Motorcycle(String model, int mileage, Boolean isPillionRiderCapable){
        super(model, mileage);
        this.isPillionRiderCapable = isPillionRiderCapable;
    }

}
