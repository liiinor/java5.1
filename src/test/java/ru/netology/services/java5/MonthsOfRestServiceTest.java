package ru.netology.services.java5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.provider.CsvSource;

public class MonthsOfRestServiceTest {
    @ParametrizedTest
    @CsvSource({
            "3,10_000,3000,20_000",
            "2,100_000,60_000,150_000"
    })

    public void MonthsOfRestService(int expected, int income, int expense, int threshold) {
        MonthsOfRestService service = new MonthsOfRestService();

        int actual = service.calculate(income, expense, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
