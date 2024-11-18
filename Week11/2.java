import java.util.Scanner;
public class arrrays2{
    public static void main(String[] args){
    int [][] martix=new int[3][3];
    Scanner input=new Scanner(System.in);
    System.out.println("Enter values in "+martix.length+" rows and "+martix[0].length+" columns:");
    for(int row=0;row<martix.length;row++){
        for(int column=0;column<martix[0].length;column++){
            martix[row][column]=input.nextInt();
        }
    }
    input.close();
   System.out.println(martix[0][0]);
    }
    }
