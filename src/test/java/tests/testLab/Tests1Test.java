package tests.testLab;

import org.junit.jupiter.api.*;
import tests.BaseTest;

/************************************************************************
 Description : Test class
 - example of soft and hard assertions
 - tests executed in a particular order (@Order)

 Created by : Tomasz Zulawnik

 Class History
 -------------------------------------------------------------------------
 Date 		Author		 							    Reason
 2022-02-02	Tomasz Zulawnik                             Class created
 ************************************************************************/

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Tests1Test extends BaseTest {

    @BeforeAll
    public void classSetup() {
        driver.get(baseUrl);
    }

    private final int a = 1;
    private final int b = 2;
    private final int c = 3;

    //Soft assertion example
    @Test
    @Order(1)
    public void firstTest() {
        Assertions.assertAll(
                () -> Assertions.assertEquals(a, b),
                () -> Assertions.assertEquals(b, c)
        );
    }

    //Hard assertion example
    @Test
    @Order(2)
    public void secondTest() {
        Assertions.assertEquals(a, b);
        Assertions.assertEquals(b, c);
    }

    @Test
    @Order(3)
    public void thirdTest() {
        //your test code here
    }

    @Test
    @Order(4)
    public void fourthTest() {
        //your test code here
    }

    @Test
    @Order(5)
    public void fifthTest() {
        //your test code here
    }
}
