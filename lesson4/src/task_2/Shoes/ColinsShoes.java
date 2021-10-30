package task_2.Shoes;

public class ColinsShoes implements IShoes {
    @Override
    public void putOn() {
        System.out.println("Cute shoes from Adidas");
    }

    @Override
    public void tookOff() {
        System.out.println("Taking off my shoes");
    }
}
