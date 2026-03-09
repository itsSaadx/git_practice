class recursion{
    
      
    static void fun2(int n){
        if(n>0){
            fun2(n-1);
            System.out.println(n);
        }
}


public static void main(String[] args){
        int n = 4;
        fun2(n);
}
}



// public class recursion {
//     // factorial(0) = 1
//     // factorial(n) = n * n-1 *....1
//     // factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
//     // factorial(n) = n * factorial(n-1)

//     static int factorial(int n){
//         if(n==0 || n==1){
//             return 1;
//         }
//         else{
//             return n * factorial(n-1);
//         }
//     }
//     static int factorial_iterative(int n){
//         if(n==0 || n==1){
//             return 1;
//         }
//         else{
//             int product = 1;
//             for (int i=1;i<=n;i++){ // 1 to n
//                 product *= i;
               
//             }
//             return product;
//         }
//     }
//     public static void main(String[] args) {
//         int x = 3;
//         int n = 4;
//         System.out.println("x is: " + x);
//         System.out.println("n is: " + n);
        
//         System.out.println("The value of factorial x is: " + factorial(x));
//         System.out.println("The value of factorial x is: " + factorial_iterative(n));
//     }
// }

// not using recursion
// public class recursion {
   
//     // Method to print the Fibonacci series up to n terms
//     static void fibonacci(int n) {
//         int a = 0, b = 1, c;
//         System.out.println("Fibonacci series:");
//         for (int i = 1; i <= n; i++) {
//             System.out.print(a + " " );
//             c = a + b; // Calculate the next term
//             a = b; // Update a to the next term
//             b = c; // Update b to the next term
//         }
//         System.out.println(); // New line after series
//     }

//     public static void main(String[] args) {
//         int n = 10;
//         System.out.println("The Fibonacci series for " + n + " terms:");
//         fibonacci(n); // Call the method to print the Fibonacci series
//     }
// }


// using recursion
// public class recursion {
//     // recursion means funtion call itself again and again continueously
//     // Recursive method to compute the nth Fibonacci number
//     static int fibonacci(int n) {
//         if (n <= 1) {
//             return n; // Base case: return n if it's 0 or 1
//         }
//         return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
//     }

//     // Method to print the Fibonacci series up to n terms
//     static void printFibonacciSeries(int terms) {
//         System.out.println("Fibonacci series:");
//         for (int i = 0; i < terms; i++) {
//             System.out.print(fibonacci(i) + " ");  
//         }
//         System.out.println(); // New line after series
//     }

//     public static void main(String[] args) {
//         int n = 10; // Number of terms
//         System.out.println("The Fibonacci series for " + n + " terms:");
//         printFibonacciSeries(n); // Call the method to print the series
//     }
// }
