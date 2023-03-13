package chapter1.generic1;
//  自动装箱，拆箱

public class BoxingDemo {
    public static void main(String[] args) {
        GenericMemoryCell<Integer> m = new GenericMemoryCell<>();
        //  菱形运算符，简化代码，m是GenericMemoryCell<Integer>类型的，创建的对象也必须是Integer类型
//        GenericMemoryCell<Integer> m = new GenericMemoryCell<Integer>();

        m.write( 37);
        System.out.println("contents are " + m.read());
    }
}
