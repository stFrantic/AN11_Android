package task_2.Pants;

public class AdidasPants implements IPants {
    @Override
    public void putOn() {
        System.out.println("Sweetly three stripes from Adidas");
    }

    @Override
    public void tookOff() {
        System.out.println("Taking off my pants");
    }
}
