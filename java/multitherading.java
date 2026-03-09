
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

// public class multitherading {
//     public static void main(String[] args) {
//     MyThread1 t1 = new MyThread1();
//     MyThread2 t2 = new MyThread2();
//     t1.start();
//     t2.start();

//     }
// }



//_________________________________________________________________________________
// Create a class and implement the Runnable interface by using the implements keyword.
// Override the run() method inside the implementer class.
// Create an object of the implementer class in the main() method.
// Instantiate the Thread class and pass the object to the Thread constructor.
// Call start() on the thread. start()will call the run()method.


// class MyThreadRunnable1 implements Runnable{
//     public void run(){
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//         System.out.println("I am a thread 1 not a threat 1");
//     }
// }
// class MyThreadRunnable2 implements Runnable{
//     public void run(){
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//         System.out.println("I am a thread 2 not a threat 2");
//     }
// }
// public class multitherading {
//     public static void main(String[] args) {
//         MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
//         Thread gun1 = new Thread(bullet1);

//         MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
//         Thread gun2 = new Thread(bullet2);

//         gun1.start();
//         gun2.start();
//     }
// }

//______________________________________________________________

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i = 34;
        System.out.println("Thank you");
//        while(true){
//            System.out.println("I am a thread");
//        }
    }
}
public class multitherading {
    public static void main(String[] args) {
    MyThr t1 = new MyThr("Harry");
    MyThr t2 = new MyThr("Ram Candr");
    t1.start();
    t2.start();
    System.out.println("The id of the thread t is " + t1.getId());
    System.out.println("The name of the thread t is " + t1.getName());
    System.out.println("The id of the thread t is " + t2.getId());
    System.out.println("The name of the thread t is " + t2.getName());

    }
}

//_________________________________________________________________________

// class multitherading extends Thread{  
//  public void run(){  
//    System.out.println("I'm thread : "+Thread.currentThread().getName());  
//    System.out.println("I'm thread :"+Thread.currentThread().getPriority());  
  
//   }  
//  public static void main(String args[]){  
//   multitherading t1=new multitherading();  
//   multitherading t2= new multitherading();  
//   t1.setPriority(Thread.MIN_PRIORITY);  // setting priority of t1 thread to MIN_PRIORITY (1)
//   t2.setPriority(Thread.MAX_PRIORITY);  // setting priority of t2 thread to MAX_PRIORITY (10)
//   t1.start();  
//   t2.start();  
   
//  }  
// }   

//____________________________________________________________________

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

// public class multitherading {
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

//_______________________________________________________________________________

// class MyNewThr1 extends Thread{
//     public void run(){
//         int i = 0;
//         while(true){
// //            System.out.println("I am a thread");
//             System.out.println("Thank you: ");
//             try {
//                 Thread.sleep(455);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//             i++;
//         }
//     }
// }

// class MyNewThr2 extends Thread{

//     public void run(){
//         while(true){
// //            System.out.println("I am a thread");
//             System.out.println("My Thank you: ");
//         }
//     }
// }

// public class multitherading {
//     public static void main(String[] args){
//         MyNewThr1 t1 = new MyNewThr1();
//         MyNewThr2 t2 = new MyNewThr2();
//         t1.start();
// //        try{
// //            t1.join();
// //        }
// //        catch(Exception e){
// //            System.out.println(e);
// //        }

//         t2.start();

//     }
// }

