package task_1.legs;

public class SamsungLeg implements ILeg {
    @Override
    public void step() {
        System.out.println("[makes a smooth step]");
    }

    @Override
    public int getPrice() {
        return 1000;
    }
}
