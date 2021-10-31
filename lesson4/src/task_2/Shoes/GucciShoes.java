package task_2.Shoes;

public class GucciShoes implements IShoes {
    @Override
    public void putOn() {
        System.out.println("Expensive shoes from Adidas");
    }

    @Override
    public void tookOff() {
        System.out.println("Taking off my shoes");
    }
}
