/*
Print All Primes Till N
Easy  Prev   Next
1. You've to print all prime numbers between a range. 
2. Take as input "low", the lower limit of range.
3. Take as input "high", the higher limit of range.
4. For the range print all the primes numbers between low and high (both included).
Input Format
low 
high
Output Format
n1
n2
.. all primes between low and high (both included)
*/


public class Main{
    public static void main(String[] args) {
        // write your code here
         Scanner scn = new Scanner(System.in);
  
       // write ur code here
       int low = scn.nextInt();
       int high = scn.nextInt();
       boolean isPrime = true;
       for(int i=low; i<=high; i++){
            if(i==2){
                System.out.println(i);
                continue;
            }
            if(i%2==0){
                continue;
            }
           isPrime = true;
           for(int j=2; j<= Math.round(Math.sqrt(i)) ; j++){
               if(i%j==0){
                   isPrime = false;
                   break;
               }
           }
           if(isPrime){
               System.out.println(i);
           }
       }
    }
}
