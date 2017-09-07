package piutils.array;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ArrayUtilsTest {

    @Test
    public void equalsTest() {
        Integer[] a1 = {1, 2, 3};
        Integer[] a2 = {1, 2, 3};

        assertTrue(ArrayUtils.equals(a1, a2));
    }

    @Test
    public void notEqualsTest() {
        Integer[] a1 = {1, 2, 3};
        Integer[] a2 = {1, 2, 4};

        assertFalse(ArrayUtils.equals(a1, a2));
    }

    @Test
    public void notSameLengthTest() {
        Integer[] a1 = {1, 2, 3};
        Integer[] a2 = {1, 2, 3, 4};

        assertFalse(ArrayUtils.equals(a1, a2));
    }

    @Test
    public void containsTest() {
        Integer element = 5;
        Integer[] array = {1, 2, 3, 4, 5};

        assertTrue(ArrayUtils.contains(array, element));
    }

    @Test
    public void notContainsTest() {
        Integer element = 5;
        Integer[] array = {1, 2, 3, 4};

        assertFalse(ArrayUtils.contains(array, element));
    }

}
