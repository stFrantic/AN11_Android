package task4;

public class Run {
    public static void main(String[] args) {
        String text = "Aasdklw aaaa asdqwed addaa gg qweeda adda adda";
        String[] words = text.split(" ");
        int[] uniqCharsCounter = new int[words.length];
        int m = 0;
        for (String word : words) {
            String uniqChar = new String(String.valueOf(word.charAt(0)));
            for (int i = 1; i < word.length(); i++) {
                boolean isUniq = true;
                for (int j = 0; j < uniqChar.length(); j++) {
                    if (word.charAt(i) == uniqChar.charAt(j)) {
                        isUniq = false;
                    }
                }
                if (isUniq) {
                    uniqChar = uniqChar.concat(String.valueOf(word.charAt(i)));
                }
            }
            uniqCharsCounter[m] = uniqChar.length();
            m++;
        }
        int min = uniqCharsCounter[0];
        int index = 0;
        for (int i = 1; i < uniqCharsCounter.length; i++) {
            if (min > uniqCharsCounter[i]) {
                min = uniqCharsCounter[i];
                index = i;
            }
        }
        System.out.println("First word with minimal uniq letters is: " + words[index]);

    }
}
