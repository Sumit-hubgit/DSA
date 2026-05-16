package SlidingWindow;

import java.util.HashMap;

public class CountOccurencesOfAnagram {

    public static void main(String[] args) {

        String txt = "aabaabaa";
        String pat = "aaba";
        int n1 = txt.length(), n2 = pat.length();

        // Create a frequency map for the pattern
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n2; i++) {
            map.put(pat.charAt(i), map.getOrDefault(pat.charAt(i), 0) + 1);
        }

        int i = 0, j = 0, count = map.size(); // Initialize count as map size
        int anagramCount = 0;

        while (j < n1) {
            // Process the current character in the sliding window
            char ch = txt.charAt(j);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0) {
                    count--; // Character matched completely
                }
            }

            // Check if the current window size is less than the pattern length
            if (j - i + 1 < n2) {
                j++;
            }
            // If window size matches the pattern length
            else if (j - i + 1 == n2) {
                // If all characters are matched
                if (count == 0) {
                    anagramCount++;
                }

                // Before sliding the window, restore the leftmost character
                char leftChar = txt.charAt(i);
                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar) + 1);
                    if (map.get(leftChar) > 0) {
                        count++; // Left character is no longer fully matched
                    }
                }

                // Slide the window
                i++;
                j++;
            }
        }

        System.out.println(anagramCount);
    }
}