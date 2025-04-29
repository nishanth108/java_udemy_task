package pack_for_palindrome;

public class pali {
	public boolean palindrome(int word) {
		int start = 0;
		String arr = Integer.toString(word);
		char[] array =arr.toCharArray();
		int end = arr.length()-1;
		while (start<=end) {
			if(array[start] != array[end]) {
				return false;
			}
		start++;
		end--;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pali a = new pali();
		boolean b = a.palindrome(121213);
		if(b) {
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}
	}

}
