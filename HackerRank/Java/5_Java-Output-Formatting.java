import java.util.*;

public class Solution{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[3];

        for(int i=0;i<3;i++)
        {
            String str=sc.next();
            int num=sc.nextInt();
            sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            //String length 15
            String newStr = String.format("%-"+ 15 + "s", str);
            String newNum = String.format("%03d", num);

            arr[i] = newStr + newNum;
        }

        System.out.println("================================");
        for(int i=0; i<3; i++){
            System.out.println(arr[i]);
        }
        System.out.println("================================");

    }
}
