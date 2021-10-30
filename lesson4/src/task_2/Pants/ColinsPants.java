package task_2.Pants;

public class ColinsPants implements IPants {
    @Override
    public void putOn() {
        System.out.println("Cool jeans from Colin's");
    }

    @Override
    public void tookOff() {
        System.out.println("Taking off my pants");
    }
}
