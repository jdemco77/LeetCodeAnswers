//check if two strings are permutations of eachother
public class StringPermutations {

	public static void main(String[] args) {
		String str1= "Hello";
		String str2="oellh";
		System.out.println(Permutation(str1, str2));
		
	}
	
	
	public static boolean Permutation(String str1,String str2) {
	
		int[] chars= new int[26];
		Boolean bool=true;
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		
		if(str1.length() != str2.length()) {
			return false;
		}
		
		
		for(int i=0;i<str1.length();i++) {
			int val=str1.charAt(i)-97;
			int val2=str2.charAt(i)-97;
			chars[val]++;
			chars[val2]--;
		}//end for loop1
	
		for(int i=0;i<chars.length;i++) {
			if(chars[i]!= 0) {
				bool=false;
			}
		}
		
		
		return bool;
	}
	
	
}
