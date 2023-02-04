package by.teachmeskills.siniak.homework9.util.StringUtils;

public class StringUtils {

    public static void print (char[] string){
        System.out.print(string);

    }
    public static void println (char[] string){
        System.out.println(string);

    }

    public static boolean isBank (char[] string){
        if(string.length==0){
            return false;
        }
        char Blank=0;
        for (int j=0;j<string.length;j++) {
            System.out.println("Loop");
            if (string[j]==' '){
                string[j]+=Blank;
                System.out.println(Blank);
            }

        }
        return true;
    }



}
