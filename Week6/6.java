//6
import java.until.Scanner;
public class main;{
public static void Main(String[] args){
    int data;
    int sum=0;
    Scanner input=new Scanner(System.in);
    do{
        System.out.println("enter an integer(the input if it is 0):");
        data=input.nextInt();
        sum+=data;
    }
    while(data!=0);
System.out.println("the sum is"+sum);
}}
