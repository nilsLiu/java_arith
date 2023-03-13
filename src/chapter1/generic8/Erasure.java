package chapter1.generic8;

import java.util.List;

public class Erasure<T extends Number> {

    private T key;

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    /**
     * 泛型方法
     * @param t
     * @return
     * @param <T>
     */
    public <T extends List> T show(T t){
        return t;
    }
}
