package task_2.Shoes;

public class AdidasShoes implements IShoes {
    @Override
    public void putOn() {
        System.out.println("Sport shoes from Adidas");
    }

    @Override
    public void tookOff() {
        System.out.println("Taking off my shoes");
    }
}
