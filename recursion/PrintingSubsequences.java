package recursion;

import java.util.ArrayList;

/*
Subsequence: It a continuous or discontinuous subset of array
             but the order should be same

             //FOR EXAMPLE:
             [3,2,1] is the array
             []
             [3]
             [2]
             [1]
             [3,2]
             [2,1]
             [3,1]
             [3,2,1]
             So for this example there can be 8 subsequences possible

             Therefore, Number of subsequences possible for n elements = 2^n

Algorithm: We will solve this problem using recursion by following take and
           not take element pattern
           We will pick one element and decide whether to take it in the resulting
           array or not and then pass the same process with the smaller input

     ***IMPORTANT***
     For more understanding the algorithm and its working, try practising by
     recursion Tree diagram


 */
public class PrintingSubsequences {
    public static void main(String[] args) {
        int[] arr = new int[]{3,2,1};
        printSubsequences(arr);
    }

    private static void printSubsequences(int[] arr) {
        /*
        We will take 2 parameters extra to print the subsequences
        1. The index element which is used to pick the current element
        2. The result array which is used to print the subsequences
         */
        ArrayList<Integer> result = new ArrayList<>();
        printSubsequencesImpl(arr,0,result);
        result.clear();
        System.out.println("By using method 2");
        printSubsequencesMethod2Impl(arr,0,result);
    }

    private static void printSubsequencesImpl(int[] arr, int index, ArrayList<Integer> result) {
        //Base case:
        if(index >= arr.length){
            printTheList(result);
            return;
        }

        //First taking the element
        result.add(arr[index]);
        //print the subsequences for the smaller input
        printSubsequencesImpl(arr,index+1,result);
        //Now removing the element
        result.remove(Integer.valueOf(arr[index]));
        printSubsequencesImpl(arr,index+1,result);
    }

    /*
    We can first don't pick the element and then apply recursion
    and then pick the element and then send the array into recursion
     */
    private static void printSubsequencesMethod2Impl(int[] arr, int index, ArrayList<Integer> result) {
        //Base case:
        if(index >= arr.length){
            printTheList(result);
            return;
        }

        printSubsequencesImpl(arr,index+1,result);
        //Now removing the element
        result.add(arr[index]);
        printSubsequencesImpl(arr,index+1,result);
    }

    private static void printTheList(ArrayList<Integer> list){
        System.out.print("[");
        for (Integer i:list){
            System.out.print(i + " ");
        }
        System.out.print("]\n");
    }
}
