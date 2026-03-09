// class methodes{

//    static int logic(int x , int y ){ // STATIC METHODE CALL ONLY FROM STATIC METHOD OTHERWISE NOT
//    int z;
//             if(x>=y){
//              z = x+y;
//             }
            

//             else{
//             z = x*y;
//             }

//             return z;
            
//         }
//     public static void main(String [] args){
//         // the function is used to avoid written same code multiple times;
//         // if you are in the situation where you have need to return multiple 
//         // times same code :you can use function:
//         int a = 5, b= 5;
//         int a1 = 4, b1 = 7;
//         int sum = logic(a, b);  
//         System.out.println("THE SUM IS: " + sum);

//         if(sum==sum){
//         int multip = logic(a1,b1);
//         System.out.println("THE MULTIPLICATION: " + multip);

//         }
     
//     }
// }

// class methodes{

//     int logic(int x , int y ){ // if we difine the function as none static so we have to create obj of the class to call the methode
//    int z;
//             if(x>=y){
//              z = x+y;
//              System.out.println(x);
//             }
            

//             else{
//             z = x*y;
//             System.out.println(x);

//             }
            

//             return z;
            
//         }
//     public static void main(String [] args){
//         methodes obj = new methodes();
//         int a = 5, b= 5;
//         int a1 = 4, b1 = 7;
//         int sum = obj.logic(a, b);  // in this methd copy of a,b is passed not actual a,b ; if we anything with a,b in the function it can,t reflect in the main methode
//         System.out.println("THE SUM IS: " + sum);

//         if(sum==sum){
//         int multip = obj.logic(a1,b1);
//         System.out.println("THE MULTIPLICATION: " + multip);

//         }
     
//     }
// }

// public class methodes {
   
//       static void change(int a) {
//         a = 98; // This won't change the original value of 'x'
//     }

    
//     static void change2(int[] arr) {
//         arr[0] = 98; // This will change the first element of the array
//     }


//     public static void main(String[] args) {
//         // Case 1: Changing an Integer (Primitive Type)
//         int x = 45;
//         change(x);
//         System.out.println("The value of x after running change is: " + x);

//         // Case 2: Changing an Array (Reference Type)
//         int[] marks = {52, 73, 77, 89, 98, 94};
//         change2(marks);
//         System.out.println("The value of marks[0] after running change2 is: " + marks[0]);

    
//     }
// }

