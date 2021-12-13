/*
Print Fibonacci Numbers Till N
Easy  Prev   Next
1. You've to print first n fibonacci numbers.
2. Take as input "n", the count of fibonacci numbers to print.
3. Print first n fibonacci numbers.
Input Format
n
Output Format
0
1
1
2
3
5
8
.. first n fibonaccis
*/

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      // write your code here
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      if(n>=1){
          System.out.println("0");
      }
      if(n>=2){
          System.out.println("1");
      }
      
      int n1=0, n2=1, sum=0;
      
      for(int i=3; i<=n; i++){
          sum = n1 + n2;
          System.out.println(sum);
          n1 = n2;
          n2 = sum;
      }
   }
  }
