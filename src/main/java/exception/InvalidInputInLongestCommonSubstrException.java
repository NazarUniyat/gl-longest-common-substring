package exception;

public class InvalidInputInLongestCommonSubstrException extends RuntimeException{
    public static final String INVALID_INPUT_MESSAGE = "invalid input in LongestCommonSubstr method";

    public InvalidInputInLongestCommonSubstrException() {
        super(INVALID_INPUT_MESSAGE);
    }

}
