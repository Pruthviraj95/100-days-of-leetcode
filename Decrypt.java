import java.util.StringTokenizer;

class Result {

    public static String decryptMessage(String encryptedMessage) {
        // Split the encrypted message into words
        String[] words = encryptedMessage.split(" ");
        String[] rev= new String[words.length];

        // Reverse each word and apply character frequency decryption
        StringBuilder decryptedMessage = new StringBuilder();
        int k=words.length-1;

        for (String word : words) {
            // decryptedMessage.append(decryptWord(word)).append(" ");
            rev[k]=decryptWord(word);
            k--;
        }
        for(int i=0;i<words.length;i++){
            decryptedMessage.append(rev[i]).append(" ");
        }
        // Trim the trailing space and return the decrypted message
        return decryptedMessage.toString().trim();
    }

    // Helper method to decrypt a single word
    private static String decryptWord(String word) {
        StringBuilder decryptedWord = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);

            if (Character.isDigit(currentChar)) {
                // If the current character is a digit, repeat the previous character
                char previousChar = decryptedWord.charAt(decryptedWord.length() - 1);
                int frequency = Character.getNumericValue(currentChar);
                for (int j = 1; j < frequency; j++) {
                    decryptedWord.append(previousChar);
                }
            } else {
                // If the current character is not a digit, append it to the decrypted word
                decryptedWord.append(currentChar);
            }
        }

        return decryptedWord.toString();
    }
}

public class Decrypt {

    public static void main(String[] args) {
        // Test the decryptMessage function
        String encryptedMessage = "seaside the to sent be to ne2ds army ten of team a";
        String result = Result.decryptMessage(encryptedMessage);
        System.out.println(result);
    }
}
