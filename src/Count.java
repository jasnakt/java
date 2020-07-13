import java.util.HashMap;
import java.util.Set;

public class Count {

	public static void main(String[] args) {
		
		HashMap<Character,Integer> hm=new HashMap<>();
		
		String s="Cooker Cooking";
		
		char[] ch=s.toCharArray();
		
		for(Character c:ch) {
			
			if(!hm.containsKey(c))
			{
				hm.put(c, 1);
			}
			
		else if (hm.containsKey(c)){
				hm.put(c, hm.get(c)+1);
			}
		}
		
		
		Set<Character> set=hm.keySet();
		
		for(Character key:set) {
			System.out.println(key+" count is : "+hm.get(key));
		}
		
		
		
	}

}
