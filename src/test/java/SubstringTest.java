import exception.InvalidInputInLongestCommonSubstrException;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.junit.Assert.assertEquals;

public class SubstringTest {

    @Test
    public void givenTwoStringsWithCommonSubstr_whenLongestCommonSubstr_returnLongestSubstr() {
        String substr = Substring.longestCommonSubstr("Some text. Hello world, my name is Nazar", "Hello world, this is my 1st test case");
        assertEquals("Hello world, ", substr);
    }


    @Test
    public void givenInvalidInput_whenLongestCommonSubstr_returnCustomException() {
        Throwable thrown = catchThrowable(() -> Substring.longestCommonSubstr(null, "asdfgh"));

        assertThat(thrown)
                .isNotNull()
                .isInstanceOf(InvalidInputInLongestCommonSubstrException.class)
                .hasMessageContaining("invalid input in LongestCommonSubstr method");
    }

    @Test
    public void givenTwoStringsWithOnlyOneCommonChar_whenLongestCommonSubstr_returnMessage(){
        assertEquals("only one common char - b",Substring.longestCommonSubstr("bcdtyu","zxbnmal"));
    }

    @Test
    public void givenTwoStringsWithNoCommonChars_whenLongestCommonSubstr_returnMessage(){
        assertEquals("no common chars",Substring.longestCommonSubstr("asdfghjk","qwertyui"));
    }

}
