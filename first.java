import java.util.Scanner;

public class first{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number :");
        int firstnumber = input.nextInt();

        System.out.println("Enter second number :");
        int secondnumber = input.nextInt();
        int z = firstnumber + secondnumber;
        System.out.println("Total "+z);
        
    input.close();

     }
}   