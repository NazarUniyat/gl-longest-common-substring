import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubstringTest {

    @Test
    public void givenTwoStringsWithCommonSubstr_whenLongestCommonSubstr_returnLongestSubstr(){
        String substr = Substring.longestCommonSubstr("asdfqqqg", "hjklqqqq");
        assertEquals("qqqq",substr);
    }

}
