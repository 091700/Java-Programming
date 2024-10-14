//2
import java.until.Scanner;
public class Main{
    public static void main(String[] args){
        int number1=(int)(Math.random()*10);
        int number2=(int)(Math.random()*10);
Scanner input=new Scanner(System.in);
System.out.println("what is"+number1+"+"+number2+"?");
int answer=input.nextInt();
while(number1+number2!=answer){
    System.out.println("Wrong answer,try again,what is"+number1+"+"+number2+"?");
    answer=input.nestInput();
}
system.out.println("you got it!");
    }
}
