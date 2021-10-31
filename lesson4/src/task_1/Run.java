package task_1;

import task_1.hands.SamsungHand;
import task_1.hands.SonyHand;
import task_1.hands.ToshibaHand;
import task_1.heads.SamsungHead;
import task_1.heads.SonyHead;
import task_1.heads.ToshibaHead;
import task_1.legs.SamsungLeg;
import task_1.legs.SonyLeg;
import task_1.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        Robot t1000 = new Robot(new SamsungHead(2000), new SonyHand(), new ToshibaLeg());
        Robot t2000 = new Robot(new SonyHead(1500), new ToshibaHand(), new SamsungLeg());
        Robot t3000 = new Robot(new ToshibaHead(900), new SamsungHand(), new SonyLeg());
        t1000.action();
        t2000.action();
        t3000.action();
        System.out.println("T1000 price: " + t1000.getPrice());
        System.out.println("T2000 price: " + t2000.getPrice());
        System.out.println("T3000 price: " + t3000.getPrice());

        if (t1000.getPrice() > t2000.getPrice() && t1000.getPrice() > t3000.getPrice()) {
                System.out.println("Most expensive robot is T1000");
        }else if (t2000.getPrice() > t1000.getPrice() && t2000.getPrice() > t3000.getPrice()) {
            System.out.println("Most expensive robot is T2000");
        } else {
            System.out.println("Most expensive robot is T3000");
        }


    }
}
     /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
