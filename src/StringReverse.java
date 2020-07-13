
public class StringReverse {

	public static void main(String[] args) {
		String f="Flower";
		char[] ch=f.toCharArray();
		String s="";
		
		/*for(int i=ch.length-1;i>=0;i--) {
			s+=ch[i];
			
		}*/
		
		//System.out.println(s);
		
		for(int k=1;k<=f.length();k++) {
			s+=f.charAt(f.length()-k);
			
		}
		
		System.out.println(s);
		
		int j=900108;
		String str=String.valueOf(j);
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		String y=sb.toString();
		int g=Integer.parseInt(y);
		System.out.println(g);


	}

}
