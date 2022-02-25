class ReverseString {

    public static void main(String[] args) {
        // Example
        String message = "robot";
        System.out.println(reverse(message));
    }

    public static String reverse(String inputString) {
        // convert string into an array of characters
        char[] singleLetters = new char[inputString.length()];
        for (int i = 0; i < inputString.length(); i++) {
            singleLetters[i] = inputString.charAt(i);
        }

        // Swaps the current character to the last index of the character that decrements for each iteration
        char swap;
        for (int j = 0; j < singleLetters.length / 2; j++) {
            swap = singleLetters[j];
            singleLetters[j] = singleLetters[(singleLetters.length - 1) - j];
            singleLetters[(singleLetters.length - 1) - j] = swap;
        }
        // Converts the character array to return a String
        return String.valueOf(singleLetters);
    }

}
