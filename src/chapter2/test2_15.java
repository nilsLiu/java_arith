package chapter2;

public class test2_15 {

    static int i = 1;

    public static void main(String[] args) {
        int[] a ={0, 2};
        System.out.println("find " + i +"?: " + findi(a));

    }

    public static boolean findi(int []a){

        for (int j = 0; j < a.length; j++) {
            if (a[j] == i){
                return true;
            }
        }
        return false;
    }
}
