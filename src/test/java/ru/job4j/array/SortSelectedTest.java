package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort34125Then12345() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort214Then124() {
        int[] data = new int[] {2, 1, 4};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 4};
        assertThat(result).containsExactly(expected);
    }
}