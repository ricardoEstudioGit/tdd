package util;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static util.PasswordUtil.SecurityLevel.*;

public class PasswordUtilTest {

    @Test
    public void passwordWeak() {

        assertEquals(WEAK, PasswordUtil.assessPassword("1234567"));
        assertEquals(WEAK, PasswordUtil.assessPassword("aserwew"));
        assertEquals(WEAK, PasswordUtil.assessPassword("12345!a"));
    }
    /*
      mayor o igual a 8 y menor o igual 11 digitos
      contiene letras y numeros
     */
    @Test
    public void passwordMedium() {
        // pasa la prueba
        assertEquals(MEDIUM, PasswordUtil.assessPassword("1234sdAds56"));
        assertEquals(MEDIUM, PasswordUtil.assessPassword("123222256"));
        assertEquals(MEDIUM, PasswordUtil.assessPassword("123222256"));
    }
    /*
      mayor a 11 digitos
     */
    @Test
    public void passwordStrong() {
        assertEquals(STRONG, PasswordUtil.assessPassword("12345!asdada7891011121314"));
    }
}