import org.apache.commons.lang3.StringUtils;

import static java.lang.String.valueOf;

public class NumberGame {
    public String show(int input) {
        String output = "";
        if (input % 3 == 0) {
            output += "Fizz";
        }
        if (input % 5 == 0) {
            output += "Buzz";
        }
        if (StringUtils.isNotBlank(output)) {
            return output;
        }
        return valueOf(input);
    }
}
