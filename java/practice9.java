// import java.util.Scanner;

// class Library {
//     Scanner input = new Scanner(System.in); 
//     int n = 0; // Counter for added books
//     int is = 0; // Counter for issued books
//     String[] add; // Array for storing book names
//     String[] issue; // Array for storing issued books

//     // Constructor to initialize arrays with a specific size
//     Library(int size) {
//         add = new String[size];
//         issue = new String[size];
//     }

//     // Method to add books
//     void addBooks() {
//         if (n < add.length) {
//             System.out.println("ENTER BOOK NAME YOU WANT TO ADD: ");    
//             add[n] = input.nextLine();
//             System.out.println("BOOK ADDED: " + add[n]);
//             n++;
//         } else {
//             System.out.println("LIBRARY IS FULL. CANNOT ADD MORE BOOKS.");
//         }
//     }

//     // Method to issue books
//     void issued() {
//         if (is < issue.length) {
//             System.out.println("ENTER BOOK NAME YOU WANT TO ISSUE: ");    
//             issue[is] = input.nextLine();
//             System.out.println("BOOK ISSUED: " + issue[is]);
//             is++;
//         } else {
//             System.out.println("NO MORE BOOKS CAN BE ISSUED.");
//         }
//     }

//     // Method to show available books
//     void availableBooks() {
//         if (n == 0) {
//             System.out.println("NO BOOKS AVAILABLE IN THE LIBRARY.");
//         } else {
//             System.out.println("AVAILABLE BOOKS:");
//             for (int i = 0; i < n; i++) {
//                 System.out.println(add[i]);    
//             }
//         }
//     }
// }

// class practice9 {
//     public static void main(String[] args) {
//         Library lib = new Library(5); // Initialize the library with a size of 5

//         // Add books
//         lib.addBooks();
//         lib.addBooks();

//         // Issue a book
//         lib.issued();

//         // Show available books
//         lib.availableBooks();
//     }
// }


// p(1)



// class Circle{
//     public int radius;
//     Circle(){
//         System.out.println("I am non param of circle");
//     }
//     Circle(int r){
//         System.out.println("I am circle parameterized constructor");
//         this.radius = r;
//     }

//     public double area(){
//         return Math.PI*this.radius*this.radius;
//     }
// }

// class Cylinder1 extends Circle{
//     public int height;
//     Cylinder1(int r, int h){
//         super(r);
//         System.out.println("I am cylinder1 parameterized constructor");
//         this.height = h;
//     }
//     public double volume(){
//         return Math.PI*this.radius*this.radius*this.height;
//     }
// }
// public class practice9 {
//     public static void main(String[] args) {
//         // Problem 1
//         Circle objC = new Circle(12);
//         // Cylinder1 obj = new Cylinder1(12, 4);
//     }
// }
 

//p(2)
// class Rectangle {
//     int height, width;/

//     Rectangle(int h, int w) {
//         this.height = h;
//         this.width = w;
//     }

//     int getArea() {
//         return height * width;
//     }

//     int getWidth(int area, int len) {
//         if (len == 0) {
//             throw new ArithmeticException("Length cannot be zero");
//         }
//         return area / len;
//     }
// }

// class Cubio extends Rectangle {
//     int vol, edge;

//     Cubio(int edge, int height, int width) {
//         super(height, width); // Pass height and width to Rectangle constructor
//         this.edge = edge;
//     }

//     void cubioVolume() {
//         this.vol = edge * edge * edge; // Volume of a cube
//         System.out.println("The volume of the cube: " + this.vol);
//     }
// }

// class practice9 {
//     public static void main(String[] args) {
//         // Create a Cubio object and initialize Rectangle values through the Cubio constructor
//         Cubio cub = new Cubio(4, 5, 6);

//         // Call methods
//         cub.cubioVolume(); // Cubio-specific method
//         System.out.println("The area is: " + cub.getArea()); // Rectangle method
//         System.out.println("Width of rectangle (using area and length): " + cub.getWidth(30, 5)); // Rectangle method
//     }
// }

//p(3)
// class person{
//     int age;
//     String name;

//     person(int age,String name){
//         this.age = age;
//         this.name = name;
//     }

//    void getdetails(){
//     System.out.println("NAME: " + name);
//     System.out.println("AGE: " + age);
  
//    }
// }

// class employee extends person{
//     long salary;
// employee(long salary){
// super(22,"saad");
// this.salary = salary;

// }
// }

// class practice9 {
//     public static void main(String [] args){
//         employee p = new employee(25000);
//         p.getdetails();
//         System.out.println("SALARY: " + p.salary);
//     }
// }
