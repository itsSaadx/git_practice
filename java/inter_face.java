//interface is a collection of methode that must be overridde in anothor class
// the variables of interface are (public static finalt by default)
// we can implement multiple interface into one class
// you can create refrence but not object of the inerface


// import java.util.Scanner;
// interface client{
//      void input(); 
//      void output();
// }

// class emp implements client{
// String name;
// int id;
// public void input(){
//     Scanner s  = new Scanner(System.in);   
//     System.out.println("ENTER THE NAME AND ID ");
//     name = s.nextLine();
//     id = s.nextInt();
// }

// public void output(){
//     System.out.println("NAME : " + name);
//     System.out.println("ID : " + id);
// }
// }

// class inter_face{
//     public static void main(String [] args){
//     emp e = new emp();
//     e.input();
//     e.output();
//     }
// }




// Interface with constants
// interface DatabaseConfig {
//     String DB_URL = "jdbc:mysql://localhost:3306/mydb";
//     String USERNAME = "root";
//     String PASSWORD = "password";
// }

// // Class implementing the interface
// class DatabaseConnection implements DatabaseConfig {
//     void connect() {
//         System.out.println("Connecting to Database...");
//         System.out.println("Database URL: " + DB_URL); // Direct access since the class implements the interface
//         System.out.println("Username: " + USERNAME);
//         // Note: PASSWORD is usually not printed for security reasons
//         System.out.println("Connection established!");
//     }
// }

// // Main class
// public class inter_face {
//     public static void main(String[] args) {
//         DatabaseConnection dbConnection = new DatabaseConnection();
//         dbConnection.connect();
//     }
// }

// DEFAULT METHODES IN INTERFACE
// to update the interface we can use default method  


// interface MyCamera{
//     void takeSnap();
//     void recordVideo();
//     private void greet(){
//         System.out.println("Good Morning"); 
//     }
//     default void record4KVideo(){ 
//         greet(); // we can't acess directly private mehtode but indirectly we can acess just like this.
//         System.out.println("Recording in 4k...");
//     }
// }

// interface MyWifi{
//     String[] getNetworks();
//     void connectToNetwork(String network);
// }

// class MyCellPhone{
//     void callNumber(int phoneNumber){
//         System.out.println("Calling "+ phoneNumber);
//     }
//     void pickCall(){
//         System.out.println("Connecting... ");
//     }

// }

// class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
//     public void takeSnap(){
//         System.out.println("Taking snap");
//     }
//     public void recordVideo(){
//         System.out.println("Taking snap");
//     }
// //    public void record4KVideo(){
// //        System.out.println("Taking snap and recoding in 4k");
// //    }
//     public String[] getNetworks(){
//         System.out.println("Getting List of Networks");
//         String[] networkList = {"Harry", "Prashanth", "Anjali5G"};
//         return networkList;
//     }
//     public void connectToNetwork(String network){
//         System.out.println("Connecting to " + network);
//     }
// }
// public class inter_face {
//     public static void main(String[] args) {
//         MySmartPhone ms = new MySmartPhone();
//         ms.record4KVideo();
//         // ms.greet(); --> Throws an error!
//         String[] ar = ms.getNetworks();
//         for (String i: ar) {
//             System.out.println(i);
//         }
//     }
// }


// INHERITANCE IN INTERFACE

// interface sampleInterface{
//     void meth1();
//     void meth2();
// }
// interface childSampleInterface extends sampleInterface{
//     void meth3();
//     void meth4();
// }
// class MySampleClass implements childSampleInterface{
//     public void meth1(){
//         System.out.println("meth1");
//     }
//     public void meth2(){
//         System.out.println("meth2");
//     }
//     public void meth3(){
//         System.out.println("meth3");
//     }
//     public void meth4(){
//         System.out.println("meth4");
//     }
// }
// public class inter_face {
//     public static void main(String[] args) {
//         MySampleClass obj = new MySampleClass();
//         obj.meth1();
//         obj.meth2();
//         obj.meth3();
//     }
// }

//polymorphism in interface 

// interface MyCamera2{
//     void takeSnap();
//     void recordVideo();
//     private void greet(){
//         System.out.println("Good Morning");
//     }
//     default void record4KVideo(){
//         greet();
//         System.out.println("Recording in 4k...");
//     }
// }

// interface MyWifi2{
//     String[] getNetworks();
//     void connectToNetwork(String network);
// }

// class MyCellPhone2{
//     void callNumber(int phoneNumber){
//         System.out.println("Calling "+ phoneNumber);
//     }
//     void pickCall(){
//         System.out.println("Connecting... ");
//     }

// }

// class MySmartPhone2 extends MyCellPhone2 implements MyWifi2, MyCamera2{
//     public void takeSnap(){
//         System.out.println("Taking snap");
//     }
//     public void recordVideo(){
//         System.out.println("Taking snap");
//     }
//     //    public void record4KVideo(){
// //        System.out.println("Taking snap and recoding in 4k");
// //    }
//     public String[] getNetworks(){
//         System.out.println("Getting List of Networks");
//         String[] networkList = {"Harry", "Prashanth", "Anjali5G"};
//         return networkList;
//     }
//     public void connectToNetwork(String network){
//         System.out.println("Connecting to " + network);
//     }
//     public void sampleMeth(){
//         System.out.println("meth");
//     }
// }
// public class inter_face {
//     public static void main(String[] args) {
//         MyCamera2 cam1 = new MySmartPhone2(); // This is a smartphone but, use it as a camera
//         // cam1.getNetworks(); --> Not allowed
//         // cam1.sampleMeth(); --> Not allowed

//         cam1.record4KVideo();

//         MySmartPhone2 s = new MySmartPhone2(); // if you create refrence of perticular class you access methode of perticular class
//         gps g  = new 
//         s.sampleMeth();
//         s.recordVideo();
//         s.getNetworks();
//         s.callNumber(7979);
//     }
// }
