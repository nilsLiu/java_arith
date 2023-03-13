package chapter1;

import java.time.LocalDate;

public class PairTest2 {

    public static void main(String[] args) {
        LocalDate[] bri = {
                LocalDate.of(1887, 12, 4),
                LocalDate.of(1857, 1, 3),
                LocalDate.of(1987, 12, 1),
                LocalDate.of(1999, 4, 22),
        };
        Pair<LocalDate> mn = ArrayAl.minmax(bri);
        System.out.println("MIN:" + mn.getFirst());
        System.out.println("MAX:" + mn.getSecond());
    }
}

class ArrayAl {

    //对类型变量T设置限定，实现compareTo方法
    public static <T extends Comparable> Pair<T> minmax(T[] a) {
        if (a == null || a.length == 0) return null;
        T min = a[0];
        T max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) min = a[i];
            if (max.compareTo(a[i]) < 0) max = a[i];
        }
        return new Pair<>(min, max);
    }
}