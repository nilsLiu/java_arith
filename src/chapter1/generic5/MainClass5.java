package chapter1.generic5;

import chapter1.generic2.ProductGetter;

import java.util.ArrayList;

/**
 * @author liuch
 */

/**
 * 泛型方法
 */
public class MainClass5 {
    public static void main(String[] args) {
        ProductGetter<Integer> productGetter = new ProductGetter<>();
        int[] products ={100, 200, 500};
        for (int i = 0; i < products.length; i++) {
            productGetter.addProduct(products[i]);
        }
        //泛型类的成员方法的调用
        Integer product = productGetter.getProduct();
        System.out.println(product + "\t" + product.getClass().getSimpleName());
        System.out.println("__________________________________");

        ArrayList<String> strList = new ArrayList<>();
        strList.add("aaa");
        strList.add("bbb");
        strList.add("ccc");
        //泛型方法的调用，类型是通过调用方法的时候来指定的
        String product1 = productGetter.getProduct(strList);
        System.out.println(product1 + "\t" + product1.getClass().getSimpleName());
        System.out.println("__________________________________");


        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(100);
        intList.add(200);
        intList.add(300);
        Integer product2 = productGetter.getProduct(intList);
        System.out.println(product2 + "\t" +product2.getClass().getSimpleName());
        System.out.println("__________________________________");
        // 调用多个泛型类型的静态方法
        ProductGetter.printType(100,"aaa", false);
        System.out.println("__________________________________");
        // 可变参数的泛型方法的调用
        ProductGetter.print(1,2,3,4,100);
        System.out.println("__________________________________");
        ProductGetter.print("1","2","3","4","cd");
    }

}
