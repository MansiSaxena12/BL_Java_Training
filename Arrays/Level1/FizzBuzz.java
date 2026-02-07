package Arrays.Level1;
import java.util.*;
import java.lang.String;
// import java.lang.reflect.Array;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int userInput=sc.nextInt();
        String arr[]=new String[userInput];
        int idx=0;
        for(int i=0;i<userInput;i++){
            if(i%3==0 && i%5==0){
                arr[idx]="FizzBuzz";
                idx++;
            }
            else if(i%3==0){
                arr[idx]="Fizz";
                idx++;
            }
            else if(i%5==0){
                arr[idx]="Buzz";
                idx++;
            }
            else{
                arr[idx]=Integer.toString(i);
                idx++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
