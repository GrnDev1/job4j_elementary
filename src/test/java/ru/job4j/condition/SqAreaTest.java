package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class SqAreaTest {

    @Test
    public void whenP6K2then2() {
        int expected = 2;
        int p = 6;
        int k = 2;
        double out = SqArea.square(p, k);
        assertThat(out).isCloseTo(expected, offset(0.01));
    }

    @Test
    public void whenP5K3then1dot17() {
        double expected = 1.17;
        int p = 5;
        int k = 3;
        double out = SqArea.square(p, k);
        assertThat(out).isCloseTo(expected, offset(0.01));
    }

    @Test
    public void whenP7K2then2dot72() {
        double expected = 2.72;
        int p = 7;
        int k = 2;
        double out = SqArea.square(p, k);
        assertThat(out).isCloseTo(expected, offset(0.01));
    }
}