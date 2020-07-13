package testing;

public class StringPalindrome {
	
	public void stringpal(String str) {
		
		String temp=str;
		System.out.println(temp);
		String s="";
		int k=str.length()-1;
		
		for(int i=k;i>=0;i--) {
			System.out.println("555555555555555555");
			s+=str.charAt(i);
			System.out.println(s);
		}
		
		if(temp.equals(s)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not a palindrome");
		}
	}

}
