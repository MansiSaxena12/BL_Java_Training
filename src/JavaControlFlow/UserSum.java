package JavaControlFlow;

import java.util.Scanner;

public class UserSum {
    public static void main(String[] args) {
        Scanner hello=new Scanner(System.in);
        int num=hello.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
