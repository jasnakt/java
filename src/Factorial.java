import java.util.Random;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=3;
		int k=1;
		
		
		for(int i=1;i<=n;i++)
{
	k=k*i;
	System.out.println(k);
}

		
		Random random=new Random();
		int x=random.nextInt(10000);
		System.out.println(x);
	}

}
