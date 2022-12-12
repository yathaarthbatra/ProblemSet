package playground;

import helper.Utils;

import java.util.ArrayList;
import java.util.List;

public class SampleClass {

    public static void main(String[] args) {
        List<List<Integer>> multiDimensionalList =  get2DListFromFunction();
        for (int i = 0 ; i < multiDimensionalList.size();i++){
            List<Integer> list = multiDimensionalList.get(i);
            for (int j = 0; j < list.size(); j++){
                System.out.print(list.get(j) + " ");
            }
            System.out.println();
        }
    }

    private static List<List<Integer>> get2DListFromFunction(){
        ArrayList<Integer> integerList1 = new ArrayList<>();
        integerList1.add(5);
        integerList1.add(5);
        integerList1.add(5);
        ArrayList<Integer> integerList2 = new ArrayList<>();
        integerList2.add(10);
        integerList2.add(10);
        integerList2.add(10);
        ArrayList<Integer> integerList3 = new ArrayList<>();
        integerList3.add(15);
        integerList3.add(15);
        integerList3.add(15);
        List<List<Integer>> resultList = new ArrayList<>();
        resultList.add(integerList1);
        resultList.add(integerList2);
        resultList.add(integerList3);
        return resultList;
    }
}
