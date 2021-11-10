package task1;

public class Run {
    public static void main(String[] args) {
        StringBuilder stringBulder = new StringBuilder("gajdgwqjhwejqgaksbhajsdw");
        int firstIndex = stringBulder.indexOf("a"), lastIndex = stringBulder.indexOf("b");
        String answer = new String();
        if(firstIndex != -1 && lastIndex != -1){
           answer = stringBulder.substring(firstIndex,lastIndex);
            System.out.println(answer);
        }
    }
}
