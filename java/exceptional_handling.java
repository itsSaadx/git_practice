// import java.util.Scanner;
// class exceptional_handling{
//     public static void main(String [] args){
//     // SYNTAX ERROR IS 
//     // int a = 0 // NO SEMICOLON
//     // b = 5; // b not declare

//     //LOGICAL ERRORS
//     // WE ARE PRINTING PRIME NUMBER BETWEEN 1 TO 10
//     // prime number means which are devided itself or 1
//     // in the output we will display 9 that are not prime so we write logic of print odd number and expect 
//     //it to print prime number this is logicl error 

   
// //     for(int i=1; i<5; i++){
// //     System.out.println(2*i+1);
// // }
// //     }
// // }

//     //RUNTIME ERROR

//     int k;
//     Scanner sc = new Scanner(System.in);
//     k = sc.nextInt();
//     System.out.println("Integer part of 1000 divided by k is" + 1000/k);
//     }
// }
    

//_____________________________________________________
// ( TRY AND CATCHE BLOCK PROGRAM )

// class exceptional_handling{
//     public static void main(String[] args){
//         int a = 5000;
//         int b = 0; 
//         try{    //(WE USE IT BECAUSE IF USER WANTS TO DIVIDE A NUMBER TO THE 0 IT THROW ERROR EXCEPTION AND OUR PROGRAM ARE CRASH TO SAFE OUT JAVA PROGRAM WE USE TRY AND CATCH BLOCKS)
    
//             int c = a/b;
//         }
//         catch(Exception e){
//         System.out.println("WE FAILED TO DEVIDE REASON: ");
//         System.out.println(e);
//         }
 
//         System.out.println("end of the program");

//     }
// }

//_______________________________________________-
// (specific exception program) 

// import java.util.Scanner;

//  class exceptional_handling{
     
//     public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//         int [] marks = new int [3];
//         marks[0] = 7;
//         marks[1] = 56;
//         marks[2] = 4;
//         System.out.println("ENTER THE ARRAY INDEX");
//         int ind = sc.nextInt();

//         System.out.println("ENTER THE NUMBER YOU WANT TO DIVIDE THE VALUE WITH");
//         int number = sc.nextInt();

//         try{
//         System.out.println("THE VALUE AT ARRAY INDEX ENTERD IS: " + marks[ind]);
//         System.out.println("THE VALUE OF ARRAY_VALUE/NUMBER IS: " + marks[ind]/number);
//         }

//         catch (ArithmeticException a){
//             System.out.println("ARITHMATIC EXCEPTION OCCURED");
//             System.out.println(a);
//         }

//         catch (ArrayIndexOutOfBoundsException ar){
//              System.out.println("ArrayIndexOutOfBounds Exception OCCURED");
//              System.out.println(ar);
//         }

//         catch (Exception e){
//             System.out.println("SOME OTHER EXCEPTION OCCURED");
//             System.out.println(e);
//         }
//     }
// }

//_____________________________________________________________________________________-
// (NESTED TRY CATCH BLOCK)

// import java.util.Scanner;
// class exceptional_handling{
//     public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//         int [] marks = new int [3];
//         marks[0] = 7;
//         marks[1] = 56;
//         marks[2] = 4;
    
//    System.out.println("ENTER THE VALUE OF INDEX");
//    int ind = sc.nextInt();
//    try{
//    System.out.println("WELCOME TO VIDEO NO 82");
//     try{
//      System.out.println(marks[ind]);
//     }
//    catch(ArrayIndexOutOfBoundsException e){
//     System.out.println("SORRY THIS INDEX DOES NOT EXIST");
//     System.out.println("EXCEPTION IN LEVEL 2");
//    }
// }

// catch (Exception e){
//     System.out.println("EXCEPTION IN LEVEL 1");
// }
// }
// }

//______________________________________________________________________________________
// (EXCEPTION CLASS PROGRAM)

// import java.util.Scanner;

// class myexception extends Exception{
//     @Override
//     public String toString(){
//         return "I am toString()";
//     }    
//     @Override
//     public String getMessage(){
//         return "I am getMessage()";
//     }
// }

// public class exceptional_handling{
//     public static void main(String[] args){
// int a;
// Scanner sc = new Scanner(System.in);
// a = sc.nextInt();
// if(a<9){
//     try{
//         throw new myexception();                                    // this our coustome exception
//         // throw new ArithmeticException("THIS IS AN EXCEPTION");
//     }

//     catch(Exception e){
//   System.out.println(e.getMessage());
//   System.out.println(e.toString());
//   e.printStackTrace();// you  can find errore 
//  System.out.println("FINISHED");
//     }
// }
//     }
// }

//_______________(THROW AND THROWS KEYWORD)__________________
//throws keyword tell the person .exception may be occure in the perticular mthd

// class negativeradiusexception extends Exception{
// public String getMessage(){
//     return "negative redius invalid";
// }

// public String toString(){
//     return "NEGATIVE REDIUS ERROR";
// }
// }

// public class exceptional_handling{


// public static double area(int r)throws negativeradiusexception{
//     if(r<0){
//     throw new negativeradiusexception();
// }
// double result = Math.PI*r*r;
// return result;
// }

//  public static int divide(int a, int b)throws ArithmeticException{
//         int result = a/b;
//         return result;
//     }

//     public static void main(String[] args){
//         try{
//          int c = divide(6,0);
//         System.out.println("divison: " + c);

//         double ar = area(2);  
//         System.out.println("THE RADIUS IS : " + ar);
           
//         }
//         catch(Exception e){
//             System.out.println("EXCEPTION OCCURED");
//             System.out.println(e.getMessage());
//             System.out.println(e.toString());
//         }
// }
// }

//_______________(FINALLY BLOCK >> IT ALWAYS EXECUTES WHTHER EXCEPTION CAME OR NOT)__________________

// class exceptional_handling{
//     public static int greet(){
//     try{
//         int a = 5;
//         int b = 2;
//         int c = a/b;
//         return c;
//     }

//     catch(Exception e){
// System.out.println(e);
//     }

//     finally{
// System.out.println("programs end"); 
//     }
//     return 0;
// }

//  public static void main(String[] args){
//         int a=5,b=6;
//         int k = greet();
//         System.out.println(k);
//         while(true){
//             try{
//                System.out.println(a/b);               
//             }
            
//             catch(Exception e){
//             System.out.println(e);
//             break;
//             }
           
//            finally{
//             System.out.println("i am finally for value of b = " + b);
//            }
           
//            b--;

//         }
//   }
// }

// (PRACTICE PROGRAM)
// import java.util.Scanner;

// class ArrayIndexException extends Exception{
// public String getMessage(){
// return "INVALID INDEX";
// }

// public String toString(){
//     return "ERRORE!";
// }
// }

// class exceptional_handling{
// public static void printArrayIndex() throws ArrayIndexException{
// Scanner sc = new Scanner(System.in);
// int [] arr = new int [4];
// arr[0] = 44;
// arr[1] = 43;
// arr[2] = 50;
// arr[3] = 66;

// while(true){
//     System.out.println("enter the index");
//     int index = sc.nextInt();
//     if(index >= arr.length || index<0){
//         throw new ArrayIndexException();
//     }
//     else if(index<=arr.length || index>0){
// System.out.println("VALUE AT ENTERED INDEX IS:" + arr[index]);
// break;
// }
// else{
//     System.out.println("PLEASE ENTER VALID INDEX");
// }
// }
// sc.close();
// }


// public static void main(String[] args){
//     int i = 1;
//     while(i<=5){
//     try{
//         printArrayIndex();    
//        break;
//     }

//     catch(ArrayIndexException e){
//     System.out.println(e.getMessage());
//     System.out.println(e.toString());
//    i++;
// }
// }

// }
// }