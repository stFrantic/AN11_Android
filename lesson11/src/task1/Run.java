package task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Run {
    public static int enterInt(boolean isArrayLength) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter number");
        while (!console.hasNextInt()) {
            System.out.println("Not a number");
            System.out.println("Enter correct array legth");
            console.next();
        }
        int n = console.nextInt();
        if (isArrayLength) {
            if (n <= 0) {
                do {
                    System.out.println("Array legth can not be <= 0. Please enter correct number");
                    n = console.nextInt();
                } while (n <= 0);
            }
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println("Enter array length");
        int n = enterInt(true);

        List<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            array.add(enterInt(false));
        }

        System.out.println(array.toString());
        FindNumberThread t1 = new FindNumberThread(array, true);
        FindNumberThread t2 = new FindNumberThread(array, false);

        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch (InterruptedException e){
            System.out.println("Error");
        }
        int max = t1.getNumber();
        int min = t2.getNumber();
        System.out.println("Max element: " + max);
        System.out.println("Min element: " + min)
 
    }
}
