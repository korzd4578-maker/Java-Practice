package Practice07;

public class StringUtils {
          private StringUtils() {
        }

        public static boolean isPalindrome(String s) {

            if (s == null) {
                return false;
            }

            String text = s.replaceAll("\\s+", "").toLowerCase();

            int left = 0;
            int right = text.length() - 1;

            while (left < right) {

                if (text.charAt(left) != text.charAt(right)) {
                    return false;
                }

                left++;
                right--;
            }

            return true;
        }

        public static String reverse(String s) {

            if (s == null) {
                return "";
            }

            String result = "";

            for (int i = s.length() - 1; i >= 0; i--) {
                result += s.charAt(i);
            }

            return result;
        }

        public static int countVowels(String s) {

            if (s == null) {
                return 0;
            }

            int count = 0;

            String vowels = "aeiouаеєиіїоуюя";

            for (int i = 0; i < s.length(); i++) {

                char letter = Character.toLowerCase(s.charAt(i));

                if (vowels.indexOf(letter) != -1) {
                    count++;
                }
            }

            return count;
        }

        public static String maskCardNumber(String cardNumber) {

            if (cardNumber == null) {
                return "";
            }

            String digits = cardNumber.replaceAll("\\D", "");

            if (digits.length() <= 4) {
                return digits;
            }

            String result = "";

            for (int i = 0; i < digits.length(); i++) {

                if (i < digits.length() - 4) {
                    result += "*";
                } else {
                    result += digits.charAt(i);
                }

                if ((i + 1) % 4 == 0 && i < digits.length() - 1) {
                    result += " ";
                }
            }

            return result;
        }
}

