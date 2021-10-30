package task_1.hands;

public class SamsungHand implements IHand {
    @Override
    public void upHand() {
        System.out.println("[the hand smoothly rises to the top and begins to wave the palm]");
    }

    @Override
    public int getPrice() {
        return 1500;
    }
}
