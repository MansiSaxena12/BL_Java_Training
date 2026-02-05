package JavaControlFlow;

import java.util.Scanner;

public class SmallestOrLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println("is num1 smallest");
        if(check(num1,num2,num3)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
    public static boolean check(int num1, int num2, int num3){
        return num1 < num2 && num1 < num3;
    }
}
