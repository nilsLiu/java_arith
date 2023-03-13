package chapter1.generic3;


/**
 * 子类是泛型类的情况，标识要与父类一致
 * @param <T>
 */

public class ChildFirst<T> extends Parent<T>{

    @Override
    public T getValue() {
        return super.getValue();
    }

}
