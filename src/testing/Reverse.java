package testing;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Cat walk in ramp";
		String[] str=s.split(" ");
		String reve="";
		
		
		for(int i=0;i<str.length;i++) {
			String newstr="";
			 
			for(int k=str[i].length()-1;k>=0;k--) {
				newstr+=str[i].charAt(k);
				
				
				
			}
			
			System.out.println(newstr);
			reve=reve+newstr+" ";
		}
		System.out.println(reve);
	}

}
