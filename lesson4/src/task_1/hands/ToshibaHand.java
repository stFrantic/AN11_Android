package task_1.hands;

public class ToshibaHand implements IHand{
    @Override
    public void upHand() {
        System.out.println("[the straightened arm rises up. A cutting sound comes from the palm of your hand]\nHello");
    }

    @Override
    public int getPrice() {
        return 500;
    }
}
