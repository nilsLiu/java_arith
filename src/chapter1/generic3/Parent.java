package chapter1.generic3;

//父类泛型类
public class Parent<E> {
    private E value;

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }
}