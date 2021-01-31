import java.util.Arrays;
import java.util.concurrent.TimeUnit;


//time complexity O(n)+ O(n(n-1)/2) or O(n^2)

public class checkPermutation
{

    // methods are case sensitive

    public static boolean checkPermutation(String first,String second)
    {
        if(first.length() != second.length() ){  //check strings are same size
            return false;
        }

        int len= first.length();            //record length
        char[] one =new char[len];
        char[] two =new char[len];

        for(int i=0; i<len;i++)
        {                                   //load string characters into array
            one[i] = first.charAt(i);
            two[i] = second.charAt(i);
        }

        for(int i=0;i<len;i++)
        {                                    //hold first array char
            char char1= one[i];

            for(int j=i;j<len;j++)
            {                               //hold second array characters
                char char2 = two[j];

                if(char1==char2)
                {                        //switch position of characters in second array when match found
                    char hold = two[i];
                    two[i]= two[j];
                    two[j]= hold;
                }

            }
        }
        return Arrays.equals(one,two);
    }

    //time complexity is O(n)

    public static boolean checkPermutation2(String one,String two){
        if(one.length() != two.length()){return false;}             //check string sizes for same length

        int[] letters=new int[128];                                 // int[] acts as a mapping for char and associated count
        
        for(int i=0;i<one.length();i++){                            //get count for char set in first string
            letters[one.charAt(i)]++;
        }

        for(int i=0;i<one.length();i++){                            //remove count for char set in second string
            letters[two.charAt(i)]--;
            if(letters[two.charAt(i)]<0){                           //if char count ever turns negative the strings are not equal.
                return false;                                       //since we increment and decrement the same number of times we will either obtain a negative value or zero values
            }
        }
        return true;
    }


    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println(checkPermutation("abcdefghijk","kjihgfedcba"));
        long t22 = System.nanoTime();

        long Time = System.nanoTime();
        System.out.println(checkPermutation2("abcdefghijk","kjihgfedcba"));
        long t21 = System.nanoTime();

        System.out.println(t22);
        System.out.println(t21);
    }
}
