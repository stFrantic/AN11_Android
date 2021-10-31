package task_4;

public class MilitaryAirTransport extends AirTransport {
    private boolean hasEjectionSystem;
    private int rocketsAmount;

    public MilitaryAirTransport(int power, int maxSpeed, int weight, String model, int wingspan, int minRunway, boolean hasEjectionSystem, int rocketsAmount) {
        super(power, maxSpeed, weight, model, wingspan, minRunway);
        this.hasEjectionSystem = hasEjectionSystem;
        this.rocketsAmount = rocketsAmount;
    }

    public void printInfo() {
        System.out.println("Model: " + super.getModel() +
                "\nWeight: " + super.getWeight() + " t" +
                "\nMax speed:" + super.getMaxSpeed() + " km/h" +
                "\nPower: " + (super.getPower() * 0.74) + " kW" +
                "\nWingspan: " + super.getWingspan() + " m" +
                "\nMinimal runway: " + super.getMinRunway() +" km"+
                "\nAmount of rockets: " + this.rocketsAmount +
                "\nHas ejection system: " + this.hasEjectionSystem);
    }

    public void shot() {
        if (rocketsAmount > 0) {
            rocketsAmount--;
            System.out.println("Rocket launched");
        }else System.out.println("No rockets left");
    }
    public void eject(){
        if(hasEjectionSystem){
            System.out.println("Successfully ejected");
        }else System.out.println("There no ejection system");
    }
}
