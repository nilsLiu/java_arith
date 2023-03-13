package chapter1.generic8;

public class InfoImpl implements Info<Integer>{
    @Override
    public Integer info(Integer value) {
        return value;
    }
}
