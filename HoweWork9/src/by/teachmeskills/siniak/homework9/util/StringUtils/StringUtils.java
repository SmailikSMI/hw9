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
        for (int j = 0; j < string.length; j++) {
            System.out.print(string[j]);
        }
        System.out.println();
    }

    public static boolean isBank(char[] string) {
        if (string.length == 0) {
            return true;
        }
        char space = 0;
        for (int j = 0; j < string.length; j++) {
            if (string[j] == ' ') {
                space++;
            }
        }
        return space == string.length;
    }

    public static boolean isRussian(char[] string) {
        int i = 0;
        int space = 0;
        for (int j = 0; j < string.length; j++) {
            if (string[j] == ' ') {
                space++;
            }
            if (string[j] > 'А' && string[j] < 'я' || string[j] == ' ') {
                i++;
            }
            if (space == string.length) {
                return false;
            }
            if (i == string.length) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(char[] string, char[] subString) {
        int i = 0;
        char val1 = 0;
        char val2 = 0;
        for (int j = 0; j < string.length; j++) {
            string[j] = val1;
            subString[j] = val2;
            if (val1 == val2) {
                i++;
            }
            if (i == subString.length) {
                return true;
            }
        }
        return false;
    }

    public static int parseInt(char[] string) {
        int digit = 0;
        for (int j = 0; j < string.length; j++) {
            digit += (string[j] - '0') * (int) Math.pow(10, string.length - j - 1);
        }
        return digit;
    }
}





