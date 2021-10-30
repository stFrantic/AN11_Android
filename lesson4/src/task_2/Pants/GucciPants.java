package task_2.Pants;

public class GucciPants implements IPants {
    @Override
    public void putOn() {
        System.out.println("Trendy pants from Gucci");
    }

    @Override
    public void tookOff() {
        System.out.println("Taking off my pants");
    }
}
