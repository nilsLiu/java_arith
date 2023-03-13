package chapter1.generic4;

public class MainClass4 {
    public static void main(String[] args) {
        Apple apple = new Apple();
        String key = apple.getkey();
        System.out.println(key);
        System.out.println("_______________________");

        Pair<String, Integer> pair = new Pair<>("count",200);
        String key1 = pair.getkey();
        Integer value1 = pair.getValue();
        System.out.println(key1 + "=" + value1 );
    }
}
