package PS002;10
import java.util.Scanner;

public class NextMultiple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Handle the input and calculate the next multiple of 100
        if (number <= 0) {
            System.out.println(-1);
        } else {
            int nextMultiple = ((number / 100) + 1) * 100;
            System.out.println("Next multiple of 100: " + nextMultiple);
        }

        sc.close();
}
}
    

