import java.util.*;
import java.lang.Math;


public class Solution{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int a[] = new int[q];
        int b[] = new int[q];
        int n[] = new int[q];

        for(int k=0; k<q; k++){
            a[k] = sc.nextInt();
            b[k] = sc.nextInt();
            n[k] = sc.nextInt();
            sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        }
        sc.close();

        for(int z=0; z<q; z++){
            int values[] = new int[n[z]];
            int total = a[z] + b[z];
            values[0] = total;

            for(int i=1; i<n[z]; i++){          
                total = total + ((int)Math.pow(2,i) * b[z]);
                values[i] = total;
            }
    
            for(int j=0; j<n[z]; j++){
                System.out.print(values[j] + " ");
            }
            System.out.println();
        }
    }
}