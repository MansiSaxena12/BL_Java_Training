package Methods.Level2;

import java.util.Scanner;

public class StudentVoteChecker {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int age[]=new int[10];
        for(int i=0;i<age.length;i++){
            age[i]=sc.nextInt();
            boolean result=canStudentVote(age[i]);
            if(result){
                System.out.println("Student can vote");
            }else{
                System.out.println("Student cannot vote");
            }
        }
    }
    public static boolean canStudentVote(int age){
        if(age<0){
            return false;
        }
        if(age>=18){
            return true;
        }
        return false;
    }
}
