//5
import java.until.Scanner;
public class main{
    public static void Main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("enter an integer(the input ends if it is 0):");
        int data=input.nextInt();
        int sum=0;
        while(data!=0){
            sum+=data;
            System.out.print("Enter an integer(the input ends if it is 0):");
            data=input.nextInt();
        }
        System.out.println("The sum is"+sum);
    }
}
