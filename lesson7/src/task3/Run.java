package task3;

public class Run {
    static boolean isPalindrome(String word) {
        for (int i =0; i < word.length();i++){
            if (word.charAt(i) != word.charAt(word.length() - i - 1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String text = "Aasdklw.A asdqwed adda.G qweeda adda adda";
        String[] sentences = text.split("\\.");
        int max = 0;
        int answer = -1;
        for (int i = 0; i < sentences.length; i++) {
            String[] words = sentences[i].split(" ");
            int counter = 0;
            for (String j : words) {
                if (isPalindrome(j)) {
                    counter++;
                }
            }
            if (max < counter) {
                max = counter;
                answer = i;
            }
        }
        if (answer != -1){
            System.out.println("the sentence with the most palindromes: " + sentences[answer]);
        }else System.out.println("There no sentence with palindromes");
    }

}

