
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0;
int b=1;
System.out.println(a);
System.out.println(b);
int c=0;

for(int i=2;i<=10;i++) {
	
	c=a+b;
	System.out.println(c);
	a=b;
	b=c;
	
}
	}

}
