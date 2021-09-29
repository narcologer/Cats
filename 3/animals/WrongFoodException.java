package animals;

public class WrongFoodException extends Exception{
    public WrongFoodException(String errorMessage) {
        super(errorMessage);
    }
}
