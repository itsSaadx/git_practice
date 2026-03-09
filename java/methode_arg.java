// class methode_arg {
//    //it calculate the sum of the arguments that are passed in the add method and (... args) takes it in the form of array
//    //we can not need to creat multiple function to perform calculation (we can done it by using single static int add(int ...arr)) 
//     static int add(int ...arr){ // if you add one parameter in this function like this(int x,...arr) then you have to passed atleast one argument in this add method; 
//         int result = 0;
//         for (int a : arr){
//             result = result + a;
//         }
//         return result;
// }

// public static void main(String[] args){
//     System.out.println(add(1,2));
//     System.out.println(add(2,3,4));
//     System.out.println(add(4,5,6));
// }
// }

class methode_arg{
static int add(int a,int b){
      a = 44;
      b = 44;
    return a+b;
}

public static void main(String [] args){
    
    System.out.println(add(1,2)); // in this case we are passing argument it does not copy in the (add function) "it can be change in the add funtion" 
   
}
}


