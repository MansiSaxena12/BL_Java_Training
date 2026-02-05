package JavaControlFlow;

import java.util.Scanner;

public class EligibleVoter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age= sc.nextInt();
        if(eligibility(age)){
            System.out.println("Eligible");
        }else{
            System.out.println("not eligible");
        }
    }
    public static boolean eligibility(int age){
        return age>=18;
    }
}
