package ParameterideMethod;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> ar1 = new ArrayList<>();
        ar1.add("qwe");
        ar1.add("rty");
        ar1.add("yui");
        String s = GenMethod.getSecondElemet(ar1);
        System.out.println(s);

        ArrayList<Integer> ar2 = new ArrayList<>();
        ar2.add(123);
        ar2.add(233);
        ar2.add(345);
        Integer i = GenMethod.getSecondElemet(ar2);
        System.out.println(i);
    }
}

class GenMethod{
    public static <T> T getSecondElemet(ArrayList<T> arrayList){
        return arrayList.get(2);
    }
}
