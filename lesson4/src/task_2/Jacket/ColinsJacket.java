package task_2.Jacket;

public class ColinsJacket implements IJacket {
    @Override
    public void putOn() {
        System.out.println("Denim jacket from Colin's");
    }

    @Override
    public void tookOff() {
        System.out.println("taking off my jacket");
    }
}
