package task_2.Jacket;

public class AdidasJacket implements IJacket {
    @Override
    public void putOn() {
        System.out.println("Comfortable jacket from Adidas");
    }

    @Override
    public void tookOff() {
        System.out.println("taking off my jacket");
    }
}
