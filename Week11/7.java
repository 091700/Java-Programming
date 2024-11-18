public class arrrays7{
    public static void main(String[] args){
        int[][]martix={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        for(int row=0;row<martix.length;row++){
            for(int column=0;column<martix[0].length;column++){
             int j1=(int)(Math.random()*martix.length);
             int j2=(int)(Math.random()*martix[row].length);
             int temp=martix[row][column];
             martix[row][column]=martix[j1][j2];
             martix[j2][j2]=temp;
            }
        }
        System.out.println("Array after shuffling: ");
        for(int row=0;row<martix.length;row++){
            for(int column=0;column<martix[0].length;column++){
                System.out.println(martix[row][column]);
            }
        }
    }
}
