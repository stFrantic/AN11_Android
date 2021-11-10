package task1;

class RandomException extends Exception {

    private int causeNumber;

    public RandomException(String message, int cause) {
        super(message);
        this.causeNumber = cause;
    }
}