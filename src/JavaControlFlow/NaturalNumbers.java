package JavaControlFlow;

import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=n*(n+1)/2;
        if(n>1){
            System.out.println("The sum of "+n+" Natural number is"+sum);
        }
        else{
            System.out.println("the sum "+ n+ "is not a natural number");
        }
    }
}
