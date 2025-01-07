import java.util.Scanner;
public class demo012 {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        
        scanner.close();

        double area = Math.PI * Math.pow(radius, 2);

    
        double circumference = 2 * Math.PI * radius;

        // Print the results
        System.out.println("The area of the circle is: " + area);
        System.out.println("The circumference of the circle is: " + circumference);
    }
}

    

