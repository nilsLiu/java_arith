package chapter1;

/**
 * 简单泛型类
 *
 * @param <T>
 */
public class Pair<T> {

    private T first;
    private T second;

    // 无参构造
    public Pair() {
        first = null;
        second = null;
    }

    // 有参构造
    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T newValue) {
        first = newValue;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T newValue) {
        second = newValue;
    }
}
