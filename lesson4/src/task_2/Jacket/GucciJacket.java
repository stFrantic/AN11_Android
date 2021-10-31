package task_2.Jacket;

public class GucciJacket implements IJacket{
    @Override
    public void putOn() {
        System.out.println("Luxury jacket from Gucci");
    }

    @Override
    public void tookOff() {
        System.out.println("Taking off my jacket");
    }
}
