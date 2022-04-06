/** Software program that finds all palindrome perfect squares
  * between two integers supplied as input 
  * (start and end points are excluded).
  *
  * @author:   Songeziwe Soboois
  * @date:     April 05, 2022
  * @modified: April 05, 2022
  */
  
 import java.util.Scanner;
 
 public final class  PalinPerfect {
 
   private static boolean isPalindrome(String value) {
      int indexTracker = value.length() - 1;
      
      if(indexTracker + 1 <= 1) {
         return true;
      }
      
      for(int i = 0; i < indexTracker + 1; i++, indexTracker--) {
         if(value.charAt(i) == value.charAt(indexTracker)) {
            continue;
         }
         return false;   
      }
      return true;
   }
   
   private static void findPalinPerfect(String start, int end) {
      start++;
      
      for(; Integer.parseInt(start) < end; start++) {
         int temp = Integer.parseInt(start);
         if(Math.sqrt(temp)) {
         
         }
      }
   }
   
   public static void main(String[] args) {
      System.out.println(isPalindrome("373"));
   }
 }