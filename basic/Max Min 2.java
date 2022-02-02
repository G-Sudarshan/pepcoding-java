/*
Max Min 2
Easy

You are given an array A of n unique integers.
You have to find 2nd maximum and 2nd minimum numbers in this array.

If A = [3, 7, -1, 2, 4, 9]

2nd max is 7
2nd min is 2

Constraints
1. 2 <= n <= 100

Format
Input
First line contains single integer n
Second line contains n space seperated integers A[0], A[1], A[2] .... A[n].

Output
print 2nd max then 2nd min is single line

Example
Sample Input

6
3 7 2 -1 4 9

Sample Output
7 2

*/

import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];

    for(int i = 0 ; i < n; i++){
      arr[i] = scn.nextInt();
    }

    Arrays.sort(arr);

    System.out.print(arr[n-2]+" ");
    System.out.print(arr[1]);

  }
}
