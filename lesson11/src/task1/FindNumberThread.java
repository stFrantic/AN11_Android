package task1;


import java.util.List;

public class FindNumberThread extends Thread {

    private final List<Integer> array;
    private final boolean isMax;
    private int temp;

    public FindNumberThread(List<Integer> array, boolean isMax) {
        this.array = array;
        this.isMax = isMax;
    }

    private void findExtremum() {
        temp = array.get(0);
        for (Integer a : array) {
            if (isMax) {
                if (temp < a) {
                    temp = a;
                }
            } else {
                if (temp > a) {
                    temp = a;
                }
            }
        }
    }

    public void start() {
        System.out.println(Thread.currentThread().getName() + " is started");
        findExtremum();
        System.out.println(Thread.currentThread().getName() + " is finished");
    }
    public int getNumber(){
        return temp;
    }
}

