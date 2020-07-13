
public class SwapString {

	public static void main(String[] args) {
		String s1="Enviroment";
		String s2="Day";
		
		s1=s1+s2;
	
		s2=s1.substring(0, s1.length()-s2.length());
		System.out.println("s2 is "+s2);
		s1=s1.substring(s2.length());
		System.out.println("s1 is "+s1);
		
		
		String str="World wide web";
		str=str.replace(" ","");
		System.out.println(str);

	}

}
