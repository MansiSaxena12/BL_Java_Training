package JavaControlFlow;

import java.util.Scanner;

public class Triangle {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//    Three input Values
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();

        int sum=x+y+z;
        System.out.println(sum);
        if(sum==180){
            System.out.println("It is a triangle");
        }else{
            System.out.println("its is not a triangle");
        }
    }
}
