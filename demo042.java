import java.util.Scanner;

public class demo042 {
        public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a lowercase character: ");
        char ch = scanner.next().charAt(0); 

        
        if (Character.isLowerCase(ch)) {
            
            char upperCh = Character.toUpperCase(ch);
            System.out.println("The uppercase version is: " + upperCh);
        } else {
            System.out.println("Please enter a lowercase letter.");
        }

        
        scanner.close();
    }
}



