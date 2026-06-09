package gr.aueb.cf.cf9.ch13;

/**
 * Utility class providing common math helper methods.
 * All methods are static; this class cannot be instantiated.
 */
public class MathHelper {

    private MathHelper() {

    }

    /**
     * Returns the maximum value in the given integer array.
     *
     * @param arr the integer array to search
     * @return the maximum value, or 0 if the array is null or empty
     */
    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * Returns the minimum value in the given integer array.
     *
     * @param arr the integer array to search
     * @return the minimum value, or {@link Integer#MAX_VALUE} if the array is null or empty
     */
    public static int findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            return Integer.MAX_VALUE;
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * Calculates and returns the integer average of the given array.
     *
     * @param arr the integer array
     * @return the average value (integer division)
     * @throws IllegalArgumentException if the array is null or empty
     */
    public static int calculateAverage(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;

    }
}
