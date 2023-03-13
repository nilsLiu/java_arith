package chapter1.generic6;

public class MainClass6 {

    public static void main(String[] args) {
        Box<Number> box1 = new Box<>();
        box1.setFirst(110);
        showBox(box1);

        Box<Integer> box2 = new Box<>();
        box2.setFirst(150);
        showBox(box2);
    }

    /**
     * ? 是类型通配符，代替具体的类型实参
     * 类型通配符的上限<? extends 实参类型>
     * @param box
     */

    public static void showBox(Box<? extends Number> box){
        Number first = box.getFirst();
        System.out.println(first);
    }

//    public static void showBox(Box<Integer> box){
//        Number first = box.getFirst();
//        System.out.println(first);
//    }

}
