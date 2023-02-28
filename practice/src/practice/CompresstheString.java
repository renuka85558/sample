package practice;

import java.util.HashMap;

public class CompresstheString {

	public static void main(String[] args) {
		String str="aaaaaaakkkkkkkkyyyyyyyzzzz";
		String charcount=returnCount(str);
		
System.out.println("string char count :"+charcount);
	}
	public static String returnCount(String values) {
		HashMap<Character,Integer> getHash = new HashMap<Character,Integer>();
		StringBuilder sb = new StringBuilder();
		// char[] charsInString = values.toCharArray();
		for(char characters : values.toCharArray()){
		if(!(getHash.containsKey(characters))){
		getHash.put(characters,1);
		}
		else
		getHash.put(characters,getHash.get(characters) + 1);
		}
		// for()
		for(char keys : getHash.keySet()){
		sb.append(keys);
		sb.append(getHash.get(keys));
		}

		System.out.println(getHash);

		return sb.toString();
		}
}
