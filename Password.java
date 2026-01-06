import java.util.Scanner;
import java.util.Random;
public class Password{
public static void main(String[]args){
 Scanner scan = new Scanner(System.in);
 Random rand = new Random();
 System.out.println("Please enter your first name");
 String name = scan.next();
 System.out.println("Length: " + name.length());
 System.out.println("First letter is: " + name.charAt(0)); 
 int randomNumber = rand.nextInt(101);
 System.out.println("Your new password is: " + name + randomNumber);

}
}