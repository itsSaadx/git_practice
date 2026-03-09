// import java.util.Scanner;

// 🔢 Definition of a Prime Number:
// A prime number is a number greater than 1 that has exactly two distinct positive divisors:

// 1

// Itself

// 📌 Why is 1 not a prime?
// Let’s check how many distinct divisors 1 has:

// Divisors of 1: only 1

// So it has only one positive divisor — not two.

// ➡️ Therefore, 1 is not prime, because it doesn't meet the definition. 

// ____________ working__________________
/* 
✅ Prime Number Checker – Explanation in Points
Class Declaration:
The program defines a class to hold the main logic.

Main Method:
Acts as the entry point of the program.

User Input:
Uses the Scanner class to take an integer input from the user.

Variable Declaration:
One variable stores the user input, another (count) tracks whether the number is divisible by any other number.

Check for Special Cases:
If the number is 0 or 1, it's marked as not prime because prime numbers start from 2.

Divisibility Check:
A loop runs from 2 to square root of the number.

If the number is divisible by any value in this range, it's not prime.

The loop stops early once a factor is found for better performance.

Result Decision:
If any divisor was found, the number is not prime; otherwise, it is prime.

Output:
The program prints whether the number is prime or not.

✅ Key Concepts Used
Conditional statements (if-else)

Loops and logic optimization (i * i <= number)

Modulus operator for divisibility

Scanner for user input

Prime number definition and logic */

//(it check for single digit)

//_________________________________________________________________

// class PRIMEORNOT {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         int p;
//         System.out.println("Enter the number:");
//         p = s.nextInt();
//         int count = 0;

//         if (p <= 1) {
//             count = 1; // 0 and 1 are not prime numbers
//         } else {
//             for (int i = 2; i * i <= p; i++) {
//                 if (p % i == 0) {
//                     count++;
//                     break;
//                 }
//             }
//         }

//         if (count == 1) {
//             System.out.println("This is not a prime number.");
//         } else {
//             System.out.println("This is a prime number.");
//         }
//     }
// }

//_______________________________________________________ (CHECKING IN THE RANGE )________________________________________________


import java.util.Scanner;
public class primeornot {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int n = scn.nextInt();
                                                  
            int count = 0;
            for (int div = 2; div * div <= n; div++) { // Loop runs till √n                          16 >> 2*2=4;3*3=9;4*4=16
                if (n % div == 0) {
                    count++;
                    break; // Exit early if a divisor is found
                }
            }

            if (count == 0) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }

        scn.close(); // Close the scanner
    }
}