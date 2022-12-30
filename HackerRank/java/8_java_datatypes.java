import java.util.*;
import java.io.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for(int i=0; i<testCase; i++){
            try{
                long value = sc.nextLong();
                System.out.println(value + " can be fitted in:");

                if(value >= -128 && value <= 127)
                    System.out.println("* byte");
                if(value >= -32768 && value <= 32767)
                    System.out.println("* short");
                if(value >= -2147483648 && value <= 2147483647)
                    System.out.println("* int");
                if(value >= -9223372036854775808L && value <= 9223372036854775807L)
                    System.out.println("* long");
            }
            catch(Exception E){
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }
}

