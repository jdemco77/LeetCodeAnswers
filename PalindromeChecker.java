
public class PalindromeChecker {
	  public static void main(String[] args) {
	        
	        String A="";
	        
	        String s = palindrome(A);
	        System.out.println(s);
	    }
	    public static String palindrome(String str){
	        
	        int k = str.length()-1;
	        int i =0;
	        while(i<k){
	            if(str.charAt(i) != str.charAt(k)){
	                return "No";
	            }
	            i++;
	            k--;
	        }
	        return "Yes";
	    }
	    
	}

