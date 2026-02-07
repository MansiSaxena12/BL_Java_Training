package Arrays.Level1;
import java.util.*;
public class Factors {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int idx=0;
        int num= sc.nextInt();
        int maxFactor[]=new int[10];
        for(int i=2;i<num;i++){
            if(num%i==0){
                maxFactor[idx]=i;
                idx++;
            }
        }
        System.out.println(Arrays.toString(maxFactor));
    }
}
