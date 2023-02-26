package Wildcards;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(123);
        list1.add(345);
        list1.add(567);

        List<String> list2 = new ArrayList<>();
        list2.add("Hello");
        list2.add("How are you?");
        list2.add("Thaks!");

        GetInfo.showInfo(list1);
        GetInfo.showInfo(list2);
    }
}

class GetInfo {
    static void showInfo(List<?> list){
        System.out.println("Info about list => " + list);
    }
}

