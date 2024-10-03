import java.util.*;
public class Challenge3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to perimeter calculater\n");
        System.out.println("Please enter all 4 sides in centimeter");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();

        double perimeter = a + b + c + d;
        System.out.println("Perimeter of your rectangle is: " + perimeter );

    // Float = 3.14f  or  doulbe = 3.141592653589
    // float ko tab use karte hain jab memory kaphi limited ho aur precision(suddhata) ka itna zyada farak na pde.
    // double ko zyada tar use karte hain jab high precision ki zarurat hoti hai, jaise scientific calculations main.


    }
}
