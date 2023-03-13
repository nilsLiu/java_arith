package chapter1.generic1;

public class MemoryCell {

    //使用Object类来实现泛型类
    private Object storedValue;

    public Object read(){
        return storedValue;
    }

    public void write(Object x){
        storedValue = x;
    }

}
