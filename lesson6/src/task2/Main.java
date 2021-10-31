package task2;

public class Main {
    public static void main(String[] args) {
        Greeter greeter1 = new Greeter() {
            @Override
            public void wish() {
                System.out.println("Hello!");
            }
        };
        greeter1.wish();
        Greeter greeter2 = new Greeter() {
            @Override
            public void wish() {
                System.out.println("Привет!");
            }
        };
        greeter2.wish();
        Greeter greeter3 = new Greeter() {
            @Override
            public void wish() {
                System.out.println("Guten Tag!");
            }
        };
        greeter3.wish();
    }
}
