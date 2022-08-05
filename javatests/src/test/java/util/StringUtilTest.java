package util;

public class StringUtilTest {

    public static void main(String[] args) {

        // Sin error

        String result = StringUtil.repeat("prueba", 2);
        System.out.println(result);
        if (result.equals("prueba prueba")){
            System.out.println("ok");
        }

        // Con error

        String result2 = StringUtil.repeat("prueba", 2);
        System.out.println(result2);
        if (!result2.equals("prueba prueba")){
            System.out.println("error");
        }


    }

}