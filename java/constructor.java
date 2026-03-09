// class defult {
//     defult(){
//         System.out.println("This is the default constructor of defult class.");
//     }

// }
// public class constructor {
//     public static void main(String[] args) {
//         defult obj1 = new defult();

//     }
// }


// class peramitarized {
//     peramitarized(String s, int b){

//         System.out.println("This is the " +b+ "th video of "+ " "+ s);
//     }

// }
// public class constructor{
//     public static void main(String[] args) {
//        peramitarized obj1 = new peramitarized ("CodeWithHarry Java Playlist",42);

//     }
// }


// class Employee {
// // First constructor
//     Employee(String s, int i){
//         System.out.println("The name of the first employee is : " + s);
//         System.out.println("The id of the first employee is : " + i);
//     }
// //    Constructor overloaded
//     Employee(String s, int i, int salary){
//         System.out.println("The name of the second employee is : " + s);
//         System.out.println("The id of the second employee is : " + i);
//         System.out.println("The salary of second employee is : " + salary);
//     }

// }
// public class constructor {
//     public static void main(String[] args) {
//         Employee shubham = new Employee("Shubham",1);
//         Employee harry = new Employee("Harry",2,70000);



//     }
// }




// class MyMainEmployee {
//     private int id;
//     private String name;
//     private long salary;

//     // Default constructor
//     public MyMainEmployee() {
//         id = 0;
//         name = "Your-Name-Here";
//     }

//     // Constructor with name and id
//     public MyMainEmployee(String myName, int myId) {
//         id = myId;
//         name = myName;
//     }

//     // Constructor with only name
//     public MyMainEmployee(String myName) {
//         id = 1;
//         name = myName;
//     }

//     // Constructor with salary
//     public MyMainEmployee(long mySalary) {
//         id = 0; // Default id
//         name = "Unknown"; // Default name
//         salary = mySalary;
//     }

//     // Getters and setters
//     public String getName() {
//         return name;
//     }

//     public void setName(String n) {
//         this.name = n;
//     }

//     public void setId(int i) {
//         this.id = i;
//     }

//     public int getId() {
//         return id;
//     }

//     public long getSalary() {
//         return salary;
//     }
// }

// public class Constructor {
//     public static void main(String[] args) {
//         // Object using name and id constructor
//         MyMainEmployee harry1 = new MyMainEmployee("ProgrammingWithHarry", 12);

//         // Object using salary constructor
//         MyMainEmployee harry2 = new MyMainEmployee(10000);

//         // Object using default constructor
//         MyMainEmployee harry3 = new MyMainEmployee();

//         System.out.println("Using name and id constructor:");
//         System.out.println("ID: " + harry1.getId());
//         System.out.println("Name: " + harry1.getName());
//         System.out.println("Salary: " + harry1.getSalary());

//         System.out.println("\nUsing salary constructor:");
//         System.out.println("ID: " + harry2.getId());
//         System.out.println("Name: " + harry2.getName());
//         System.out.println("Salary: " + harry2.getSalary());

//         System.out.println("\nUsing default constructor:");
//         System.out.println("ID: " + harry3.getId());
//         System.out.println("Name: " + harry3.getName());
//         System.out.println("Salary: " + harry3.getSalary());
//     }
// }

