package tests.testLab;

import org.junit.BeforeClass;
import org.junit.jupiter.api.*;
import tests.BaseTest;

/************************************************************************
 Description : Test class example
 Created by : Tomasz Zulawnik

 Class History
 -------------------------------------------------------------------------
 Date 		Author		 							    Reason
 2022-02-02	Tomasz Zulawnik                             Class created
 ************************************************************************/

@Order(3)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Tests3Test extends BaseTest {

    @BeforeClass
    public void classSetup(){
        driver.get(baseUrl);
    }

    @Test
    @Order(1)
    public void firstTest(){
    }

    @Test
    @Order(2)
    public void secondTest(){
    }

    @Test
    @Order(3)
    public void thirdTest(){
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
