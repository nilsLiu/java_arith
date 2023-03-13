package chapter1.generic3;

public class MainClass3 {
    public static void main(String[] args) {

        ChildFirst<String> childFirst =new ChildFirst<>();
        childFirst.setValue("aaa");
        String value = childFirst.getValue();
        System.out.println(value);


        System.out.println("____________________________");
        ChildSecond childSecond = new ChildSecond();
        childSecond.setValue("200");
        String value1 = childSecond.getValue();
        System.out.println(value1);
    }
}
