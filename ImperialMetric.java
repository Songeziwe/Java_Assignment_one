/** Software program to display a conversion
  * table for feet and inches to metres.
  *
  * @author:   Songeziwe Soboois
  * @date:     April 05, 2022
  * @modified: April 05, 2022
  */
  
 import java.util.Scanner;
 
 public final class  ImperialMetric {
 
   private static final int INCHES = 11;
   
   private static void displayTable(int min, int max) {
      System.out.printf("%4s", "|");
      
      for(int i = 0; i <= INCHES; i++) {
         System.out.printf("%6s", i + "\"");
      }
      
      System.out.println("");  // take the cursor to the next line.
      double metres = 0;
      
      for(int feet = min; feet <= max; feet++) {
         System.out.printf("%-3s%1s", feet + "'", "|");
         for(int inch = 0; inch <= INCHES; inch++) {
            metres = calculateMetres(feet, inch);
            System.out.printf("%6.3f", metres);
            
         }
         System.out.println(""); // take cursor to the next line.
      }
   }
   
   private static double calculateMetres(int feet, int inches) {
      return ( feet * 12 + inches ) * 0.0254;
   }
   
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int minFeet = 0;
      int maxFeet = 0;
      
      do {
         System.out.println("Enter the minimum number of feet (not less than 0):");
         minFeet = scanner.nextInt();
      } while( minFeet < 0 );
      
      do {
         System.out.println("Enter the maximum number of feet (not more than 30):");
         maxFeet = scanner.nextInt();
      } while( maxFeet > 30 );
      
      displayTable(minFeet, maxFeet);
      
   }
 }