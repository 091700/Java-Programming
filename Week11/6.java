public class arrrays6{
    public static void main(String[] args){
    int [][] martix=new int[3][3];

    System.out.println("Enter values in "+martix.length+" rows and "+martix[0].length+" columns:");
    for(int row=0;row<martix.length;row++){
        for(int column=0;column<martix[0].length;column++){
            martix[row][column]=(int)(Math.random()*20);
            System.out.println(martix[row][column]);
        }
    }
  int max=0;
  int indexofmaxrow=0;

    for(int column=0;column<martix[0].length;column++){
       max+=martix[0][column];
}int total=0;
for(int row=0;row<martix.length;row++){
    for(int column=0;column<martix[0].length;column++){
        total+=martix[row][column];
    }
    if(total>max){
        max=total;
    indexofmaxrow=row;
}
}
System.out.println("Row "+indexofmaxrow+" has the maximum sum of"+max);
    }
    }
