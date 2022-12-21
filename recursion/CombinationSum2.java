package recursion;

import java.util.ArrayList;
import java.util.List;

/*
Problem: It is the extension of the Combination Sum 1
we have to find the unique combinations for the target sum
but one element can be used only once unlike Combination Sum 1

SOLUTION/ALGO: We can here use again keep and not keep condition
keeping and not keeping each element and then traversing the array
But we will make sure to increase the index by 1, so that one element can be used at a time

 */
public class CombinationSum2 {
    public static void main(String[] args) {
        int[] arr = new int[]{10,1,2,7,6,5};
        int target = 8;
        List<Integer> resultList = new ArrayList<>();
        List<List<Integer>> finalResultList = new ArrayList<>();
        combinationSum2Impl(arr,0,target,resultList,finalResultList);
        System.out.println("********************************");
        for (List<Integer> list : finalResultList) {
            for (Integer integer : list) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }

    }

    private static void combinationSum2Impl(int[] arr, int index, int target, List<Integer> resultList, List<List<Integer>> finalResultList) {

        //Base case:
        if(index >= arr.length){
            if(target == 0){
                //printing the list
                for (Integer integer : resultList) {
                    System.out.print(integer + " ");
                }
                System.out.println();
                List<Integer> sampleList = new ArrayList<>(resultList);
                finalResultList.add(sampleList);
                return;
            }
            return;
        }

        if(arr[index] <= target){
            //picking the element
            resultList.add(arr[index]);
            combinationSum2Impl(arr, index+1, target-arr[index], resultList, finalResultList);
            resultList.remove(Integer.valueOf(arr[index]));
            combinationSum2Impl(arr, index+1, target, resultList, finalResultList);
        }
        else{
            combinationSum2Impl(arr, index+1, target, resultList, finalResultList);
        }
    }
}
