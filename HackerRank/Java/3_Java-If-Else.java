import java.util.*;

public class Solution{

    private static final Scanner input = new Scanner(System.in);
    
    public static void main(String args[]){
        int n = input.nextInt();
        input.close();

        if(n%2 != 0)
            System.out.println("Weird");
        
        else{
            if(n <= 5)
                System.out.println("Not Weird");
            else if(n>5 && n<= 20)
                System.out.println("Weird");
            else
                System.out.println("Not Weird");
        }
    }
}
