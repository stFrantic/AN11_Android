package task2;

public class Run {
    public static void main(String[] args) {
        StringBuilder stringBulder = new StringBuilder("gajdgwqjhwejdddddddddddddddqgaksbhajsdddddddddddddw");
        System.out.println(stringBulder);
        char temp = stringBulder.charAt(3);
        System.out.println(temp);
        char change = stringBulder.charAt(0);
        System.out.println(change);
        for (int i = 1; i < stringBulder.length();i++){
            if(stringBulder.charAt(i) == temp){
                stringBulder.setCharAt(i,change);
            }
        }
        System.out.println(stringBulder);
    }
}
