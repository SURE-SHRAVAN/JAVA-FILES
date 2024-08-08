import java.util.*;
public class method {
    int Rectanglearea(int l ,int b){
        return (l*b);
    }
    int Rectangleperi(int a, int c ){
        return 2*(a+c);
    }
    int Squarearea(int a ){
        return a*a;
    }
    int Sqaureperi(int a){
        return 4*a;
    }
    int Triangleperi(int a,int b , int c){
        return (a+b+c);
    }
    float Trianglearea(int a, int b ){
        return 1/2*(a*b);
        
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the shape you wish to calculate: ");
        String ans = s.nextLine();
        if( ans.equals("square")){
            System.out.println("Enter area or perimeter: ");
            String val = s.nextLine();
            if( val.equals("area")){
                System.out.println("Enter the side of the square");
                int side = s.nextInt();
                method R = new method();
                int as = R.Squarearea(side);
                System.out.println("Area of the square is: " + as);
            }
            else{
                System.out.println("Enter the side of the square");
                int side = s.nextInt();
                method R = new method();
                int as = R.Sqaureperi(side);
                System.out.println("Perimeter of the square is: " + as);

            }
         }
        else if(ans.equals("rectangle")) {
            System.out.println("Enter area or perimeter: ");
            String val = s.nextLine();
            if( val.equals("area")){
                System.out.println("Enter the length and breadth of the rectangle");
                int l = s.nextInt();
                int b = s.nextInt();
                method R = new method();
                int as = R.Rectanglearea(l,b);
                System.out.println("Area of the rectangle is: " + as);
            }
            else{
                System.out.println("Enter the side of the square");
                int l = s.nextInt();
                int b = s.nextInt();
                method R = new method();
                int as = R.Rectangleperi(l,b);
                System.out.println("Perimeter of the rectangle is: " + as);

            }

        }
        else if(ans.equals("triangle")){
            System.out.println("Enter area or perimeter: ");
            String val = s.nextLine();
            if( val.equals("area")){
                System.out.println("Enter the base and height of the triangle");
                int l = s.nextInt();
                int b = s.nextInt();
                method R = new method();
                float as = R.Trianglearea(l,b);
                System.out.println("Area of the triangle is: " + as);
            }
            else{
                System.out.println("Enter the sides of the Triangle");
                int l = s.nextInt();
                int b = s.nextInt();
                int c = s.nextInt();
                method R = new method();
                int as = R.Triangleperi(l,b,c);
                System.out.println("Perimeter of the Triangle is: " + as);

            }

        }
        else{
            System.out.println("Worng shape entered.");
        }
        
        
    }
    
}
