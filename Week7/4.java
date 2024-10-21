//Task4
public class Main {
	public static void main(String[] args) {
		System.out.println("The grade is "+Grade(78.5));
		System.out.print("The grade is "+Grade(59.5));
	}
	public static char Grade(double score){
	     if(score>=90.0)
	    return'A';
	     else if(score>=80.0)
	    return'B';
	     else if(score>=70.0)
	    return'C';
	     else if(score>=60.0)
	    return'D';
	     else
	    return'E';
	}
}
