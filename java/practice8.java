


// class Cylinder{
//     private int radius;
//     private int height;

//     public Cylinder(int radius, int height) {
//         this.radius = radius;
//         this.height = height;
//     }

//     public int getRadius() {
//         return radius;
//     }

//     public void setRadius(int radius) {
//         this.radius = radius;
//     }

//     public int getHeight() {
//         return height;
//     }

//     public void setHeight(int height) {
//         this.height = height;
//     }
//     public double surfaceArea(){
//         return 2* Math.PI* radius * radius + 2*Math.PI*radius*height;
//     }
//     public double volume(){
//         return Math.PI * radius * radius * height;
//     }


// }

// class Rectangle{
//     private int length;
//     private int breadth;

//     public Rectangle() {
//         this.length = 4;
//         this.breadth = 5;
//     }

//     public Rectangle(int length, int breadth) {
//         this.length = length;
//         this.breadth = breadth;
//     }

//     public int getLength() {
//         return length;
//     }

//     public int getBreadth() {
//         return breadth;
//     }
// }

// public class practice8 {

//     public static void main(String[] args) {
        
//         // // Problem 1
//         // Cylinder myCylinder = new Cylinder(9, 12);
//         // //myCylinder.setHeight(12);
//         // System.out.println(myCylinder.getHeight());
//         // //myCylinder.setRadius(9);
//         // System.out.println(myCylinder.getRadius());
//         // // Problem 2
//         // System.out.println(myCylinder.surfaceArea());
//         // System.out.println(myCylinder.volume());
         


//         // Problem 3
//        Rectangle r = new Rectangle(12, 56);
     
//         System.out.println(r.getLength());
//         System.out.println(r.getBreadth());

//     }
// }


// class BankAccount{
//     String ac_number;
//     String ac_holder;
//     double balance;

//     BankAccount(String ac_number,String ac_holder,double balance){
//         this.ac_number = ac_number;
//         this.ac_holder = ac_holder;
//         this.balance = balance;
//     }

//   double deposit(double ammount){
//     return ammount; 
//     }

//    double withdraw(double ammount){
       
//         return ammount;
//     }

//    void DisplayAccountDetails(){
//     System.out.println("ACCOUNT HOLDER: " + this.ac_holder);
//     System.out.println("ACCOUNT NUMBER: " + this.ac_number);
//     System.out.println("ACCOUNT BALANCE: " + this.balance);
//    }
// }


// class practice8{
//     public static void main(String [] args){
//         BankAccount ba = new BankAccount("443234","saad",5000);
//       double deposit = ba.deposit(2000);
//       System.out.println("DEPOSITE AMMOUNT IS: " + deposit);
      
//        double withdraw= ba.withdraw(1500);
//       System.out.println("WITHDRAWL AMMOUNT IS: " + withdraw);
//         ba.DisplayAccountDetails();
//     }
// }