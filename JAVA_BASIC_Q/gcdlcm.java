
import java.util.Scanner;


public class  gcdlcm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        s.close();

        int gcd = 1;
        int min = Math.min(n1, n2);  // We only need to check up to the smaller number

        for (int i = min; i >= 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
                break;  // Exit loop once the greatest common divisor is found
            }
        }

        System.out.println("GCD is: " + gcd);

        // Optional: LCM calculation
        int lcm = (n1 * n2) / gcd;
        System.out.println("LCM is: " + lcm);
    }
}

//_____________________________________________________pepcoding solution_____________________________________________________________

// import java.util.Scanner;
// class gcdlcm{
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);        
//         System.out.println("enter the number");
//         int n1 = s.nextInt();
//         int n2 = s.nextInt();
//       int on1=n1;
//       int on2=n2;
//         while (n1%n2!=0) {
//         int rem = n1%n2;
//         n1=n2;
//         n2 = rem;
//         }

//       int  gcd=n2;
//         System.out.println(gcd);

//         // lcm 

//         int lcm=(on1*on2)/gcd;
//         System.out.println(lcm);

//     }
// }