package recursion;
/*
Problem: Print the subsequences of given sum K of the given array
Input: [3,2,1]
k = 3
Output: [3]
        [2,1]

Algorithm: It will be same as that of printing all subsequences of the array
           For this, either i have to maintain a sum variable or
           we whenever we get to base case we can sum the result array element to
           check

        In this solution, i am using sum variable
 */


import java.util.ArrayList;

public class PrintingSubsequencesOfSumK {

    public static void main(String[] args) {
        int[] arr = new int[]{3,2,1};
        int k = 3;
        ArrayList<Integer> result = new ArrayList<>();
        printSubsImplForSumK(arr,0,result,k,0);
        System.out.println("Print only one subsequence for the given sum");
        printOnlyOneSubsequenceOfSumK(arr,0,result,k,0);
    }

    private static void printSubsImplForSumK(int[] arr,int index, ArrayList<Integer> result, int k, int sum) {

        //Base case:
        if(index >= arr.length){
            if(sum == k){
                printTheList(result);
                return;
            }
            return;
        }

        result.add(arr[index]);
        sum += arr[index];
        printSubsImplForSumK(arr, index+1, result, k, sum);
        result.remove(Integer.valueOf(arr[index]));
        sum -= arr[index];
        printSubsImplForSumK(arr, index+1, result, k, sum);
    }

    private static boolean printOnlyOneSubsequenceOfSumK(int[] arr, int index, ArrayList<Integer> result, int k, int sum){
        //Base case:
        if(index >= arr.length){
            if(sum == k){
                printTheList(result);
                return true;
            }
            return false;
        }

        //Take perform
        result.add(arr[index]);
        sum += arr[index];
        if(printOnlyOneSubsequenceOfSumK(arr, index + 1, result, k, sum)){
            return true;
        }
        else{
            result.remove(Integer.valueOf(arr[index]));
            sum -= arr[index];
            return printOnlyOneSubsequenceOfSumK(arr, index+1, result, k, sum);
        }
    }


    private static void printTheList(ArrayList<Integer> list){
        System.out.print("[");
        for (Integer i:list){
            System.out.print(i + " ");
        }
        System.out.print("]\n");
    }
}
