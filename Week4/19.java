public class Labtask{        
  public static void main(String[] args) {            
    final int DATE = 100;            
    int Theday = (2+DATE%7)%7;            
    switch (Theday) {                
      case 1:System.out.println("Theday is Monday");break;                
      case 2:System.out.println("Theday is Tuesday");break;                
      case 3:System.out.println("Theday is Wednesday");break;                
      case 4:System.out.println("Theday is Thursday");break;                
      case 5:System.out.println("Theday is Friday");break;                
      case 6:System.out.println("Theday is Saturday");break;               
  case 7:System.out.println("Theday is Sunday");break;           
    }    }}
