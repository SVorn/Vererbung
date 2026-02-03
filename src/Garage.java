public class Garage {

    public Garage(){

    }

    public void replaceEngine(Vehicle vehicle, int mileage, String model) throws GarageException{
        try {
            vehicle.setMileage(mileage);
            vehicle.setModel(model);
        } catch (Exception e) {
            throw new GarageException("replaceEngine failed: " , e);
        }
        System.out.println("replaceEngine erfolgreich!");
    }
}
