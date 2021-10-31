package task2;

public class Main {
    public static void main(String[] args) {
        Greeter greeter1 = new Greeter() {
            @Override
            public void wish() {
                System.out.println("Hello!");
            }
        };
        Greeter greeter2 = new Greeter() {
            @Override
            public void wish() {
                System.out.println("Привет!");
            }
        };
        Greeter greeter3 = new Greeter() {
            @Override
            public void wish() {
                System.out.println("Guten Tag!");
            }
        };
    }
}
