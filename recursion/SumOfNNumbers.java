package recursion;

/*
calculate the sum of 1st n numbers using Recursion
 */

/*
There are two types of recursion or basically patters
1. Functional recursion in which function returns a value
2. Paramterised recurison in which result is transfered to arguments
 */
public class SumOfNNumbers {

    private static void printSumOfNNumbers(int n){
        printSumOfNNumbersImpl(n,0,0);
    }

    private static void printSumOfNNumbersImpl(int n,int i,int sum) {
        if(i > n){
            System.out.println(sum);
            return;
        }
        printSumOfNNumbersImpl(n,i+1,sum + i);
    }

    private static int findSumOfNNumbers(int n){
        if(n == 0){
            return 0;
        }
        return n + findSumOfNNumbers(n-1);
    }
    public static void main(String[] args) {
        printSumOfNNumbers(5); // 1 2 3 4 5 => 15
        int sum = findSumOfNNumbers(5);
        System.out.println("Sum using Returning function = "+ sum);
    }
}
