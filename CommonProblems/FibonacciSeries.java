/**
  Write a simple Java program which will print Fibonacci series, e.g. 1 1 2 3 5 8 13 ... . up to a given number. We prepare for cross questions like using iteration over recursion and how to optimize the solution using caching and memoization.
 */

import java.lang.*;
import java.util.*;

import javax.print.event.PrintEvent;
import javax.sound.sampled.SourceDataLine;


public class FibonacciSeries {

    private static int fibArr[];

    public static int[] addNumber(int limit) {
        int arr[];

        arr = new int[] {0, 1};

        return arr;
    }

    public static void main(String[] args) 
    {
        int[][] twoD = {
                            {1, 2, 3, 4},
                            {7, 8, 9}
                        };

        for (int i=0; i<)

        System.out.println("Length: " + twoD.length + " next: " + twoD[0].length);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter limit of fibonacci: ");
        
        int numberLimit = 0;
        
        try {
            numberLimit = Integer.parseInt(input.nextLine());
        } catch (Exception e) {
            e.printStackTrace();
        }

        fibArr = new int[numberLimit];
        input.close();

        addNumber(numberLimit);
        
        System.out.println("Limit of Fibonacci number is: ");
        for (int i : fibArr) {
            System.out.println(i);
        }
    }
}



// public class FibonacciSeries {
    
//     private static int[] fibArr;
//     private static int key = 1;

//     private static void addNumber(int limit) {
//         int res = fibArr[key] + fibArr[key-1];

//         if (res < limit)
//         {
//             key++;
//             fibArr[key] = res;

//             addNumber(limit);
//         }
        
//     }


//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         int limit = 0;

//         try {
//             limit = Integer.parseInt(input.nextLine());
//         } catch (Exception e) {
//             e.printStackTrace();
//         }

//         input.close();

//         fibArr = new int[limit];
//         fibArr[0] = 0;
//         fibArr[1] = 1;

//         addNumber(limit);

//         System.out.println(fibArr.length);

//         for (int i=0; i<key+1; i++) {
//             System.out.print(fibArr[i] + " ");
//         }
//     }
// }
