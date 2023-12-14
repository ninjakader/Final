import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class SelectionSortTest {

    @Test
    public void testPositive() {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = { 5, 4, 8, 1, 3 };
        int[] expected = { 1, 4, 3, 5, 8 };
        selectionSort.selectionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testNegatives() {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = { -5, -2, -8, -1, -3 };
        int[] expected = { -8, -5, -3, -2, -1 };
        selectionSort.selectionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMixed() {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = { 5, -3, 0, -1, 3 };
        int[] expected = { -3, -1, 0, 3, 5 };
        selectionSort.selectionSort(arr);
        assertArrayEquals(expected, arr);
    }
}
