package testing;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		
		boolean flag=false;
		
		for(int i=2;i<k/2;i++) {
			if(k%i==0) {
				flag=true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("the number is prime");
		}
		else {
			System.out.println("the number is not prime");
		}

	}

}
