import java.util.Scanner;

// it is a class named scanner that used to read data from user . data any kind of type int , float , string etc;

class input{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);                       // (system.in) specifies we have to take input form the keyboard;
        System.out.print("ENTER YOUR 1ST NUMBER :");
         int num1 = sc.nextInt();
        System.out.print("YOUR 1ST NUMBER IS :");
        System.out.println(num1);
         System.out.print("ENTER YOUR 1ST NUMBER :");
         float num2 = sc.nextFloat();
        System.out.print("YOUR 2nd NUMBER IS :");
        System.out.print(num2);

    // ------STRING INPUT------

    // System.out.print("enter your word :");
    // String st = sc.next();
    // System.out.print("your word is :");
    // System.out.print(st);

    // System.out.print("enter your line :");
    // String stl = sc.nextLine();
    // System.out.print("your line is :");
    // System.out.print(stl);
    
    //___________boolean______________                              // boolean checks our data is int float etc or not 
    
    // System.out.print("enter your number to check");
    // boolean b1 = sc.hasNextInt();
    // System.out.print(b1);
    
    }
}