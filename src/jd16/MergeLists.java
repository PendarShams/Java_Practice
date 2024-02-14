package jd16;


import java.util.ArrayList;
import java.util.List;

public class MergeLists {
    public static List<Integer> mergeLists(List<Integer> list1, List<Integer> list2) {

        List<Integer> mergedList = new ArrayList<>();


        for (Integer num : list1) {
            if (!mergedList.contains(num)) {
                mergedList.add(num);
            }
        }


        for (Integer num : list2) {
            if (!mergedList.contains(num)) {
                mergedList.add(num);
            }
        }

        return mergedList;
    }

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        list1.add(60);
        list1.add(70);

        List<Integer> list2 = new ArrayList<>();
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(60);
        list2.add(70);
        list2.add(80);
        list2.add(90);
        list2.add(100);


        List<Integer> mergedList = mergeLists(list1, list2);


        System.out.println("Output:");
        System.out.println(mergedList);
    }
}


