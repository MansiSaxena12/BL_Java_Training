package Arrays.Level1;

public class StudentVoteEligibility {
    public static void main(String[] args) {
            int arr[]={10,18,13,8,20,14,21,20,18,15};
            for(int i=0;i<10;i++){
                if (arr[i]>=18) {
                System.out.print("Student id: "+ i);
                System.out.print(" Student age: "+ arr[i]);
                System.out.println(" Student eligibility "+ "Yes");
                }
                else{
                    System.out.print("Student id: "+ i);
                    System.out.print(" Student age: "+ arr[i]);
                    System.out.println(" Student eligibility "+ "No");
                }
            }
    }
}
