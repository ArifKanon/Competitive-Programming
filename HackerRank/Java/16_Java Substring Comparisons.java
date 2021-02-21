import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {

        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        
        for(int i=1; i<=s.length() - k; i++){
            String val = s.substring(i, i+k);
            
            if(smallest.compareTo(val) >= 0)
                smallest = val;
            if(largest.compareTo(val) <= 0)
                largest = val;
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}