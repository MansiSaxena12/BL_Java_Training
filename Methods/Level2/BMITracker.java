package Methods.Level2;

import java.util.Scanner;

public class BMITracker {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        double data[][]=new double[10][3];

        for(int i=0;i<10;i++){
            data[i][0]=sc.nextDouble();
            data[i][1]=sc.nextDouble();
        }

        findBMI(data);
        String status[]=findStatus(data);

        for(int i=0;i<10;i++){
            System.out.println("Height:"+data[i][1]+" Weight:"+data[i][0]+" BMI:"+data[i][2]+" Status:"+status[i]);
        }
    }

    public static void findBMI(double arr[][]){
        for(int i=0;i<10;i++){
            double height=arr[i][1]/100;
            arr[i][2]=arr[i][0]/(height*height);
        }
    }

    public static String[] findStatus(double arr[][]){
        String res[]=new String[10];
        for(int i=0;i<10;i++){
            double bmi=arr[i][2];
            if(bmi<18.5){
                res[i]="Underweight";
            }else if(bmi<25){
                res[i]="Normal";
            }else if(bmi<30){
                res[i]="Overweight";
            }else{
                res[i]="Obese";
            }
        }
        return res;
    }
}
