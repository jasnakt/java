import java.util.Scanner;

public class swap {

	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int q=sc.nextInt();
		System.out.println("enter second number");
		int i=sc.nextInt();
		q=q+i;
		i=q-i;
		q=q-i;
		
		System.out.println("first number q="+q);
		
		System.out.println("second number i="+i);
	}
}

