package util;

public class PasswordUtil {

    public enum SecurityLevel {
        WEAK, MEDIUM, STRONG
    }

    public static SecurityLevel assessPassword(String password) {

        if (password.length() < 8) {
            return SecurityLevel.WEAK;
        }
        if (password.matches("[a-zA-Z0-9!@#$%&*()_+=|<>?{}\\[\\]~-]+") && (password.length() >= 8 && password.length() <= 11)) {
            return SecurityLevel.MEDIUM;
        }
        if (password.length() > 11 && password.matches("[a-zA-Z0-9!@#$%&*()_+=|<>?{}\\[\\]~-]+")) {
            return SecurityLevel.STRONG;
        }
        throw new RuntimeException("ERR0R EN CONTRASEÑA");
    }

}

/*
if (password.matches("[a-zA-Z0-9]+") {
        return SecurityLevel.WEAK;
        }*/
