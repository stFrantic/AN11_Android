package task_4;

public class CivilAirTransport extends AirTransport {
    private int amountOfPassengers;
    private boolean hasBusiness;

    public CivilAirTransport(int power, int maxSpeed, int weight, String model, int wingspan, int minRunway, int amountOfPassengers, boolean hasBusiness) {
        super(power, maxSpeed, weight, model, wingspan, minRunway);
        this.amountOfPassengers = amountOfPassengers;
        this.hasBusiness = hasBusiness;
    }
    public void checkCapacity(double amountOfPassengers){
        if(this.amountOfPassengers >= amountOfPassengers){
            System.out.println("This plane is enough for you");
        }else System.out.println("You need bigger plane");
    }
    public void printInfo() {
        System.out.println("Model: " + super.getModel() +
                "\nWeight: " + super.getWeight() + " t" +
                "\nMax speed:" + super.getMaxSpeed() + " km/h" +
                "\nPower: " + (super.getPower() * 0.74) + " kW" +
                "\nWingspan: " + super.getWingspan() + " m" +
                "\nMinimal runway: " + super.getMinRunway()+" km" +
                "\nAmount of passengers: " + this.amountOfPassengers + 
                "\nHas business: " + this.hasBusiness);
    }
}
