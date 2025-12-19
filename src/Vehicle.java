public class Vehicle {

    //Constructor
    Vehicle(String model, int mileage){
        this.model = model;
        this.mileage = mileage;
    }

    //Attributes
    String model;
    int mileage;

    //Methods
    public void printInformation(){
        System.out.println("Model: " + this.model + " Mileage: " + this.mileage);
    }

    @Override
    public String toString(){
        return "Model: " + this.model + " Mileage: " + this.mileage;
    }

}
