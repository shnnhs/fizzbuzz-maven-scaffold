import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberGameTest {
    @ParameterizedTest
    @CsvSource({
            "1,1",
            "3,Fizz",
            "5,Buzz",
            "15,FizzBuzz"
    })
    public void number_game_test(int input,String output) {
        assertEquals( new NumberGame().show(input), output);
    }
}
