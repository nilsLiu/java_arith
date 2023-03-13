package chapter2;

/**
 * 在最近的一次法庭审理案件中，一位法官因幾视罪传讯一个城市并命令第一天交纳罚金2美元，
 * 以后每天的罚金都要将上一天的罚金数额平方，直到该城市服从该法官的命令为止(即，罚金上升如下：$2， $4 $16 $256 $65536)
 * a.在第N天罚金将是多少？
 * b.使罚金达到D美元需要多少天？
 */
public class test2_6 {


    public static void main(String[] args) {
        int day = 2;
        int sumPrice = getSum(day);
        System.out.println("第"+ day + "天的罚金是 " + sumPrice + "＄");
        int sumPrice1 = 200;
        int day1 = getDay(sumPrice1);
        System.out.println("当罚金到达" + sumPrice1 +"＄时，需要" + day1 + "天" );
    }

    public static int getSum(int day){

        int sum = 0;
        for (int i = 0; i <= day-1; i++) {
            sum += Math.pow(2,Math.pow(2,i));
        }
        return sum;
    }

    public static int getDay(int sumPrice){

        int sum;
        int day = 0;
        do {
            ++day;
            sum = getSum(day);
        }while (sum < sumPrice);
        return day;
    }

}
