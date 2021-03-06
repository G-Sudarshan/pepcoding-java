/*
Prime Factorization Of A Number
Easy  Prev   Next
1. You are required to display the prime factorization of a number.
    2. Take as input a number n.
    3. Print all its prime factors from smallest to largest.
                               
Input Format
n, an integer
Output Format
p1  p2  p3  p4.. all prime factors of n
*/

import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
  Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
  
  for(int div=2; div*div <= n; div++){
      while(n%div==0){
          n = n / div;
          System.out.print(div+" ");
      }
  }
  
  if(n!=1){
      System.out.print(n);
  }
 }
}
