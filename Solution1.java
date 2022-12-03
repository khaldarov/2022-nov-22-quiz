import java.util.*;

public class Solution1 {

  public static void main(String[] args) {
    /** You are supposed to write a java “switch” statement to print “Good Morning” if value entered by user is 8, 9, 10 or 11;
     * “It is Noon” if value is 12; “Good Afternoon” if value is 13, 14, 15, 16; “Good Evening” if 17, 18, 19; “Good Night” otherwise. */

    System.out.println("What time is it?");
    Scanner input = new Scanner(System.in);
    int hour = input.nextInt();

    switch (hour) {
      case 8:
      case 9:
      case 10:
      case 11:
        System.out.println("Good Morning");
        break;
      case 12:
        System.out.println("It is Noon");
        break;
      case 13:
      case 14:
      case 15:
      case 16:
        System.out.println("Good Afternoon");
        break;
      case 17:
      case 18:
      case 19:
        System.out.println("Good Evening");
        break;
      default:
        System.out.println("Good Night");
        break;
    }
    input.close();
  }
}
