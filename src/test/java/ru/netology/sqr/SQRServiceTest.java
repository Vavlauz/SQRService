package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'edge equals with sqr, expected true', 100, 225, 6", "'edge not equals with sqr, expected true', 200, 300, 3",
            "'sqr outside, expected true', 25, 81, 0", "'all sqr inside edge, expected true', 81, 9802, 90"})
    void shouldCalculate(String testName, int downEdge, int upEdge, int expected) {
        SQRService service = new SQRService();

        int actual = service.sqrNumber(downEdge, upEdge);

        assertEquals(expected, actual);

    }

}