public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = args[0];
		StringBuilder s1 = new StringBuilder(str);
		
		if(str.equals(s1.reverse().toString())) {
			System.out.println(str + " is a palindrome");
		}
		else {
			try {
				throw new notPalindrome(str);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}

}

class notPalindrome extends Exception{
	String s;
	notPalindrome(String s){
		System.out.println(s + " is not a palindrome");
	}
	public String toString(){
		return "String is not a Palindrome";
	}
}
