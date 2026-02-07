package Arrays.Level1;
import java.util.*;
public class SixtoNine {
    public static void main(String[] args) {
        int arr[]=new int[4];
        int idx=0;
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=6;i<10;i++){
            arr[idx]=num*i;
            idx++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
