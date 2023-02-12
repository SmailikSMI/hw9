package by.teachmeskills.siniak.homework9.util.StringUtils;

public class StringUtils {

    public static void print(char[] string) {
        System.out.print("Your string: ");
        for (int j = 0; j < string.length; j++) {
            System.out.print(string[j]);
        }
    }

    public static void println(char[] string) {
        System.out.print("Your string: ");
        print(string);
        System.out.println();
    }

    public static boolean isBank(char[] string) {
        for (int j = 0; j < string.length; j++) {
            if (!Character.isWhitespace(string[j])) {
                return false;
            }
        }
        return true;
    }

    public static boolean isRussian(char[] string) {
        for (int j = 0; j < string.length; j++) {
            char ch=string[j];
            if (!((ch =='А' & ch == 'я')|| ch == 'ё' || ch == 'Ë')) {
                return false;
            }
        }
        return false;
    }

    public static boolean contains(char[] string, char[] subString) {

        for (int i = 0; i <= string.length - subString.length; i++) {
            boolean equal = true;
            for (int j = 0; j < subString.length; j++) {
                if (string[i + j] != subString[j]) {
                    equal = false;
                }
            }
            if (equal) return true;
        }
        return false;
    }

    public static int parseInt(char[] string) {
        int numbers = 0;
        for (int j = 0; j < string.length; j++) {
            int digit=(string[j] - '0');
            numbers += digit * (int) Math.pow(10, string.length - j - 1);
        }
        return numbers;
    }
}





