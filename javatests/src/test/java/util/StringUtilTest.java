package util;

public class StringUtilTest {

    public static void main(String[] args) {

        // Sin error
        assertEquals(StringUtil.repeat("prueba", 2), "pruebaprueba");

        // Con error------------------

        //assertEquals(StringUtil.repeat("prueba", 2), "pruebaprueba");



    }

    private static void assertEquals (String actual, String esperado) {
        if (!actual.equals(esperado)) {
            throw new RuntimeException(actual + " no es igual al valor esperado " + esperado);
        }
    }

}