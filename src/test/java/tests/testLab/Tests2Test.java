package tests.testLab;

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

@Order(2)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Tests2Test extends BaseTest {

    @BeforeAll
    public void classSetup(){
        driver.get(baseUrl);
    }

    @Test
    public void firstTest(){
    }

    @Test
    public void secondTest(){
    }

    @Test
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
