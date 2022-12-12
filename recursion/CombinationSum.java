package recursion;

import java.util.ArrayList;

/*
This is the leetcode problem Combination Sum - 1
Problem: [2,3,6,7]  target = 7
Print the possible combinations which sum to given target
The elements can be repeated unlimited times

Solution: Whenever combination or subsequence is to be formed
          We will always follow pick and not pick pattern

          We can pick an element unlimited times so will apply recursion in
          such a way that the same element gets picked up again
          But there can be a combination which may not require that particular
          element, we will also apply recursion for not picking the element

 */
public class CombinationSum {

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,6,7};
        int target = 7;
        int index = 0;
        ArrayList<Integer> result = new ArrayList<>();
        printCombinationForGivenSum(arr,index,result,target);
    }

    private static void printCombinationForGivenSum(int[] arr, int index, ArrayList<Integer> result, int target) {

        //Base case:
        if(index >= arr.length){
            if(target == 0){
                printTheList(result);
                return;
            }
            return;
        }
        if(arr[index] <= target){
            //pick the same index
            result.add(arr[index]);
            printCombinationForGivenSum(arr, index, result, target-arr[index]);

            //not picking, for not picking we have to remove the element which we picked
            result.remove(Integer.valueOf(arr[index]));
            printCombinationForGivenSum(arr,index+1,result,target);
        }
        else{
            //if we can not pick then move to other index
            printCombinationForGivenSum(arr, index+1, result, target);
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
