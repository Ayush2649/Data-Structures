import java.util.*;

public class Length_Of_Last_Word{

    public static int length(String s){
        int end = s.length() - 1;

        while(end >= 0 && s.charAt(end) == ' '){
            end--;
        }

        int start = end;
        while(start >= 0 && s.charAt(start) != ' '){
            start--;
        }

        return end - start;
    }

    public static void main(String[] args){
        System.out.println(length("Hello World"));
    }
}