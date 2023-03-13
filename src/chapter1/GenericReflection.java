package chapter1;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 泛型反射机制
 */
public class GenericReflection {
    public static void main(String[] args) {
        //从命令行和输入读取class名

        String name;
        if (args.length > 0) name = args[0];
        else {
            try (Scanner in = new Scanner(System.in)) {
                System.out.println("Enter class name");
                name = in.next();
            }
            try {
                // 打印class和public方法的泛型信息
                Class<?> cl = Class.forName(name);
                printClass(cl);
                // 通过getDeclaredMethods返回类中所有的实例方法
                for (Method m :
                        cl.getDeclaredMethods()) {
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    private static void printClass(Class<?> cl) {
        System.out.println(cl);
        printTypes();
        //通过反射获取当前类表示的实体（类，接口，基本类型或void）的直接父类的Type
        Type sc = cl.getGenericSuperclass();
        if (sc != null) {
            System.out.println("extends");
            printTypes();
        }
        printTypes();
        System.out.println();
    }

    private static void printTypes() {
    }
}
