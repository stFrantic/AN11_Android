package task1;

public class Car {
    private String model;
    private int maxSpeed;
    private int price;
    private boolean isStarted = false;

    public Car(String model, int maxSpeed, int price) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public void start() throws RandomException {
        if (!isStarted) {
            int temp = (int) (Math.random() * 20);
            if (temp % 2 == 0) throw new RandomException("Engine start exception", temp % 2);
            System.out.println("Engine started");
            isStarted = true;
        } else System.out.println("Engine already started");
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
