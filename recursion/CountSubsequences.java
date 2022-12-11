package recursion;
/*
Problem 1: Count the total subsequences of the given array
Problem 2: Count the total subsequences of the given array with the given sum

Algorithm: It will be based on the printing Subsequences algorithm

**IMPORTANT TIP***
Whenever count is asked, return 1 in the base condition of the suitable sum condition or any
other condition is met
if not return 0

--> QUICK TIP: Recursion Tree is your friend, practice it and understanding will be more clear
 */

public class CountSubsequences {

    public static void main(String[] args) {
        int[] arr = new int[]{3,2,1};
        int k = 3;
        int totalCount = getTotalCountOfSubsequences(arr,0);
        int totalCountWithSumK = getTotalCountOfSubsequencesWithSumK(arr,0,k,0);
        System.out.println("Total number of subsequences = "+ totalCount);
        System.out.println("Total number of subsequences with sum k = "+ totalCountWithSumK);
    }

    private static int getTotalCountOfSubsequencesWithSumK(int[] arr, int index, int k, int sum) {

        //Base case:
        if(index >= arr.length){
            if(sum == k){
                return 1;
            }
            else{
                return 0;
            }
        }
        //Take the element
        sum += arr[index];
        int takeCount = getTotalCountOfSubsequencesWithSumK(arr, index+1, k, sum);

        sum -= arr[index];
        //Dont take the element
        int dontTakeCount = getTotalCountOfSubsequencesWithSumK(arr, index+1, k, sum);
        return takeCount + dontTakeCount;
    }

    private static int getTotalCountOfSubsequences(int[] arr, int index) {

        //Base case:
        if(index >= arr.length){
            return 1;
        }
        int count1 = getTotalCountOfSubsequences(arr,index+1);
        int count2 = getTotalCountOfSubsequences(arr,index+1);
        return count1 + count2;
    }
}
