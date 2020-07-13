package testing;

public class NumberPalindrome {
	
	int a=0;
	int sum=0;
	int temp=0;
	
	public void numpali(int k) {
		temp=k;
	while(k>0) {	
		a=k%10;
		System.out.println(a);
		sum=sum*10+a;
		System.out.println(sum);
		k=k/10;
		
	}	
	if(temp==sum) {
		System.out.println("Number is palindrome");
	}else {
		System.out.println("Number is not a palindrome");
	}
	
	}

}
