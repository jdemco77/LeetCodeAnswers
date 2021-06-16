//add %20 to any spaces in the given string
public class URLify {

	public static void main(String[] args) {
		String str= "Mr john smith   ";
		int n=13;
		System.out.println(urlify(str,n));
	}
	
	
	public static String urlify(String str,int n) {
		char[] arr= new char[n];
		StringBuilder build= new StringBuilder();
		
		for(int i=0;i<n;i++) {
			arr[i]= str.charAt(i);
		}
		
		for(int i =0;i<n;i++) {
			if(arr[i] != ' ') {
				build= build.append( arr[i]);
			}else if (arr[i]== ' ') {
				build.append("%20");
			}
		}
		
		return build.toString();
	}
}
