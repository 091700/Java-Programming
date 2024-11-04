import java.util.Date;
public class date1{
    public static void main(String[] args){
        Date date=new Date();
        System.out.println("The elasped time since Jan 1,1970is"+date.getTime()+"millisconds");
        System.out.println(date.toString());
    }
}
