//5
public class TestPassObject{
    public static void main(String[] args){
        CircleWithPrivateDateFields myCircle = new CircleWithPrivateDateFields(1);
        int n=5;
        printAreas(myCircle,n);
        System.out.println("radius is"+myCircle.getArea());
        System.out.println("n is"+n);
    }
    public static void printAreas(CircleWithPrivateDateFields c,int times){
        System.out.println("Radius\t\tArea");
        while (times>=1){
            System.out.println(c.getRadius()+"\t\t"+c.getArea());
            c.setRadius(c.getRadius()+1);
            times--;  
        }
    }
}
