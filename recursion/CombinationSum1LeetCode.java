package recursion;

import java.util.ArrayList;
import java.util.List;

/*
It is the problem and solution of the leetcode problem combination sum - 1
 */
public class CombinationSum1LeetCode {
    public static void main(String[] args) {
        int[] candidates = new int[]{2,3,6,7};
        List<List<Integer>> finalResult = combinationSum(candidates,7);
        for (int i = 0 ; i < finalResult.size();i++){
            List<Integer> list = finalResult.get(i);
            for (int j = 0; j < list.size(); j++){
                System.out.print(list.get(j) + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> finalList = new ArrayList<>();
        List<Integer> resultList = new ArrayList<>();
        combinationSumImpl(candidates,0,target,resultList,finalList);
        return finalList;
    }

    public static void combinationSumImpl(int[] candidates,int index,int target,List<Integer> result,
                                          List<List<Integer>> finalList){

        //Base case:
        if(index >= candidates.length){
            if(target == 0){
                List<Integer> sampleList = new ArrayList<>(result);
                finalList.add(sampleList);
                return;
            }
            return;
        }

        //we can pick one element as many times as possible
        //picking arr[index]
        if(candidates[index] <= target){
            result.add(candidates[index]);
            combinationSumImpl(candidates, index, target-candidates[index], result, finalList);
            result.remove(Integer.valueOf(candidates[index]));
            combinationSumImpl(candidates, index+1, target, result, finalList);
        }
        else{
            combinationSumImpl(candidates,index+1,target,result,finalList);
        }
    }
}
