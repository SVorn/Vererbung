public class Car extends Vehicle{

    //Constructor is accessing constructor of vehicle superclass
    Car(String model, int mileage){

        super(model, mileage);
    }

    @Override
    public void start(){
        System.out.println("wroom");
    }
}
