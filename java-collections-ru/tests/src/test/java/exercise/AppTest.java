package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class AppTest {
    static List<Integer> testList;
    static List<Integer> testListZeroSize;

    @BeforeAll
    static void prepare() {
        testList = List.of(22, 41, 0, -2, 194, -886);
        testListZeroSize = List.of();
    }

    @Test
    void testTake1() {
        int testNumber = 3;
        List<Integer> actual1 = App.take(testList, testNumber);
        assertThat(actual1).hasSize(3);
    }

    @Test
    void testTake2() {
        int testNumber = 8;
        List<Integer> actual1 = App.take(testList, testNumber);
        assertThat(actual1).hasSize(6);
    }

    @Test
    void testTake3() {
        int testNumber = 0;
        List<Integer> actual1 = App.take(testList, testNumber);
        assertThat(actual1).hasSize(0);
    }

    @Test
    void testTake4() {
        int testNumber = -1;
        List<Integer> actual1 = App.take(testList, testNumber);
        assertThat(actual1).hasSize(0);
    }

    @Test
    void testTake5() {
        int testNumber = 5;
        List<Integer> actual1 = App.take(testListZeroSize, testNumber);
        assertThat(actual1).hasSize(0);
    }
}
