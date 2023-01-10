public class CheckVowelInString {
    
    /*
     * Check vowel is present in String way 1: using regular expression
     */
    private static boolean checkVowelIsPresent(String str) {
        return str.toLowerCase().matches(".*[aeiou].*");
    }

    /*
     * Check vowel is present in String way 2: character checking 1 by 1
     */
    // private static boolean checkVowelIsPresent(String str) {
    //     for(int i = 0; i < str.length(); i++) {   
    //         char letter = Character.toLowerCase(str.charAt(i));
    //         if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')
    //             return true;  
    //     }
    //     return false;
    // }

    public static void main(String args[]) {        
        String str = "Happy Coding";
        System.out.println(checkVowelIsPresent(str) ? "Vowel is present" : "Vowel is not present");
    }
}
