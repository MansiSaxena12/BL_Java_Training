package Arrays.Level1;
import java.util.*;
public class Store {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        int size=0;
        while(size==11){
            int num=sc.nextInt();
            if( num<=0){
                break;
            }else{
                arr[size]=num;
                size++;
                num++;
            }
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
