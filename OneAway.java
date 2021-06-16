//strings have three primary methods:add delete swap
//create a method to check if two strings are one method away from the other

public class OneAway {

	public static void main(String[] args) {
		String str1="hey";					//str1-1 ==str2
		String str2="he";					//diff= 1
		System.out.println(oneAway(str1,str2));
		
		String str3="hey";					//str1+1=str2
		String str4="heys";					//diff=1
		System.out.println(oneAway(str3,str4));
		
		String str5="hey";					//str1==str2
		String str6="hes";					//diff=2
		System.out.println(oneAway(str5,str6));
			
	}
	public static boolean oneAway(String str1,String str2) {

		boolean bool1=oneless(str1,str2);
		boolean bool2=oneMore(str1,str2);
		boolean bool3=oneSwitched(str1,str2);
		
		if(bool1==true||bool2==true||bool3==true) {
			return true;
		}
		return false;
}//end method
	
	public static boolean oneless(String str1,String str2) {
		int same=0;
		
		int[] chars= new int[26];
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		for(int i =0;i<str1.length();i++) {
			int val=str1.charAt(i)-97;
			chars[val]++;
		}
		
		if(str1.length()-1==str2.length()) {
			for(int x=0;x<str2.length();x++) {
				int value=str2.charAt(x)-97;
				chars[value]--;
			}
		}
		
		for(int z=0;z<26;z++) {
			if(chars[z]!=0) {
				same++;
			}
			
		}
		
		if(same==1) {
			return true;
		}
		return false;
	}//end oneLess
	
	

	public static boolean oneMore(String str1,String str2) {
		int diff=0;
		
		int[] chars= new int[26];
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		for(int i =0;i<str1.length();i++) {
			int val=str1.charAt(i)-97;
			chars[val]++;
		}
		
		if(str1.length()+1==str2.length()) {
			for(int x=0;x<str2.length();x++) {
				int value=str2.charAt(x)-97;
				chars[value]--;
			}
		}
		
		for(int z=0;z<26;z++) {
			if(chars[z]!=0) {
				diff++;
			}	
		}
		if(diff==1) {
			return true;
		}
		return false;
	}//end oneLess
	
	

	public static boolean oneSwitched(String str1,String str2) {
		int diff=0;
		
		int[] chars= new int[26];
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		for(int i =0;i<str1.length();i++) {
			int val=str1.charAt(i)-97;
			chars[val]++;
		}
		
		if(str1.length()==str2.length()) {
			for(int x=0;x<str2.length();x++) {
				int value=str2.charAt(x)-97;
				chars[value]--;
			}
		}
		
		for(int z=0;z<26;z++) {
			if(chars[z]!=0) {
				diff++;
			}
		}
		
		if(diff==2) {
			return true;
		}
		return false;
	}//end oneLess
	
	

}//end main
