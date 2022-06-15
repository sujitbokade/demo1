import java.util.Scanner;

public class Area{
       public static void main(String[] args){
       Scanner input  = new Scanner(System.in);

       System.out.println("Enter length of plot in Feet: ");
        double length = input.nextDouble();
       System.out.println("Enter breadth of plot in Feet: ");
        double breadth = input.nextDouble();
        double area = length*breadth;
        double Area = area/10.76;

      System.out.println("Area of rectangular in Square Meter:"+Area);



}
}
