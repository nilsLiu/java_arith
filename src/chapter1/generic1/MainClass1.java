package chapter1.generic1;

public class MainClass1 {

    public static void main(String[] args) {
        //泛型类在创建具体对象时，指定操作的具体数据
        Generic<String> strGeneric = new Generic<>("aaa");
        String key1 = strGeneric.getKey();
        System.out.println("key1：" + key1);

        Generic<Integer> integerGeneric = new Generic<>(100);
        Integer key2 = integerGeneric.getKey();
        System.out.println("____________________");
        System.out.println("key2:"+ key2);

        //泛型类在创建对象时，不指定类型，则按照Object类来操作
        Generic generic = new Generic(100);
        Object key3 = generic.getKey();
        System.out.println("____________________");
        System.out.println("key3:"+ key3);


        //泛型类不支持基本类型
//        Generic<int> intGeneric = new Generic<int>();

        System.out.println("____________________");
        // 同一泛型创建的不同数据类型对象属于同一类型
        System.out.println(integerGeneric.getClass());
        System.out.println(strGeneric.getClass());
        System.out.println(integerGeneric.getClass() == strGeneric.getClass());

    }
}
