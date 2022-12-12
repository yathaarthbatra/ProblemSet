package helper;

import java.util.List;

public class Utils {

    public static void printSingleIntegerList(List<Integer> list){
        for (int i = 0 ; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }

    public static void print2DIntegerList(List<List<Integer>> list){
        for (int i = 0; i < list.size() ; i++){
            printSingleIntegerList(list.get(i));
            System.out.println("\n");
        }
    }
}
