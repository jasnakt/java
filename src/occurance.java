
public class occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String occ="T";
				String str="Automation Tester";
				String str1=str.toUpperCase();
				int before_length=str.length();
				System.out.println("before_length"+before_length);
				String str2=str1.replace(occ, "");
				int after_length=str2.length();
				System.out.println("after_length"+after_length);
				

	}

}
