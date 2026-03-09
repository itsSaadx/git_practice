// abstract class Animal{
//   abstract void makesound();
// }

// class dog extends Animal{
//     @Override
//     void makesound(){
//     System.out.println("THIS IS DOG VOICE");
//     }
// }

// class problems{
//     public static void main(String [] args){
//         dog d = new dog();
//         d.makesound();
//     }
// }


// import java.util.HashSet;
// import java.util.Scanner;

// class problems {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);    
//         HashSet<String> name = new HashSet<>();
//         String city_name;
//         int i = 0;

//         while (i < 5) {  // Loop runs 5 times
//             System.out.println("Enter the city name:");
//             city_name = s.nextLine();
//             name.add(city_name);
//             i++;
//         }

//         System.out.println("Unique cities entered: " + name);
//         s.close(); // Closing Scanner to prevent resource leak
//     }
// }


// import java.util.HashSet;
// import java.util.Iterator;
// import java.util.Scanner;

// class problems {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);    
//         HashSet<String> name = new HashSet<>();
//         String city_name;
//         int i = 0;

//         // Taking input
//         while (i < 5) {  // Loop runs 5 times
//             System.out.println("Enter the city name:");
//             city_name = s.nextLine();
//             name.add(city_name);
//             i++;
//         }

//         // Displaying unique city names using while loop
//         System.out.println("\nUnique cities entered:");
//         Iterator<String> iterator = name.iterator();
//         while (iterator.hasNext()) {
//             System.out.println(iterator.next());
//         }

//         s.close(); // Closing Scanner
//     }
// }

// class PrintNumbers1to5 implements Runnable {
//     @Override
//     public void run() {
//         for (int i = 1; i <= 5; i++) {
//             System.out.println("NUMBER (1 to 5): " + i + "thread 1");
//         }
//     }
// }

// class PrintNumbers6to10 implements Runnable {
//     @Override
//     public void run() {
//         Thread.sleep(444s);
//         for (int j = 6; j <= 10; j++) {
//             System.out.println("NUMBER (6 to 10): " + j + "thread 2");
//         }

//     }
// }

// public class problems {
//     public static void main(String[] args) {
//         Thread t1 = new Thread(new PrintNumbers1to5());
//         Thread t2 = new Thread(new PrintNumbers6to10());

//         t1.start();
//         t2.start();
//     }
// }
