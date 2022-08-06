package util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void testRepeat() {
        // Sin error
        assertEquals(StringUtil.repeat("prueba", 2), "pruebaprueba");
        // Con error------------------
        Assert.assertEquals(StringUtil.repeat("prueba", 2), "pruebaprueba");
    }

    private static void assertEquals (String actual, String esperado) {
        if (!actual.equals(esperado)) {
            throw new RuntimeException(actual + " no es igual al valor esperado " + esperado);
        }
    }

}