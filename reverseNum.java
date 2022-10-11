import java.util.*;
import java.io.*;
public class reverseNum
{
    public static void main(String[] args) {
        System.out.println(reverse_digit(456));
    }
    public static long reverse_digit(long n)
    {
        String string_number = Integer.toString((int)n);
        // Traversing through the string using for loop
        String str = "";
        for (int i =string_number.length()-1; i>=0  ; i--) {

         str+= (string_number.charAt(i));



        }
        return Long.parseLong(str);
    }
}
