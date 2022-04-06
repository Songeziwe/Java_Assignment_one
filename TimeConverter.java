/** A class model to convert time from 12 hour-clock
  * to 24 hour-clock and vice versa.
  *
  * @author:   Songeziwe Soboois
  * @date:     April 05, 2022
  * @modified: April 05, 2022
  */
 
 import java.util.Scanner;
  
 public final class TimeConverter {
 
   // convert from 12 hour-clock to 24 hour-clock.
   private static String convertToTwelve(String inputTime) {
      String result = "";
      
      String hourDigits = inputTime.substring(0, 2);
      int hourInteger = Integer.parseInt(hourDigits);
      
      if(hourInteger > 12) {
         int temp = hourInteger - 12;
         result = "0" + temp + inputTime.substring(2) + " pm";
      } else if (hourInteger < 12 && hourInteger != 0) {
         if(hourInteger >= 10)
            result = inputTime + " am";
         else
            result = "0" + inputTime.substring(1) + " am";
      } else {
         if(hourInteger == 0) {
            result = "12:00 am";
         } else {
            result = "12:00 pm";
         }
      }
      
      return result;
   }
   
   // convert from 24 hour-clock to 12 hour-clock.
   private static String convertToTwentyFour(String inputTime) {
      String result = "";
      
      String hourDigits = inputTime.substring(0,inputTime.indexOf(":"));
      int hourInteger = Integer.parseInt(hourDigits);
      String pmOrAm = inputTime.substring(inputTime.length() - 2);
      
      if(pmOrAm.equals("pm")) {
         if(hourInteger == 12) {
            result = inputTime.substring(0,inputTime.length() - 3);
         } else {
            int temp = hourInteger + 12;
            result = temp + inputTime.substring(inputTime.indexOf(":"), inputTime.length() - 3);
         }
      } else if(pmOrAm.equals("am")) {
            if(hourInteger == 12) {
               result = "00:00";
            } else if(hourDigits.length() == 1) {
               result = "0" + inputTime.substring(0, inputTime.length() - 3);
            } else {
               result = inputTime.substring(0, inputTime.length() - 3);
            }
      }
      return result;
   }
   
   public static void main(String[] args) {
      System.out.println("Enter a time ([h]h:mm [am|pm]):");
      Scanner scanner = new Scanner(System.in);
      String inputTime = scanner.nextLine().trim();
      
      int inputLength = inputTime.length();
      if(inputTime.substring(inputLength - 1).equals("m")) {
         String result = convertToTwentyFour(inputTime);
         System.out.println(result);
      } else {
         String result = convertToTwelve(inputTime);
         System.out.println(result);
      } 
   }
 }