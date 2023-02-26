package ParameterizdeClass2;

public class Test2 {
    public static void main(String[] args) {
        Pair <String, Integer> pair1 = new Pair<>("Hello!", 666);
        System.out.println("First value => " + pair1.getFirstValue());
        System.out.println("Second value => " + pair1.getSecondValue());
        System.out.println("=================");
        Pair <Double, Character> pair2 = new Pair<>(3.14, 'P');
        System.out.println("First value => " + pair2.getFirstValue());
        System.out.println("Second value => " + pair2.getSecondValue());
    }
}

class Pair<V1, V2>{
    private V1 value1;
    private  V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue(){
        return value1;
    }

    public V2 getSecondValue(){
        return value2;
    }
}
