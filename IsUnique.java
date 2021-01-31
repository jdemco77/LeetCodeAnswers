import java.util.concurrent.TimeUnit;


//time complexity O(n(n-1)/2) or O(n^2)
//space complexity is  O(1)

public class IsUnique {

    public static boolean isUnique(String word){
        boolean unique = true;
        int len=word.length();

        for(int k=0;k<len;k++){
            for(int j=k+1;j<len;j++){
                if(word.charAt(k) == word.charAt(j)){
                    unique=false;
                }
            }
        }
        return unique;
    }
    
    
    
    //time complexity is O(n)
    //space complexity is  O(1)
    
    public static boolean isUnique2(String str){
        if (str.length() >128) return false;

        boolean[] checked = new boolean[128];
        for(int i=0;i<str.length();i++){
            int val= str.charAt(i);
            if(checked[val]){               //if char in arr
                return false;
            }
            checked[val]=true;
        }
        return true;
    }

    //main 
    
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println(isUnique("abcdefghijklmnopqrstuvwxy1234567890!@#$%^&*()0"));
        long t22 = System.nanoTime();

        long t1 = System.nanoTime();
        System.out.println(isUnique2("abcdefghijklmnopqrstuvwxy1234567890!@#$%^&*()0"));
        long t2 = System.nanoTime();

        System.out.print(t22-t2);
    }
}
