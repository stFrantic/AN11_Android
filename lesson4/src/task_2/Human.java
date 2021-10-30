package task_2;

import task_2.Jacket.IJacket;
import task_2.Pants.IPants;
import task_2.Shoes.IShoes;

public class Human {
    private String name;
    private IShoes shoes;
    private IJacket jacket;
    private IPants pants;

    public Human(String name, IShoes shoes, IJacket jacket, IPants pants) {
        this.name = name;
        this.shoes = shoes;
        this.jacket = jacket;
        this.pants = pants;
    }
     public void getDressed(){
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
     }
    public void getUndressed(){
        jacket.tookOff();
        pants.tookOff();
        shoes.tookOff();
    }
}
