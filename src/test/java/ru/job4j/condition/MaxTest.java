package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int a = 1;
        int b = 2;
        int expected = 2;
        int result = Max.max(a, b);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To2Then3() {
        int a = 3;
        int b = 2;
        int expected = 3;
        int result = Max.max(a, b);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To3Then3() {
        int a = 3;
        int b = 3;
        int expected = 3;
        int result = Max.max(a, b);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To3To4Then4() {
        int a = 3;
        int b = 3;
        int c = 4;
        int expected = 4;
        int result = Max.max(a, b, c);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To3To4To6Then6() {
        int a = 3;
        int b = 3;
        int c = 4;
        int d = 6;
        int expected = 6;
        int result = Max.max(a, b, c, d);
        assertThat(result).isEqualTo(expected);
    }
}