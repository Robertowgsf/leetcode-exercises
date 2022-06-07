package roman.to.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    static Stream<Arguments> shouldCastRomanToInteger() {
        return Stream.of(
                Arguments.of("XXVII", 27),
                Arguments.of("IX", 9),
                Arguments.of("IV", 4),
                Arguments.of("CD", 400),
                Arguments.of("DC", 600)
        );
    }

    @ParameterizedTest
    @MethodSource("shouldCastRomanToInteger")
    void shouldCastRomanToInteger(String romanNumber, int expected) {
        App classUnderTest = new App();
        assertEquals(expected, classUnderTest.romanToInt(romanNumber));
    }
}
