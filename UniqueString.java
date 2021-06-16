//check if a string has all unique  charecters

public class UniqueString {

	public static void main(String[] args) {
		String str="Cars";//true
		String str2="hello";//false
		String str3="whatsupS";//false
		System.out.println(isUnique(str));
		System.out.println(isUnique(str2));
		System.out.println(isUnique(str3));
	}
	
	
	public static boolean isUnique(String str) {
	int[] characters= new int[26];
	str=str.toLowerCase();
	Boolean bool=true;
	
	for(int i=0;i<str.length();i++) {
		int val=str.charAt(i)-97;		//a in ascii starts at 97
		characters[val]++;
	}//end for loop1
	
	for(int i=0;i<characters.length;i++) {
		if(characters[i]>1) {			//found more than one of the same character
			return false;
		}	
	}//end for loop 2
	
	return bool;
	
	}//end method
}
