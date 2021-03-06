import exception.InvalidInputInLongestCommonSubstrException;

public class Substring {


    public static String longestCommonSubstr(String S1, String S2) {

        if (S1 == null || S2 == null) {
            throw new InvalidInputInLongestCommonSubstrException();
        }

        int Start = 0;
        int Max = 0;
        for (int i = 0; i < S1.length(); i++) {
            for (int j = 0; j < S2.length(); j++) {
                int x = 0;
                while (S1.charAt(i + x) == S2.charAt(j + x)) {
                    x++;
                    if (((i + x) >= S1.length()) || ((j + x) >= S2.length())) break;
                }
                if (x > Max) {
                    Max = x;
                    Start = i;
                }
            }
        }

        String substring = S1.substring(Start, (Start + Max));
        if (substring.length() == 1) {
            return "only one common char - " + substring;
        }
        if (substring.length() == 0) {
            return "no common chars";
        }
        return substring;
    }

}

