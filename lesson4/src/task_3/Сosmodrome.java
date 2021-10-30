package task_3;

import task_3.SpaceShutle.IStart;

public class Сosmodrome {
    private IStart rocket;

    public Сosmodrome(IStart rocket) {
        this.rocket = rocket;
    }

    void start() {
        rocket.check();
        if (rocket.isOk()) {
            rocket.engineStart();
            for (int i = 0; i < 10; i++) {
                System.out.print((i + 1) + "...");
            }
            rocket.start();
        } else {
            rocket.tryFix();
            if (rocket.isOk()) {
                rocket.engineStart();
                for (int i = 0; i < 10; i++) {
                    System.out.print((i + 1) + "...");
                }
                rocket.start();
            }
        }
    }
}
