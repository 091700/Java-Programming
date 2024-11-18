import java.util.Scanner;
public class arrrays8{
    public static void main(String[] args){
        int[][]martix=getArray();
        System.out.println("The sum of all elements is"+sum(martix));
    }
    public static int[][]getArray(){
Scanner input=new Scanner(System.in);
int[][]martix=new int[3][4];
System.out.println("Enter"+martix.length+"and"+martix[0].length);
for(int row=0;row<martix.length;row++){
    for(int column=0;column<martix[0].length;column++){
        martix[row][column]=input.nextInt();
    }
}
return martix;
    }
    public static int sum(int[][]martix){
        int total=0;
        for(int row=0;row<martix.length;row++){
            for(int column=0;column<martix[0].length;column++){
               total+=martix[row][column];
        }
    }
    return total;
}
}
