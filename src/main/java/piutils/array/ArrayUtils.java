package piutils.array;

public class ArrayUtils {

    /***
     * Checks if the given arrays are equal.
     * @param a1 First array
     * @param a2 Second array
     * @param <T> Type
     * @return The answer
     */
    public static <T> boolean equals(T[] a1, T[] a2) {
        if (a1.length != a2.length) {
            return false;
        }

        for (int i = 0; i < a1.length; i++) {
            if (!a1[i].equals(a2[i])) {
                return false;
            }
        }

        return true;
    }

    /**
     * Checks if the given element is in the array.
     *
     * @param array   The array
     * @param element The element
     * @param <T>     Type
     * @return The answer
     */
    public static <T> boolean contains(T[] array, T element) {
        for (T object : array) {
            if (object.equals(element)) {
                return true;
            }
        }
        return false;
    }

}
