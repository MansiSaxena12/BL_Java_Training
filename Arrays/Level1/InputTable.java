package Arrays.Level1;
import java.util.*;
public class InputTable {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(num);
        for(int i=1;i<11;i++){
            System.out.println(num + " * "+ i+ " = "+ num*i);
        }
    }
}
