/*
Digits Of A Number
Easy  Prev   Next
1. You've to display the digits of a number.
2. Take as input "n", the number for which digits have to be displayed.
3. Print the digits of the number line-wise.
Input Format
"n" where n is any integer.
Output Format
d1
d2
d3
... digits of the number
*/

import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here  
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int power = 1;
    int temp = n;
    
    while (temp >= 10) {
      temp /= 10;
      power *= 10;
    }
    
    temp = n;
    
    while (power != 0) {
      int digit = temp / power;
      System.out.println(digit);

      temp = temp % power;
      power = power / 10;
    }
    
  }
}
