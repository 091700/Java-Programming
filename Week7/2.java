//Task2
public class Main {
	public static void main(String[] args) {
	    int i=5;
	    int j=2;
	    int k ;
	    k=max(i,j);
		System.out.println("The maximun of"+i+"and"+j+"is"+k);
	}
	public static int max(int num1,int num2){
	    int result;
	    if(num1>num2)
	    {result=num1;}
	    else 
	    {result=num2;}
	    return result;
	}
}
