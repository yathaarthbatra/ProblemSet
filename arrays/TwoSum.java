package arrays;

import java.util.HashMap;

/*
Algorithm:
if the corresponding element is present in the map, then we got our 2 sum
if not, no issue insert the element and continue traversing the array
 */

public class TwoSum {

    public static void printIndexTwoSum(int sum,int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0 ; i < arr.length ; i++){
            if(map.containsKey(sum - arr[i])){
                System.out.print("Two sum numbers index = "+ i + " " + map.get(sum - arr[i]));
                break;
            }
            else{
                map.put(arr[i],i);
            }
        }
    }

    public static boolean is2SumPresent(int sum,int[] arr){
        //we will check whether the corresponding variable is present in the hashmap
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0 ; i < arr.length ; i++){
            int correspondingElement = sum - arr[i];
            if(map.containsKey(correspondingElement)){
                return true;
            }
            else{
                map.put(arr[i],i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5,10,2,7,8,15};
        System.out.println(is2SumPresent(2,arr));
        printIndexTwoSum(20,arr);
    }
}
