public class Solution2 {

  public static void main(String[] args) {
    /** Write a Java code to print the all powers of 3 between 1 and 1000 using for loop. */

    for (int m = 1; m < 15; m++) {
      int powers = (int) Math.pow(3, m);
      if (powers > 1 && powers < 1000) System.out.print(powers + " ");
    }
  }
}
