package testing;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repeat {

	public static void main(String[] args) {
		String str="Java Json Java Eclipse Java Maven Java Jenkins";
		String[] s=str.split(" ");
		String key="";
		String value="";
		
		HashMap<String,Integer> hm=new HashMap<>();
		
		for(String sr:s) {
			
			if(!hm.containsKey(sr)) {
				hm.put(sr, 1);
			}
			
			else {
				hm.put(sr,hm.get(sr)+1);
			}
		}
		
		/*Set<Entry<String,Integer>> entryset=hm.entrySet();
		
		for(Map.Entry<String, Integer> entry:entryset) {
		if(entry.getValue()>1) {
			System.out.println("the repeated chararcter is "+entry.getKey() +""+  entry.getValue()+" times");
		}*/
		
	Set<String> set=hm.keySet();
	
	for(String keys:set) {
		if(hm.get(keys)>1){
			System.out.println("repeated char is "+keys+" with "+hm.get(keys));
			
		}
		
	
	
	
	}
		
		
				
				

	}

}
