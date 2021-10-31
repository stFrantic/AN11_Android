package task_1.hands;

public class SonyHand implements IHand{
    @Override
    public void upHand() {
        System.out.println("[a sound comes from hand]\nHello, I am new SonyHand SH1000");
    }

    @Override
    public int getPrice() {
        return 1000;
    }
}
