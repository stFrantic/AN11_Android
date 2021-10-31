package task_4;

public class Run {
    public static void main(String[] args) {
        CivilAirTransport plane = new CivilAirTransport(1000,1000, 10,"Flying Emirates", 100, 10,250,true);
        plane.checkCapacity(100);
        plane.printInfo();
    }
}
