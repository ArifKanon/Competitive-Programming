public class CheckVowelInString {
    
    private static boolean checkVowelIsPresent(String str) {

        for(int i = 0; i < str.length(); i++) {   
            char letter = Character.toLowerCase(str.charAt(i));
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')
                return true;  
        }

        return false;
    }

    public static void main(String args[]) {        
        String str = "Happy Coding";
        System.out.println(checkVowelIsPresent(str) ? "Vowel is present" : "Vowel is not present");
    }
}
