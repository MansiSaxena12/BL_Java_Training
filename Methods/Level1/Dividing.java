package Methods.Level1;
import java.util.*;
public class Dividing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int div=sc.nextInt();
        double arr[]=findRemainderAndQuotient(num, div);
        System.out.println(Arrays.toString(arr));
    }
    public static double[] findRemainderAndQuotient(int number, int divisor){
        return new double[]{number/divisor,number%divisor};
    }
}
