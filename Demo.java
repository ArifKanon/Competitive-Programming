import java.util.Scanner;

public class Demo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        scanner.close();

        boolean key = true;
        int len = str1.length();

        if(len == str2.length()){
            str1 = str1.toUpperCase();
            str2 = str2.toUpperCase();
            int[] count1 = new int[91];
            int[] count2 = new int[91];

            for(int i=0; i<len; i++){
                count1[str1.charAt(i)]++;
                count2[str2.charAt(i)]++;
            }

            for(int j=(int)'A'; j<(int)'Z'; j++){
                if(count1[j] != count2[j]){
                    key = false;
                    break;
                }
            }
        }
        else
            key = false;

        System.out.println(key ? "Anagrams" : "Not Anagrams");
    }
}