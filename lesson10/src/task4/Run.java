package task4;


import java.util.Set;
import java.util.TreeSet;

public class Run {
    public static void main(String[] args) {
        Set<HeavyBox> tree = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            int weigh = (int) (Math.random() * 20 + 1);
            tree.add(new HeavyBox(i + 1, weigh));
        }
        for (HeavyBox box: tree){
            System.out.println(box.toString());
        }
    }
}
