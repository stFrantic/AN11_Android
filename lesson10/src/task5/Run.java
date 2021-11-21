package task5;


import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Run {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers by the \",\" ");
        String[] nums = in.nextLine().split(",");
        Set<Integer> numbers = new LinkedHashSet<>();
        for (String n: nums){
            System.out.println(n.trim());
            numbers.add(Integer.parseInt(String.valueOf(n.trim())));
        }
        System.out.println("--------------------");
        for (int i: numbers){
            System.out.println(i);
        }

    }
}
