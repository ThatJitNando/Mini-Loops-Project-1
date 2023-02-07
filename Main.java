import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int input = 1;
    int sum = 0;
    int count = 1;

    
    
while (input > 0 && count < 11)
  {
    System.out.println("Please enter your number: " );
    input = scan.nextInt();

      sum += input;
      count++;
    
  
  }
    
    
    System.out.println("The sum of the numbers is " + sum);
  
  }
 }
