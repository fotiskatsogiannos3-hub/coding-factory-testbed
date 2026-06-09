package gr.aueb.cf.cf9.ch13;

/**
 * Utility class providing common string helper methods.
 * All methods are static; this class cannot be instantiated.
 */
public class StringUtils {

    private StringUtils() {

    }

    /**
     * This method returns a reversed String
     * @param str       the string for reverse
     * @return          the reversed string
     */
    public static String reverse(String str) {
        if (str == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    /**
     * This method converts a string to uppercase
     * @param str       the given string
     * @return          the string converted to uppercase
     */
    public static String toUpperCase(String str) {
        if (str == null) {
            return null;
        }

        return str.toUpperCase();
    }

    /**
     * This method checks if the string is palindrome
     * @param str       the given string
     * @return          true if is palindrome, false otherwise.
     */
    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        String cleaned = str.replaceAll("\\s+", "").toString();

        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
