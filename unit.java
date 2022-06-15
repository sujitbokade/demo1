import java.util.Scanner;

public class first{
    public static void main(String[] args){
        double feet;
	double inches;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter value of Inch :");
        inches = input.nextdouble();
	feet = inches / 12;

        System.out.println(inches + "is"+ feet + "feet");
        }
}
