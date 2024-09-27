public class findDuplicateChar {
   public static void main(String argu[]) {
      String str = "beautiful sea";
      char[] carray = str.toCharArray();
      System.out.println("The string is: " + str);
      System.out.print("Duplicate Characters in above string are: ");
	  // nested for loop to print duplicate characters
      for (int i = 0; i < str.length(); i++) {
         for (int j = i + 1; j < str.length(); j++) {
            if (carray[i] == carray[j]) {
               System.out.print(carray[j] + " ");
               break;
            }
         }
      }
   }
}

=============================================***************************************************************=========================================================================
	public class NoOfCharOccurance
{
    
public static void main(String args[]) {
    char Char;
    int count;
    String a = "Mohan";
    a = a.toLowerCase();
    for (Char = 'a'; Char <= 'z'; Char++) {
        count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == Char) {
                count++;
            }
        }
        System.out.println("Number of occurences of " + Char + " is " + count);
    }
    
    
}
}
===============================================================================================================================================================
	import java.util.*;
public class PrintUniqueElement
{
public static void main(String []args) {
     int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};

     for (int i = 0; i < my_array.length; i++) {
     boolean dup = false;
     for (int j = 0; j < my_array.length; j++) {
        if (i != j && my_array[i] == my_array[j]) {
            dup = true;
            break;
        }
    }
    if (! dup) {
        System.out.println(my_array[i]);
    }
}
}
}
