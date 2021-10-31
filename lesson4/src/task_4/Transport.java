package task_4;

public abstract class Transport {
    private int power;
    private int maxSpeed;
    private int weight;
    private String model;

    public Transport(int power, int maxSpeed, int weight, String model) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public String getModel() {
        return model;
    }
}
