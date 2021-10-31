package task_4;

public abstract class LandTransport extends Transport{
    private int amountOfWheels;
    private int fuelConsumption;

    public LandTransport(int power, int maxSpeed, int weight, String model, int amountOfWheels, int fuelConsumption) {
        super(power, maxSpeed, weight, model);
        this.amountOfWheels = amountOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public int getAmountOfWheels() {
        return amountOfWheels;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }
}
