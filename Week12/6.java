//6
public class ArrayOfobjects{
    public static void main(String[] args){
    CircleWithPrivateDateFields[]circleArray;
    circleArray=creatCircleArray();
    printCircleInfo(circleArray);
    }
    public static CircleWithPrivateDateFields[] creatCircleArray(){
        CircleWithPrivateDateFields[] circleArray=new CircleWithPrivateDateFields[5];
        for(int i=0;i<circleArray.length;i++){
            circleArray[i]=new CircleWithPrivateDateFields(Math.random()*10);
        }
        return circleArray;
    }
    public static void printCircleInfo(CircleWithPrivateDateFields[] circleArray){
        System.out.printf("%-30s%-15s\n","Radius","Area");
        for(int i=0;i<circleArray.length;i++){
        System.out.printf("%-30.2f%-15s\n",circleArray[i].getRadius(),circleArray[i].getRadius(),circleArray[i].getArea());
        }
    }
}
