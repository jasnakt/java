import java.util.StringTokenizer;

public class StrngToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer str=new StringTokenizer("Jasna:Jithin:Jason",":");
		
		while(str.hasMoreTokens()) {
			System.out.println(str.nextToken());
		}

	
	
	String s="Apple,Orange,Pineapple";
	String[] str2=s.split(",");
	
	for(String string:str2) {
		
		System.out.println(string);
	}
		
		
	}

}
