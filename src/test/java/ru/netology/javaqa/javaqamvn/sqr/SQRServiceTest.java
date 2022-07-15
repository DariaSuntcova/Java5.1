package ru.netology.javaqa.javaqamvn.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/SQRTest")
    public void testSQRService(int expected, int x, int y) {
        SQRService service = new SQRService();

        int actual = service.calcSQRAreInRange(x, y);

        Assertions.assertEquals(expected, actual);
    }
}
