public class smallest_and_largest_palindromewordin_string {

    // Method to check if a word is a palindrome
    static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // STEP 2: Define the input string
        String string = "Wow you own kayak ";

        // STEP 3: Initialize variables
        String word = "", smallPalin = "", bigPalin = "";

        // STEP 4: Declare an array to store words
        String[] words = new String[string.length()];

        // STEP 5: Initialize temp and count
        int temp = 0, count = 0;

        // STEP 6: Convert the string to lowercase
        string = string.toLowerCase();

        // STEP 7: Append an extra space to the string
        string = string + " ";

        // STEP 8: Split the string into words
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') {
                word = word + string.charAt(i); // Add character to current word
            } else if (!word.isEmpty()) {
                words[temp] = word; // Store the word in the array
                temp++; // Increment the word counter
                word = ""; // Reset the word
            }
        }

        // STEP 12: Iterate through each word to find palindromes
        for (int i = 0; i < temp; i++) {
            if (isPalindrome(words[i])) {
                count++; // Increment palindrome count

                if (count == 1) {
                    // STEP 14: Initialize smallPalin and bigPalin with the first palindrome
                    smallPalin = bigPalin = words[i];
                } else {
                    // STEP 15: Update smallPalin if the current word is smaller
                    if (words[i].length() < smallPalin.length()) {
                        smallPalin = words[i];
                    }
                    // STEP 16: Update bigPalin if the current word is larger
                    if (words[i].length() > bigPalin.length()) {
                        bigPalin = words[i];
                    }
                }
            }
        }

        // STEP 18: Print the result
        if (count == 0) {
            System.out.println("No palindrome is present in the given string.");
        } else {
            System.out.println("Smallest palindrome word: " + smallPalin);
            System.out.println("Largest palindrome word: " + bigPalin);
        }
    }
}
