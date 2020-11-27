package utils;

public class Password {
    public static boolean validate(String password) throws Exception {
        final int MINLENGTH = 8;
        boolean lengthFlag = false;
        boolean numberFlag = false;
        boolean capitalFlag = false;
        boolean lowerCaseFlag = false;
        boolean specialFlag = false;
        boolean spaceFlag = false;

        if (password.length() >= MINLENGTH) {
            lengthFlag = true;
        }
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                numberFlag = true;
            }
            if (Character.isUpperCase(password.charAt(i))) {
                capitalFlag = true;
            }
            if (Character.isLowerCase(password.charAt(i))) {
                lowerCaseFlag = true;
            }
            if (!Character.isDigit(password.charAt(i)) && !Character.isLetter(password.charAt(i)) && !Character.isSpaceChar(password.charAt(i))) {
                specialFlag = true;
            }
            if (Character.isSpaceChar(password.charAt(i))) {
                spaceFlag = true;
            }

        }
        if (lengthFlag && numberFlag && capitalFlag && lowerCaseFlag && specialFlag && !spaceFlag) {
            return true;
        }
        throw new Exception("Must have capital and lower case characters. Must have no spaces and special characters.");

    }
}
