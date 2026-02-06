package Methods.Level3;
import java.util.*;
public class Height {
    public static void main(String[] args) {
        Random random=new Random();
        int arr[]=new int[11];
        for(int i=0;i<11;i++){
            arr[i]=(int)(Math.random()*101)+115;
        }
        System.out.println(Arrays.toString(arr));
        int sum=sum(arr);
        System.out.println(sum);
        int mean=mean(arr, sum);
        System.out.println(mean);
        System.out.println(shortest(arr));
        System.out.println(tallest(arr));
    }
    public static int sum(int [] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static int mean(int[] arr, int sum){
        return sum/11;
    }
    public static int shortest(int[] arr){
        int shortest=arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]<shortest) {
                shortest=arr[i];
            }
        }
        return shortest;
    }
    public static int tallest(int[] arr){
        int high=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>high) {
                high=arr[i];
            }
        }
        return high;
    }
}
