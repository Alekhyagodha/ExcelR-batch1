import java.util.Scanner;
public class Demo012 {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        scanner.close();
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;
        System.out.println("The area of the circle is: " + area);
        
        

    }
}

    

