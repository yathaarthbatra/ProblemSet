package recursion;

public class RecursionInto {
    /*
    Recursion: The function calling itself again and again
               until an exit condition or base condition is met

               A function waiting takes memory in stack
               if no base condition is met then the functions will take lot of
               stack space and at some point the compiler will throw stackOverflow

    StackOverflow: When the functions are waiting in memory to finish but can't finish
                   due to insufficient memory available


    Solving Problems using Recursion: Doing some work and then calling the function again and again
    Solving Problems using Backtracking: Calling the function calls and then doing some work coming back
                                         from the function calls
     */

    /*
    Basic problems of Recursion
     */
    public static void main(String[] args) {
        int n = 10;
       print1ToN(n);
       printNTo1(n);
       print1ToNUsingBackTracking(n);
       printNTo1UsingBackTracking(n);
    }

    private static void printNTo1UsingBackTracking(int n) {
        System.out.println("Printing n to 1 using BackTracking -->>>>");
        printNTo1UsingBackTrackingImpl(1,n);
    }

    private static void printNTo1UsingBackTrackingImpl(int i, int n) {
        if(i > n){
            return;
        }
        printNTo1UsingBackTrackingImpl(i+1,n);
        System.out.println(i);
    }

    private static void print1ToNUsingBackTracking(int n) {
        System.out.println("Printing 1 to n using BackTracking -->>>>");
        print1ToNUsingBackTrackingImpl(n,n);
    }

    private static void print1ToNUsingBackTrackingImpl(int i, int n) {
        if(i < 1){
            return;
        }
        print1ToNUsingBackTrackingImpl(i-1,n);
        //Backtracking: Doing work after the function calls
        //going backwards when releasing the function calls
        System.out.println(i);
    }

    private static void printNTo1(int n) {
        System.out.println("Printing n to 1 using Recursion -->>>>");
        printNTo1Impl(n,n);
    }

    private static void printNTo1Impl(int i, int n) {
        if(i < 1){
            return;
        }
        System.out.println(i);
        printNTo1Impl(i-1,n);
    }

    private static void print1ToN(int n) {
        System.out.println("Printing 1 to n using Recursion -->>>>");
        print1ToNImpl(1,n);
    }


    //incrementing i step by step until i becomes more than n
    private static void print1ToNImpl(int i, int n){
        if(i > n){
            return;
        }
        System.out.println(i);
        print1ToNImpl(i+1,n);
    }
}
