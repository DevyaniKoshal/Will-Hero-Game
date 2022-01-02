package game;

public class InsufficientCoinsException extends Exception{
    public InsufficientCoinsException(String message){
        super(message);
    }
}

class BelowBoundaryException extends Exception{
    public BelowBoundaryException(String message){
        super(message);
    }
}

class GameLoseException extends Exception{
    public GameLoseException(String message){
        super(message);
    }
}