package util;

public class StringUtil {
    public static String repeat (String str, int times) {

        if (times < 0) {
            throw new IllegalArgumentException("argumento invalido");
        }


        String result = "";

        // sin error

        for (int i = 0; i < times; i++) {
            result += str;
        }

        // con error
        /*for (int i = 0; i <= times; i++) {
            result += str;
        }*/

        return result;

    }
}
