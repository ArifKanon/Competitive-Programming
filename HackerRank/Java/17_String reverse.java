import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        
        String reverseA = "";
        for(int i=A.length()-1; i>=0; i--){
            reverseA = reverseA + A.charAt(i);
        }
        
        // Check palindrome
        if(A.equals(reverseA))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
