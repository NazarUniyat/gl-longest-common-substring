import exception.InvalidInputInLongestCommonSubstrException;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.junit.Assert.assertEquals;

public class SubstringTest {

    @Test
    public void givenTwoStringsWithCommonSubstr_whenLongestCommonSubstr_returnLongestSubstr() {
        String substr = Substring.longestCommonSubstr("Hello world my name is Nazar", "Hello world i love you");
        assertEquals("Hello world ", substr);
    }


    @Test
    public void givenInvalidInput_whenLongestCommonSubstr_returnCustomException() {
        Throwable thrown = catchThrowable(() -> Substring.longestCommonSubstr(null, "asdfgh"));

        assertThat(thrown)
                .isNotNull()
                .isInstanceOf(InvalidInputInLongestCommonSubstrException.class)
                .hasMessageContaining("invalid input in LongestCommonSubstr method");
    }


}
