import java.util.Scanner;

// public class primefactor {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         System.out.println("Enter number:");
//         int num = s.nextInt();
//         int divider = 2;

//         while (num != 1) {
//             if (num % divider == 0) {
//                 System.out.println(divider);  // ✅ Only print when divider divides
//                 num = num / divider;          // update number
//             } else {
//                 divider++;  // try next number
//             }
//         }
//     }
// }



//________________________________pepcoding solution_________________________________

public class primefactor {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int div=2 ; div*div<=n; div++){ // we are checking till square root of n. if not divide we will print n as it is.   
            while (n%div==0) {
                n = n/div;
                System.out.print(div + " ");
            }
        }

        if(n!=1){
            System.out.println(n);
        }
    }
}