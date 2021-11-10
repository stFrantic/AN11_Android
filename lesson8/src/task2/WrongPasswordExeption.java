package task2;

public class WrongPasswordExeption extends Exception {
    public WrongPasswordExeption(String message) {
        super(message);
    }

    public WrongPasswordExeption() {
    }
}
