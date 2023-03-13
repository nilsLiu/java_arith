package chapter1.generic7;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet1 {

    public static void main(String[] args) {
        TreeSet<Cat> treeSet = new TreeSet<>(new Comparator1());
//        TreeSet<Cat> treeSet = new TreeSet<>(new Comparator2());
        treeSet.add(new Cat("dick",15));
        treeSet.add(new Cat("jack",12));
        treeSet.add(new Cat("tifa",31));
        treeSet.add(new Cat("bob",34));
        for (Cat cat : treeSet) {
            System.out.println(cat);
        }
    }
}

class Comparator1 implements Comparator<Animal>{
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.name.compareTo(o2.name);
    }
}


class Comparator2 implements Comparator<Cat>{
    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.age - o2.age;
    }
}

class Comparator3 implements Comparator<MiniCat>{
    @Override
    public int compare(MiniCat o1, MiniCat o2) {
        return o1.level - o2.level;
    }
}