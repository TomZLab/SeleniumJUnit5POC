package tests.testLab;

import models.User;
import org.junit.jupiter.api.*;

import java.util.stream.Stream;

public class TestFactoryTest {
    @TestFactory
    Stream<DynamicTest> runTestsWithDifferentUsers() {
        return Stream.of(
                new User("Alice", "Merc", 25),
                new User("Adam", "Bimmer", 18)
        ).map(user ->
                DynamicTest.dynamicTest("Running tests for user: " + user.getFirstName() + " " + user.getLastName(), () -> {
                    UsersTests testInstance = new UsersTests(user);
                    testInstance.runAllTests();
                })
        );
    }
}

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class UsersTests {

    private User user;

    UsersTests(User user) {
        this.user = user;
    }

    public void runAllTests() {
        firstNameTest();
        lastNameTest();
        isAdultTest();
    }

    @Test
    @Order(1)
    public void firstNameTest() {
        Assertions.assertTrue(user.getFirstName().startsWith("A"), "first name starts with 'A'");
    }

    @Test
    @Order(2)
    public void lastNameTest() {
        Assertions.assertTrue(user.getLastName().startsWith("M"), "last name starts with 'M'");
    }

    @Test
    @Order(3)
    public void isAdultTest() {
        Assertions.assertTrue(user.isAdult(), "user is adult");
    }
}
