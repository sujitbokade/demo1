import java.util.Scanner;

public class first{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name :");
        String firstname = input.next();

        System.out.println("Enter your last name");
        String lastname = input.next();

        System.out.println("your full name is"+firstname+" "+lastname);


     }
}