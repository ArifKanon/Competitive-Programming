import java.util.*;

public class Solution{

    private static final Scanner input = new Scanner(System.in);
    public static void main(String args[]){
        

        int n = input.nextInt();
        double d = input.nextDouble();
        input.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String str = input.nextLine();
        input.close();

        System.out.println("String: " + str);
        System.out.println("Double: " + d);
        System.out.println("Int: " + n);

    }
}
