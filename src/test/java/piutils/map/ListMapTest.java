package piutils.map;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class ListMapTest {

    private ListMap<Integer, String> numbers;

    @Before
    public void init() {
        numbers = new ListMap<>();
    }

    @Test
    public void emptyListTest() {
        assertTrue(numbers.get(5).isEmpty());
    }

    @Test
    public void putGetTest() {
        numbers.put(1, "one");
        numbers.put(1, "egy");

        assertThat(numbers.get(1), hasItems("one", "egy"));
    }

    @Test
    public void keySetTest() {
        numbers.put(1, "one");
        numbers.put(2, "two");

        assertThat(numbers.keySet(), hasItems(1, 2));
    }

    @Test
    public void clearTest() {
        numbers.put(1, "one");
        numbers.put(2, "two");

        assertThat(numbers.keySet().size(), equalTo(2));

        numbers.clear();

        assertThat(numbers.keySet().size(), equalTo(0));
    }
}
