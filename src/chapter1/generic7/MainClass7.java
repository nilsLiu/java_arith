package chapter1.generic7;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class MainClass7 {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        ArrayList<Cat> cats = new ArrayList<>();
        ArrayList<MiniCat> miniCats = new ArrayList<>();



        showAnimal(animals);
        showAnimal(cats);
//        showAnimal(miniCats);
    }

    /**
     * 泛型的上限通配符，传递的集合类型只能是Cat或Cat的子类类型
     * @param list
     */
//    public static void showAnimal(ArrayList<? extends Cat> list){
//        for (int i = 0; i < list.size(); i++) {
//            Cat cat = list.get(i);
//            System.out.println(cat);
//        }
//    }

    /**
     * 类型通配符的下限，要求集合只能是Cat或Cat的父类类型
     * @param list
     */
    public static void showAnimal(List<? super Cat> list){

//        list.add(new Cat());
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
