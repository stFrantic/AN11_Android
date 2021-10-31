package task_4;

public class LightTransport extends LandTransport {
    private String bodyType;
    private int passengerAmount;

    public LightTransport(int power, int maxSpeed, int weight, String model, int amountOfWheels, int fuelConsumption, String bodyType, int passengerAmount) {
        super(power, maxSpeed, weight, model, amountOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.passengerAmount = passengerAmount;
    }

    public void printInfo() {
        System.out.println("Model: " + super.getModel() +
                "\nWeight: " + super.getWeight() +" t"+
                "\nMax speed:" + super.getMaxSpeed()+" km/h" +
                "\nPower: " + (super.getPower() * 0.74) +" kW"+
                "\nFuel consumption on 100km: " + super.getFuelConsumption() +" l"+
                "\nBody Type: " + bodyType +
                "\n Amount of wheels" + super.getAmountOfWheels() +
                "\nPassenger Amount: " + passengerAmount);
    }

    public void getFuelConsumption(double time) {
        System.out.println("During " + time + " hours, car " + super.getModel() + " moving at maximum speed " +
                super.getMaxSpeed() + " km/h travels " + (super.getMaxSpeed() * time) + " km and will consume" + fuelConsumption(time) + " liters of fuel");

    }

    private double fuelConsumption(double time) {
        return time * super.getMaxSpeed() * super.getFuelConsumption() / 100;
    }
}
