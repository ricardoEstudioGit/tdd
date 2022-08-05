package util;

public class StringUtil {
    public static String repeat (String str, int times) {
        String result = "";

        // sin error

        /*for (int i = 0; i < times; i++) {
            result += str.concat(" ");
        }*/

        // con error
        for (int i = 0; i <= times; i++) {
            result += str.concat(" ");
        }
        return result.trim();
    }
}
