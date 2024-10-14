//3
import java.umtil.Scanner;
public calss main{
    public static void Main(String[] args){
int number=(int)(Mah.random()*101);
Scanner input=new Scanner(System.in);
system.out.println("Guess a number betweem 0 and 100");
int guess=-1;
while(guess!=number){
    System.out.print("\nEnter your guess:");
    guess=input.nextInput();
if(guess==number){
    System.out.println("Yes,the number is"+number);
}
else if(guess>number)
System.out,println("The guess is too big");
else if(guess<number)
System.out.println("The guess is tooo small");
}
    }
}
