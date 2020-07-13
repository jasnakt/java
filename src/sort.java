import java.util.Scanner;

public class sort {

	public static void main(String[] args) {
int a[]= {15,10,8,7,9,1,21,32,6};
int temp=0;
for(int i=0;i<a.length;i++) {
	
	for(int j=i+1;j<a.length;j++) {
		if(a[i]>a[j])
		{
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
	
		}
		
	}
	System.out.println("---------+-------"+a[i]);
}

	}

}
