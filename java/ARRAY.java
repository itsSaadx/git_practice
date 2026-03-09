//import java.util.Scanner;

// class ARRAY{
//     public static void main(String[] args){
//         int [] marks; // declaration of array/
//         marks = new int[3]; // memory allocation of array
//         marks[0] = 11;
//         marks[1] = 33;
//         marks[2] = 22;
//         System.out.println(marks[2]);

// // anothore way to declare array

// int [] hello = {1,2,3,4,5};
//  System.out.println(hello[2]);

// }
// }


// import java.util.Scanner;

// public class ARRAY {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int[] array = new int[5]; 

//         System.out.println("Enter 5 integers:");
//         for (int i = 0; i < array.length; i++) {
//             System.out.print("Enter element " + (i + 1) + ": ");
//             array[i] = scanner.nextInt();
//         }

//         System.out.println("You entered:");
        
//         for (int i = 0; i < array.length; i++) {
//             System.out.println("Element " + (i + 1) + ": " + array[i]);
//         }

//         scanner.close();
//     }
// }

// 2d array 




public class ARRAY {
    public static void main(String[] args) {
        int [] marks; // A 1-D Array
        int [][] flats; // A 2-D Array
        flats = new int [2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        // Displaying the 2-D Array (for loop)
        System.out.println("Printing a 2-D array using for loop");
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

    }
}
