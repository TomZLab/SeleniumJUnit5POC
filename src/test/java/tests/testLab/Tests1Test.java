package tests.testLab;

import org.junit.BeforeClass;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import tests.BaseTest;

/************************************************************************
 Description : Test class example
 Created by : Tomasz Zulawnik

 Class History
 -------------------------------------------------------------------------
 Date 		Author		 							    Reason
 2022-02-02	Tomasz Zulawnik                             Class created
 ************************************************************************/

@Order(1)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Tests1Test extends BaseTest {

    @BeforeAll
    public void classSetup() {
//        driver.get(testUrl);
    }

    @Test
    @Order(1)
    public void firstTest() {
        Assertions.assertAll(
                () -> Assertions.assertEquals(1, 2),
                () -> Assertions.assertEquals(2, 3)
        );
    }

    @Test
    @Order(2)
    public void secondTest() throws Exception {
        driver.findElement(By.xpath("."));
        Assertions.assertEquals(1, 2);
        Assertions.assertEquals(2, 3);
    }

    @Test
    @Order(3)
    public void thirdTest() {
    }

    @Test
    @Order(4)
    public void fourthTest(){
    }

    @Test
    @Order(5)
    public void fifthTest(){
    }
}
