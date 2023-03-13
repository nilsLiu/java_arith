package chapter1.generic4;

/**
 * 实现泛型接口的类如不是泛型类，需要明确泛型接口的数据类型
 */
public class Apple implements Generator<String>{
    @Override
    public String getkey() {
        return "generic";
    }

}
