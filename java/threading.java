// Multithreading in Java

// What is Thread
// Multithreading in Java is a process of executing multiple threads simultaneously.

// A thread is a lightweight sub-process, the smallest unit of processing. Multiprocessing and multithreading, both are used to achieve multitasking.

// However, we use multithreading than multiprocessing because threads use a shared memory area. They don't allocate separate memory area so saves memory, and context-switching between the threads takes less time than process.

// Java Multithreading is mostly used in games, animation, etc.

// in threading Func1() and Func2() are called inside the main function, but none of the two functions is waiting for the execution of the other function. Both the functions are getting executed concurrently.

// Ways To Create A Thread In Java
// By extending the thread class 
// By implementing a Runnable interface 

// class MyThread extends Thread{
//     @Override
//     public void run(){
//         int i =0;
//         while(i<40000){
//             System.out.println("My Cooking Thread is Running");
//             System.out.println("I am happy!");
//             i++;
//         }
//     }
// }
// public class threading {
//     public static void main(String[] args) {
//     MyThread t1 = new MyThread();
//     t1.start();
//     }
// }



// class MyThread1 extends Thread{
//     @Override
//     public void run(){
//         int i =0;
//         while(i<40000){
//             System.out.println("My Cooking Thread is Running");
//             System.out.println("I am happy!");
//             i++;
//         }
//     }
// }

// class MyThread2 extends Thread{
//     @Override
//     public void run(){
//         int i =0;
//         while(i<40000){
//             System.out.println("Thread 2 for Chatting with her");
//             System.out.println("I am sad!");
//             i++;
//         }
//     }
// }

// public class threading {
//     public static void main(String[] args) {
//     MyThread1 t1 = new MyThread1();
//     MyThread2 t2 = new MyThread2();
//     t1.start();
//     t2.start();

//     }
// }


// IMPLEMENTING THREADING BY USING RUNABLE INTERFACE 

// class MyThreadRunnable1 implements Runnable{
//     public void run(){
//         int i = 0;
//        while(i<5000){
// System.out.println("I am a thread 1 not a threat 1");
// i++;
//        }    
//     }
// }

// class MyThreadRunnable2 implements Runnable{
//      public void run(){
//         int i = 0;
//        while(i<5000){
// System.out.println("I am a thread 2 not a threat 2");
// i++;
//        }
//      }
// }

// public class threading {
//     public static void main(String[] args) {
//         MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
//         Thread gun1 = new Thread(bullet1);

//         MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
//         Thread gun2 = new Thread(bullet2);

//         gun1.start();
//         gun2.start();
//     }
// }


// THREAD CONSTRUCTOR

// class MyThr extends Thread{
//     public MyThr(String name){
//         super(name);
//     }
//     public void run(){
//         int i = 34;
//         System.out.println("Thank you");

//     }
// }
// public class threading {
//     public static void main(String[] args) {
//     MyThr t1 = new MyThr("Harry");
//     MyThr t2 = new MyThr("Ram Candr");
//     t1.start();
//     t2.start();
//     System.out.println("The id of the thread t is " + t1.getId());
//     System.out.println("The name of the thread t is " + t1.getName());
//     System.out.println("The id of the thread t is " + t2.getId());
//     System.out.println("The name of the thread t is " + t2.getName());

//     }
// }


//  SET PRIROTY OF THREAD

// class MyThr1 extends Thread{
//     public MyThr1(String name){
//         super(name);
//     }
//     public void run(){
//         int i = 34;

//         while(true){
// //            System.out.println("I am a thread");
//             System.out.println("Thank you: " + this.getName());
//         }

//     }
// }

// public class threading {
//     public static void main(String[] args) {
//         // Ready Queue: T1 T2 T3 T4 T5
//         MyThr1 t1 = new MyThr1("Harry1");
//         MyThr1 t2 = new MyThr1("Harry2");
//         MyThr1 t3 = new MyThr1("Harry3");
//         MyThr1 t4 = new MyThr1("Harry4");
//         MyThr1 t5 = new MyThr1("Harry5 (most Important)");
//         t5.setPriority(Thread.MAX_PRIORITY);
//         t1.setPriority(Thread.MIN_PRIORITY);
//         t2.setPriority(Thread.MIN_PRIORITY);
//         t3.setPriority(Thread.MIN_PRIORITY);
//         t4.setPriority(Thread.MIN_PRIORITY);
//         t5.setPriority(Thread.MIN_PRIORITY);
        
//         t1.start();
//         t2.start();
//         t3.start();
//         t4.start();
//         t5.start();

//     }
// }


//thread methodes

// class MyNewThr1 extends Thread{
//     public void run(){
//         int i = 0;
//         while(i<100){
//             System.out.println("Thank you: " + i);
//             // try {
//             //     Thread.sleep(455);                       // this methode print stmt after 455 mili secode
//             // } catch (InterruptedException e) {
//             //     e.printStackTrace();
//             // }
//             i++;
//         }
//     }
// }

// class MyNewThr2 extends Thread{

//     public void run(){
//         int i = 0;
//         while(i<50){
//             System.out.println("My Thank you: " + i);
//             i++;
//         }
//     }
// }

// public class threading {
//     public static void main(String[] args){
//         MyNewThr1 t1 = new MyNewThr1();
//         MyNewThr2 t2 = new MyNewThr2();
//         t1.start();
//        try{
//            t1.join();       // join methode is used to start one theread and complete the excution of one thread then start executing anothor thread  
//                         // join methode always used in the try and cathe block due to errore exception                    
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }

//         t2.start();

//     }
// }

