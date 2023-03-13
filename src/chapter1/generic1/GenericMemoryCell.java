package chapter1.generic1;

public class GenericMemoryCell <AnyType> {
//  构建泛型类
    private AnyType storedValue;

    public AnyType read(){
        return storedValue;
    }

    public void write(AnyType x){
        storedValue = x;
    }

}
