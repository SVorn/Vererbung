public class GarageException extends Exception {

    public GarageException(){
        //super can be omitted
    }

    public GarageException(String message) {
        super(message);
    }

    public GarageException(String message, Throwable cause){
        super(message, cause);
    }

    public GarageException(Throwable cause){
        super(cause);
    }
}
