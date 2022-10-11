import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.io.*;

public class armstrongNumber {
    public static void main(String[] args) {

        System.out.println(armstrongNumber(100));

    }
    static String armstrongNumber(int n){

        int count=0;
        String string_number = Integer.toString(n);
        for(int i=0;i<string_number.length();i++){
            int num= Integer.valueOf((string_number.charAt(i)));
            int cube= (int)Math.pow(num,3);
            count+=cube;
        }

        return (count == n) ? "Yes" : "No";
    }
}
