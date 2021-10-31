package task_2;

import task_2.Jacket.AdidasJacket;
import task_2.Jacket.GucciJacket;
import task_2.Pants.AdidasPants;
import task_2.Pants.GucciPants;
import task_2.Shoes.AdidasShoes;
import task_2.Shoes.GucciShoes;

public class Run {
    public static void main(String[] args) {
        Human john = new Human("John",new GucciShoes(), new GucciJacket(),new GucciPants());
        Human ivan = new Human("Ivan",new AdidasShoes(),new AdidasJacket(),new AdidasPants());
        john.getDressed();
        ivan.getDressed();
        john.getUndressed();
        ivan.getUndressed();
    }
}
