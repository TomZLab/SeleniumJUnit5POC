package tests.testLab;

import org.junit.jupiter.api.*;
import tests.BaseTest;

/************************************************************************
 Description : Test class with
 - tests executed with unpredictable order
 - some test methods disabled (@Disabled)

 Created by : Tomasz Zulawnik

 Class History
 -------------------------------------------------------------------------
 Date 		Author		 							    Reason
 2022-02-02	Tomasz Zulawnik                             Class created
 ************************************************************************/

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Tests3Test extends BaseTest {

    @BeforeAll
    public void classSetup() {
        driver.get(baseUrl);
    }

    @Test
    public void firstTest() {
        //your test code here
    }

    @Disabled
    @Test
    public void secondTest() {
        //your test code here
    }

    @Test
    public void thirdTest() {
        //your test code here
    }

    @Disabled
    @Test
    public void fourthTest() {
        //your test code here
    }

    @Test
    public void fifthTest() {
        //your test code here
    }
}
