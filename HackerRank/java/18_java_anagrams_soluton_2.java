import java.util.Map;
import java.util.*;
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String str1, String str2) {
        int len = str1.length();

        // Initial checking for non-anagrams
        if(len != str2.length())
            return false;
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<len; i++){
            char ch = str1.charAt(i);

            if(! map.containsKey(ch)){
                map.put(ch, 1);
            }
            else{
                Integer frequeny = map.get(ch);
                map.put(ch, ++frequeny);
            }
        }

        for(int k=0; k<len; k++){
            char ch2 = str2.charAt(k);

            if(! map.containsKey(ch2))
                return false;

            Integer frequency = map.get(ch2);
            if(frequency == 0)
                return false;
            else{
                map.put(ch2, --frequency);
            }
        }
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
