import java.util.Random;
public class random1{
    public static void main(String[] args){
       Random generator1=new Random(3);
       System.out.print("Form generate1:");
       for(int i=0;i<10;i++){
        System.out.print(generator1.nextInt(1000));
       }
       Random generator2=new Random(3);
       System.out.print("\nForm generate2:");
       for(int i=0;i<10;i++){
        System.out.print(generator2.nextInt(1000));
       }
    }
}
