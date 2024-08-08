// using if and if ekse and ternary operator and else if ladder and nested if and switch 
import java.util.*;
public class Controlstruct {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Entwer a value(to check whtehr even or not and negative or positive): ");
        long a = s.nextLong();
        //int b = s.nextInt();
        if(a >0 & a % 2 == 1 ){
            System.out.println(a + " is odd and postive.");
        }
        else if(a == 0){
            System.out.println(a + " is neither odd nor even.");
        }
        else if(a < 0 & a % 2 == 1) {
            System.err.println(a + " is odd and negative.");
        }
        else if(a > 0 & a % 2 == 0) {
            System.out.println(a + " is even and positive.");
        }
        else{
            System.out.println(a +  " is even and negative.");
        }

        System.out.println("Enter two vaues to perform arithmetic operation: ");
        long x = s.nextLong();
        long y = s.nextLong();
        System.out.println("Enter the following number according to wich operation you need 1) + 2) - 3) * 4) / 5) % : ");
        int v = s.nextInt();
        switch(v)
        {
            case 1:
             System.out.println("Sum of " + x +  " , " + y + " is: " + (x+y));
            break;
            case 2:
             System.out.println("Sum of " + x +  " , " + y + " is: " + (x-y));
            case 3:
             System.out.println("Product of " + x +  " , "+ y + " is: " + (x*y) );
            case 4:
             System.out.println("Quotient is " + x +  " , " +  y  + " is: " + (x/y) );
            case 5:
             System.out.println("Remainder is " + x + " , " +  y + " is: " + (x%y));
            default:
            System.out.println("Invalid operation selected.");
        
    }
      System.out.println("Thank you....");
    
}

}