package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FirstTest extends BaseTest {

    @Test
    void firstTest() {
        Assertions.assertAll(
                () -> Assertions.assertEquals("data:,", driver.getCurrentUrl(), "Wrong current Url"),
                () -> Assertions.assertTrue(driver.getTitle().isEmpty(), "Title is empty")
        );
    }
}
