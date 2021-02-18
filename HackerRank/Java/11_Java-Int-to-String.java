import java.util.*;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int num = sc.nextInt();

            String str = Integer.toString(num);
            // String str = String.valueOf(num);
            // String str = "" + num;
            
            if(str.getClass().getTypeName() == "java.lang.String"){
                System.out.println("Good job");
            }
            else
                System.out.println("Wrong answer");
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
        
    }
}