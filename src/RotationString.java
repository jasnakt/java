
public class RotationString {
	
	public static void main(String args[]) {
		
		String s1="informationtechnology";
		String s2 ="chnologyinformationtedf";
		
		String s3=s1+s1;
		//System.out.println(s3);
		
		if(s3.contains(s2)) {
			System.out.println("Its a rotated string");
		}
		else {
			System.out.println("its not a rotated string");
		}
	}

}
