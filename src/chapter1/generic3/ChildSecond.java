package chapter1.generic3;


/**
 * 泛型类排生子类，子类不是泛型类的情况下，父类需要明确数据类型
 */
public class ChildSecond extends Parent<String>{

    @Override
    public String getValue() {
        return super.getValue();
    }

    @Override
    public void setValue(String value) {
        super.setValue(value);
    }
}
