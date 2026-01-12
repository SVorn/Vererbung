public class Car extends Vehicle implements Refuelable{

    //Constructor is accessing constructor of vehicle superclass
    Car(String model, int mileage, int tank){

        super(model, mileage, tank);
    }

    @Override
    public void start(){
        System.out.println("wroom");
    }

    @Override
    public void refuel(int liters){
        tank += liters;
        System.out.println("Tank: " + tank);
    }
}
