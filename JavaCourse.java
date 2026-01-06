public class JavaCourse{
    public void addNum(int num1,double num2){
        double sum = num1 + num2; 
        System.out.println("The sum is: " + sum);
    }

    public void checkStudent(String name , int age){
        boolean isAdult = age >= 18; 
        System.out.println("Student: " + name);
        System.out.println("Is 18 or older? " + isAdult);
    }

    public void checkPassword(String inputPassword){
        if (inputPassword.equals("Java123")){
            System.out.println("Access Granted! Welcome.");
        } else {
            System.out.println("Wrong password. Access Denied.");
        }
    } 

    public void checkRollercoaster(int age, double height) {
    // שימוש באופרטור && (וגם)
    if (age >= 12 && height >= 1.40) {
        System.out.println("Yay! You can ride the rollercoaster!");
    } else {
        System.out.println("Sorry, you cannot ride yet.");
        
        // כאן נוסיף בונוס: נסביר לו למה הוא לא נכנס
        if (age < 12) {
             System.out.println("Reason: You are too young.");
        }
        if (height < 1.40) {
             System.out.println("Reason: You are not tall enough.");
        }
    }
 }public void analyzeText(String text){
     System.out.println("Original: " + text);
     int len = text.length();
     System.out.println("Length: " + len);
     char firstletter = text.charAt(0);
     System.out.println("Yelling: " + text.toUpperCase());
     System.out.println("First letter :" + firstletter);
     if (len >=3) {
     System.out.println("Prefix: " + text.substring(0, 3 ));
 }
}
public void rollDice() {

int result = (int) (Math.random() * 6) + 1;
System.out.println("The dice rolled: " + result);
if (result ==6) {
    System.out.println("Wow! Critical Hit!") ;
    
 }
}
public void countToTen(){
    int counter = 1; //מתחילים מ-1}// כל עוד המונה קטן או שווה ל-10
 while (counter <= 10) {
  System.out.println("Counting:   " + counter);
  counter = counter + 1; //חובה בשביל למנוע לולאה אינסופית   
}
 System.out.println("Done! ");
}
 }


