package task_1.legs;

public class SonyLeg implements ILeg {
    @Override
    public void step() {
        System.out.println("[makes a easy step]");
    }

    @Override
    public int getPrice() {
        return 800;
    }
}
