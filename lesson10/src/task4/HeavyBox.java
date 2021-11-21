package task4;


public class HeavyBox implements Comparable<HeavyBox> {
    private int id;
    private int weigh;


    public HeavyBox(int id, int weigh) {
        this.id = id;
        this.weigh = weigh;

    }


    @Override
    public String toString() {
        return "HeavyBox{" +
                " id= " + id +
                ", weigh= " + weigh +
                '}';
    }


    @Override
    public int compareTo(HeavyBox o) {
        if (this.weigh <= o.weigh) {
            return -1;
        } else return 1;
    }
}
