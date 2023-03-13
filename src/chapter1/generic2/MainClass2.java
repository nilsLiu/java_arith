package chapter1.generic2;

public class MainClass2 {

    public static void main(String[] args) {
        //创建抽奖对象，指定数据类型
        ProductGetter<String> stringProductGetter = new ProductGetter<>();
        String[] strProducts = {"a", "b", "c", "d"};
        //给抽奖器中添加奖品
        for (int i = 0; i < strProducts.length; i++) {
            stringProductGetter.addProduct(strProducts[i]);
        }

        //抽奖
        String product1 = stringProductGetter.getProduct();
        System.out.println("抽中了:"+ product1);

        System.out.println("____________________");
        //抽数字 int类型
        ProductGetter<Integer> integerProductGetter = new ProductGetter<>();
        int[] intProducts = {100, 200, 300, 500};
        for (int i = 0; i < intProducts.length; i++) {
            integerProductGetter.addProduct(intProducts[i]);
        }
        Integer product2 = integerProductGetter.getProduct();
        System.out.println("抽中了："+ product2);


    }
}
