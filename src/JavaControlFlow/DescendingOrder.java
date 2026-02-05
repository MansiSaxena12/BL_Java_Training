package JavaControlFlow;

import java.util.Scanner;

public class DescendingOrder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int num3= sc.nextInt();
        System.out.println("Is the first number the largest?");
        if(num1>num2 && num1>num3){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        System.out.println("Is the second number the largest?");
        if(num2>num3 && num2<num1){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        System.out.println("Is the third number the largest?");
        if(num3<num2 && num3<num1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
