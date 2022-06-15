import java.util.Scanner;

public class unit{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter value of Inch :");
        float Inch = input.nextFloat();
	float feet = Inch / 12;

        System.out.println( Inch + " " + "is"+" "+ feet +" "+ "feet");

        input.close();
            }

}
