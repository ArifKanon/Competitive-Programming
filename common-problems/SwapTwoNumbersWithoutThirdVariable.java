public class SwapTwoNumbersWithoutThirdVariable {
    
    public static void main(String[] args) {
        
        int a = 5;
        int b = 9;

        System.out.println("a=" + a + " b=" + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swaping, a=" + a + " b=" + b);

    }
}
