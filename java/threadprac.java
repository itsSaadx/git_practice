//(p1)
class thr1 extends Thread{
 public void run(){
System.out.println("GOOD MORNING");
}
}

class thr2 extends Thread{
  public void run(){
System.out.println("WELCOME");
}
}

class threadprac{
    public static void main(String[] args){
    thr1 t1 = new thr1();
    thr2 t2 = new thr2();

    t1.start();
    t2.start();
    }  
}

//(p2)

// class thr1 extends Thread{
//     int i = 0;

//  public void run(){
//     while(i<50){
// System.out.println("GOOD MORNING" + i);
// i++;
// }
// }
// }

// class thr2 extends Thread{
//   public void run(){
//     int i = 0;
//     while(i<100){
//     try{
//        Thread.sleep(455);  
//     }

//     catch(Exception e){
//         System.out.print(e);
//     }
// System.out.println("WELCOME" + i);
// i++;
// }
//  }
// }

// class practice11{
//     public static void main(String[] args){
//     thr1 t1 = new thr1();
//     thr2 t2 = new thr2();
    
//     t1.start();
//     t2.start();

//  t1.setPriority(6);
//  t2.setPriority(9);
    
//     }  
// }