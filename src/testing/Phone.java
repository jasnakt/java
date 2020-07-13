package testing;

public class Phone {
	int a=0;
	int b=1;
	int c;
	
	
	public void logic() {
		System.out.println(a+" ,"+b);
	for(int i=2;i<8;i++) {	
		
	c=a+b;
	System.out.println(c);
	a=b;
	b=c;
	}	
	}

	public static void main(String[] args) {
		Phone ph=new Phone();
		System.out.println("Phone");

	}

}
