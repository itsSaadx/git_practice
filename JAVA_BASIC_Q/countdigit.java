
// import java.util.Scanner;

// public class countdigit {
// public static void main(String[] args) {
//     Scanner s = new Scanner(System.in);
//     long count=0;
//     long rem;
//     System.out.println("enter the number");
//     long num = s.nextLong();
//     while (num!=0) {    
//    rem = num%10;
//     count++;
//     num = num/10;  
//     }
//     System.out.println(count);     
//     }
   
// }


//___________________________________using String__________________________
import java.util.Scanner;

public class countdigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String number;
        
        // Keep asking for input until the user enters only digits
        while (true) {
            System.out.print("Enter a number: ");
            number = scanner.next(); // Read input as a string
            
            // Check if input contains only digits
            if (number.matches("\\d+")) {
                break; // Valid number, exit loop
            } else {
                System.out.println("Invalid input! Please enter numbers only.");
            }
        }
        
        scanner.close();
        
        // Count the number of digits
        int length = number.length();

        // Display the result
        System.out.println("The number of digits in " + number + " is: " + length);
    }
}
