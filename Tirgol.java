import java.util.Scanner;
public class Tirgol
{
    public static void main (String[]args)
    {
    Scanner scan = new Scanner(System.in);
    int width, height, perimeter, area;
    width = scan.nextInt();
    height = scan.nextInt();
    if(width<=0||height<=0)
    System.out.println("error");
    else
    {
        perimeter= 2* width + 2 * height;
        area = width * height;
        System.out.println("perimeter:" + perimeter + "area:" + area);
    }
} 
}