import java.io.*;
import java.util.*;

public class Solution{

    //Another Solution
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);

    //     int count = 1;
    //     while(sc.hasNext()){
    //         String str = sc.nextLine();
    //         System.out.println(count + " " + str);
    //         count++;
    //     }
    //     sc.close();
    // }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> str = new ArrayList<String>();

        while(sc.hasNext()){
            str.add(sc.nextLine());
        }
        sc.close();

        int count = 1;
        for (String items : str) {
            System.out.println(count + " " + items);
            count++;
        }
    }
}