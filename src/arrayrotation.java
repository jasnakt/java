import java.util.Arrays;

public class arrayrotation {
	public static void main(String[] args) {
		int a[]= {3,5,6,8,7,9,1};
		int temp;
		
		for(int i=3;i>0;i--) {
			temp=a[a.length-1];
			for(int j=a.length-1;j>0;j--) {
				a[j]=a[j-1];
				
				
			}
			a[0]=temp;
			System.out.println(Arrays.toString(a));
		}
		
		
	}

}


