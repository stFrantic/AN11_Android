package task_1.legs;

public class ToshibaLeg implements ILeg {
    @Override
    public void step() {
        System.out.println("[makes heavy loud step]");
    }

    @Override
    public int getPrice() {
        return 500;
    }
}
