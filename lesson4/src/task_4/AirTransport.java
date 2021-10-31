package task_4;

public abstract class AirTransport extends Transport {
    private int wingspan;
    private  int minRunway;

    public AirTransport(int power, int maxSpeed, int weight, String model, int wingspan, int minRunway) {
        super(power, maxSpeed, weight, model);
        this.wingspan = wingspan;
        this.minRunway = minRunway;
    }

    public int getWingspan() {
        return wingspan;
    }

    public int getMinRunway() {
        return minRunway;
    }
}
