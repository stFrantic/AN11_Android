package task2;

public class WrongLoginExeption extends Exception {
    public WrongLoginExeption(String message) {
        super(message);
    }

    public WrongLoginExeption() {
    }
}
