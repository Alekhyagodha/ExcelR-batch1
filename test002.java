import java.util.Scanner;
public class test002 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String result;
    
            while (true) {
                System.out.println("Enter reply:");
                result = sc.next();
                sc.close();
    
                if (result.equals("yes") ) {
                    System.out.println("Happy Sankranthi ");
                    break;
                }
                else{
                    return;
                }
                }
            }
    
}