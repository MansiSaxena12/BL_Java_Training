package Methods.Level2;

import java.util.Scanner;

public class FriendsComparision {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int age[]=new int[3];
        double heght[]=new double[3];

        for(int i=0;i<3;i++){
            age[i]=sc.nextInt();
            heght[i]=sc.nextDouble();
        }

        int youngestIndex=findYoungest(age);
        int tallestIndex=findTallest(heght);

        String names[]={"Amar","Akbar","Anthony"};

        System.out.println("Youngest friend is "+names[youngestIndex]);
        System.out.println("Tallest friend is "+names[tallestIndex]);
    }

    public static int findYoungest(int age[]){
        int minIdx=0;
        for(int i=1;i<age.length;i++){
            if(age[i]<age[minIdx]){
                minIdx=i;
            }
        }
        return minIdx;
    }

    public static int findTallest(double heght[]){
        int maxIdx=0;
        for(int i=1;i<heght.length;i++){
            if(heght[i]>heght[maxIdx]){
                maxIdx=i;
            }
        }
        return maxIdx;
    }
}
