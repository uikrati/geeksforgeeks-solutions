import java.sql.SQLOutput;
import java.util.*;
import java.io.*;

public class palindrome {
    public static void main(String[] args) {
        System.out.println(kthDigit(25,2,3));
    }
    static long kthDigit(int A,int B,int K){
        int power=(int)Math.pow(A,B);
        int count=0;
        while(count<K&&power>0){
            int reminder=power%10;
            count++;
            if(count==K){
                return reminder;
            }
            power/=10;
        }
        return power;

    }
}
