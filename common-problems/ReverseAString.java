public class ReverseAString {
    
    public static void main(String[] args) {
        
        String str = "Happy coding!";

		/*
		 * Reverse string way 1: using charAt() method
		 */
		System.out.println("Print reverse string using charAt() ===>");
		char ch;
		for (int i = str.length(); i > 0; i--) {
			ch = str.charAt(i-1);
			System.out.print(ch);
		}

		/*
		 * Reverse string way 2: using toCharArray() method
		 */
		System.out.println("\nPrint reverse string using toCharArray() ===>");
		char chArr[] = new char[str.length()];
		chArr = str.toCharArray();
		for (int i = chArr.length; i > 0; i--) {
			System.out.print(chArr[i-1]);
		}

		/*
		 * Reverse string way 3: using StringBuilder
		 */
		System.out.println("\nPrint reverse string using StringBuilder ===>");
		StringBuilder sb = new StringBuilder(str);
		sb.append("Happy learning!");
		System.out.println(sb.reverse());
        
    }
}
