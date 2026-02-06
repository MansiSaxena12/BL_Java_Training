package Methods.Level1;

import java.util.Scanner;

public class Polarity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int val=polars(a);
        System.out.println(a);
    }
    public static int polars(int a){
        if(a>0){
            return 1;
        }else if(a==0){
            return 0;
        }
        else{
            return -1;
        }
    }
}
