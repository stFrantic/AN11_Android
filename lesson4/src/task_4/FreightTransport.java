package task_4;

public class FreightTransport extends LandTransport {
    private double liftingCapacity;

    public FreightTransport(int power, int maxSpeed, int weight, String model, int amountOfWheels, int fuelConsumption, double liftingCapacity) {
        super(power, maxSpeed, weight, model, amountOfWheels, fuelConsumption);
        this.liftingCapacity = liftingCapacity;
    }

    public void printInfo() {
        System.out.println("Model: " + super.getModel() +
                "\nWeight: " + super.getWeight() + " t" +
                "\nMax speed: " + super.getMaxSpeed() + " km/h" +
                "\nPower: " + (super.getPower() * 0.74) + " kW" +
                "\nFuel consumption on 100km: " + super.getFuelConsumption() + " l" +
                "\n Amount of wheels: " + super.getAmountOfWheels() +
                "\nLifting capacity Amount: " + liftingCapacity);
    }
    public void checkCapacity(double liftingCapacity){
        if(this.liftingCapacity >= liftingCapacity){
            System.out.println("This truck is enough for you");
        }else System.out.println("You need bigger truck");
    }
}
