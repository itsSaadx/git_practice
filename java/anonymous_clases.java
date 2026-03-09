// we dont need to declare anothore class and creat its obj if. we are using anonymous_clases
// we declare anymous class in the main methd just like this

// @FunctionalInterface                 //Use @FunctionalInterface only when there is exactly one abstract method.
// interface Animal{
//     void bark1();
// }

// class anonymous_clases{
//     public static void main(String[] args) {
//         Animal Bruno = new Animal() {
//             @Override
//             public void bark() {
//                 System.out.println("Dog barks!");
//             }
//         };
//         Bruno.bark();
//     }
// }


//__________________________________LAMDA EXPRESSION________________________________
// no need to creat extra class if you use this methode

// @FunctionalInterface
// interface LambaExp{
//     void meth1(int a, int b);
// }

// class LambaExpDemo{
//     public static void main(String[] args) {

//         LambaExp obj =(a,b)->{
//             System.out.println("The value of a and b is : "+ a + "," + b);
//         };
//         obj.meth1(5,10);
//     }
// }


// (2p)                            // lamdaexpression only apply on functionalinterface otherwise you can use anonymas clases.
// @FunctionalInterface
// interface LambaExp{
//     void meth1();
// }

// class anonymous_clases{
//     public static void main(String[] args) {

//         LambaExp obj =()->{
//       System.out.println("The value of a and b is");
//     };
//     obj.meth1();
// }

// }

