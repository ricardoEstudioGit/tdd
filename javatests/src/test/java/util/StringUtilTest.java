package util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    // CREAR UNA FUNCION DE TEST PARA CADA COMPROBACIÓN
    @Test
    public void testRepeatDosVeces() {
        // Sin error
        // assertEquals(StringUtil.repeat("prueba", 2), "pruebaprueba");
        // Con error------------------
        Assert.assertEquals(StringUtil.repeat("prueba", 2), "pruebaprueba");
    }

    @Test
    public void testRepeatTresVeces() {
        // Sin error
        /*assertEquals(StringUtil.repeat("prueba", 2), "pruebaprueba");*/
        // Con error------------------
        Assert.assertEquals(StringUtil.repeat("prueba", 3), "pruebapruebaprueba");
    }
    @Test
    public void testRepeatCeroVeces() {
        // Sin error
        /*assertEquals(StringUtil.repeat("prueba", 2), "pruebaprueba");*/
        // Con error------------------
        Assert.assertEquals(StringUtil.repeat("", 0), "");
    }

    // esto es error entonces mandamos una excepcion
    @Test(expected = IllegalArgumentException.class)
    public void testRepeatNumeroNegativo() {
        // Sin error
        /*assertEquals(StringUtil.repeat("prueba", 2), "pruebaprueba");*/
        // Con error------------------
        Assert.assertEquals(StringUtil.repeat("", -4), "");
    }



    /*private static void assertEquals (String actual, String esperado) {
        if (!actual.equals(esperado)) {
            throw new RuntimeException(actual + " no es igual al valor esperado " + esperado);
        }
    }*/

}