package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PointTest {

    @Test
    public void when00To20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        assertThat(a.distance(b)).isEqualTo(expected);
    }

    @Test
    public void when56To99Then5() {
        Point a = new Point(5, 6);
        Point b = new Point(9, 9);
        double expected = 5;
        assertThat(a.distance(b)).isEqualTo(expected);
    }

    @Test
    public void when00To43Then5() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 3);
        double expected = 5;
        assertThat(a.distance(b)).isEqualTo(expected);
    }

    @Test
    public void when00To03Then3() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 3);
        double expected = 3;
        assertThat(a.distance(b)).isEqualTo(expected);
    }
}