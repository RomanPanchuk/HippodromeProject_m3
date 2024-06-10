import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class HorseTest {

    @Test
    public void constructor_NullNameParam_ThrowsIllegalArgumentException() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new Horse(null, 1, 2));
        assertEquals(exception.getMessage(), "Name cannot be null.");
    }

    @ParameterizedTest
    @ValueSource(strings = {" ", "  ", "\n", "\n\n", "\t", "\t\t", "\t \t"})
    public void constructor_EmptyNameParam_ThrowsIllegalArgumentException(String name) {
        // Arrange
        String exceptionMessage = "Name cannot be blank.";

        // Act
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new Horse(name, 1, 2));

        //Assert
        assertEquals(exception.getMessage(), exceptionMessage);
    }

    @Test
    public void constructor_NagativeSpeedParam_ThrowsIllegalArgumentException() {
        String exceptionMessage = "Distance cannot be negative.";
        String name = "testName";
        int speed = 1;
        int distance = -3;

        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new Horse(name, speed, distance));
        assertEquals(exception.getMessage(), exceptionMessage);
    }

    @Test
    public void constructor_NagativeDistanceParam_ThrowsIllegalArgumentException() {
        String exceptionMessage = "Speed cannot be negative.";
        String name = "testName";
        int speed = -1;
        int distance = 3;

        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new Horse(name, speed, distance));
        assertEquals(exception.getMessage(), exceptionMessage);
    }

    @Test
    void getName() {
    }

    @Test
    void getSpeed() {
    }

    @Test
    void getDistance() {
    }

    @Test
    void move() {
    }

    @Test
    void getRandomDouble() {
    }
}