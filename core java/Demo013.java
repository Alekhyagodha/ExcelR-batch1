import java.util.Scanner;
public class Demo013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height: ");
        double h = scanner.nextDouble();
        System.out.println("Enter base: ");
        double b = scanner.nextDouble();
        scanner.close();
        double area = 0.5*h*b; 
        System.out.println("Area of triangle is : "+area);

}

}
    

