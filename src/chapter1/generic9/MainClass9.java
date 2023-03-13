package chapter1.generic9;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 泛型和数组
 */
public class MainClass9 {
    public static void main(String[] args) {
//        ArrayList[] list = new ArrayList[5];
//        ArrayList<String>[] listArr = list;

        ArrayList<String>[] listArr = new ArrayList[5];

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(100);

        ArrayList<String> strList = new ArrayList<>();
        strList.add("aba");
        listArr[0] = strList;

//        list[0] = intList;
        String s = listArr[0].get(0);
        System.out.println(s);
        System.out.println("____________________________");

        Fruit<String> fruit = new Fruit<>(String.class,3);
        fruit.put(0, "apple");
        fruit.put(1, "banana");
        fruit.put(2, "pear");

        System.out.println(Arrays.toString(fruit.getArray()));
        String s1 = fruit.get(2);
        System.out.println(s1);

    }
}
