import java.util.Scanner;
public class Labtask {    
  public static void main(String[] args) {        
  Scanner input = new Scanner(System.in);        
  System.out.println("Enter a number: ");        
int number = input.nextInt();        
String formattedNumber = String.format("%02d", number);       
System.out.println("Formatted number: " + formattedNumber);    
}}
