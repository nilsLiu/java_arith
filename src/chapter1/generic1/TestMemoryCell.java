package chapter1.generic1;

public class TestMemoryCell {

    public static void main(String[] args) {
        MemoryCell m = new MemoryCell();
        m.write("37");
        System.out.println("the content is: "+ m.read().toString());
    }
}
