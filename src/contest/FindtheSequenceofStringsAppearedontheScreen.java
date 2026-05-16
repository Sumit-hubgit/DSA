package contest;

import java.util.ArrayList;

public class FindtheSequenceofStringsAppearedontheScreen {
    public static void main(String[] args) {

        System.out.println("Hello World");
        String target = "abc"; // Target string
        String ans = "a"; // Initial answer string
        int n = target.length(); // Length of the target string

        ArrayList<String> list = new ArrayList<>();

        // Generate the initial sequence till we reach the first character of 'target'
        if (ans.charAt(0) != target.charAt(0)) {
            for (char ch = 'a'; ch <= target.charAt(0); ch++) {
                list.add(Character.toString(ch));
            }
        }

        int i = 0, j = 0;

        // Update 'ans' to be the last string in the list (which is the character 'h')
        ans = list.get(list.size() - 1);

        // Continue building sequences
        while (j < n) {
            if (i < ans.length() && target.charAt(j) == ans.charAt(i)) {
                // Add 'a' to the current 'ans' string and store it in the list
                String temp = ans + 'a';
                list.add(temp);

                char ch = 'a';
                // Increment 'ch' until it matches target.charAt(j) and keep adding to the list
                while (ch != target.charAt(j)) {
                    String t = ans + ((char) (ch + 1));
                    ch++;
                    list.add(t);
                }

                i++; // Move to the next character in 'ans'
            }
            j++; // Move to the next character in 'target'
        }

        // Print the sequence generated
        System.out.println(list);
    }
}
