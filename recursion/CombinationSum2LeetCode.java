package recursion;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Input: [2,5,2,1,2], target = 5
Output: [[1,2,2],[5]]

Algorithm: Main catch of this problem is to avoid duplicate combinations
One Observation: When we will have duplicates in the input, we will get duplicate subsequences or combinations

To avoid duplicates, we will use loop in between to avoid picking the element again
Rest Solution is just generating the subsequences with the target sum

To make loop logic work we have to make the list sorted
 */
public class CombinationSum2LeetCode {

    public static void main(String[] args) {
        int[] candidates = new int[]{2,5,2,1,2};
        //sorting the array
        Arrays.sort(candidates);
        List<List<Integer>> finalResult = combinationSum2(candidates,5);
        for (int i = 0 ; i < finalResult.size();i++){
            List<Integer> list = finalResult.get(i);
            for (int j = 0; j < list.size(); j++){
                System.out.print(list.get(j) + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> finalList = new ArrayList<>();
        List<Integer> resultList = new ArrayList<>();
        combinationSum2Impl(candidates,target,0,resultList,finalList);
        return finalList;
    }

    private static void combinationSum2Impl(int[] candidates,int target,int index,List<Integer> resultList,List<List<Integer>> finalList){

        //Base case:
        if(index == candidates.length){
            if(target == 0){
                finalList.add(new ArrayList<>(resultList));
                return;
            }
            return;
        }

        if(candidates[index] <= target){
            resultList.add(candidates[index]);
            combinationSum2Impl(candidates,target-candidates[index],index+1,resultList,finalList);
            resultList.remove(Integer.valueOf(candidates[index]));
            //to avoid the repitions, skipping the same elements
            while (index < candidates.length - 1){
                if(candidates[index] == candidates[index+1]){
                    index++;
                }
                else{
                    break;
                }
            }
        }
        //not pick
        combinationSum2Impl(candidates, target, index+1, resultList, finalList);
    }
}
