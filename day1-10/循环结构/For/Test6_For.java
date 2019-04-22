//For循环求1-10之间奇数sum
public class Test6_For {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1;i <= 100;i++) {
            if (i % 2 == 1){
                sum = sum + i;
            }
        }
        System.out.println("sum = " + sum);
    }
}