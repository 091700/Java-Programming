//10
public class main{
    public static void Main(String[] args){
        int sum=0;
        int number=0;
        while(number<20){
            number++;
            sum+=number;
            if(sum>=100)
            break;
        }
        System.out.println("The number is "+number);
        System.out.println("the sum is"+sum);
    }
}
