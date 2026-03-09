import java.util.Scanner;
// p square + b square =  h square; // first we find large number out of 3 number that will be h;
public class pythagorus {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the a");
        int a = s.nextInt();
         System.out.println("enter the b");
        int b = s.nextInt(); 
        System.out.println("enter the c");
        int c = s.nextInt();

        int max = a;
        if(b>=max){
            max = b;
        }
        if(c>=max){
            max = c;
        }

       if(max==a){
    boolean flag = ((b*b + c*c ) == (a*a));
    System.out.println(flag);
       }
       else if(max==b){
       boolean flag = ((a*a + c*c) == (b*b));
    System.out.println(flag);

       }
       else{
        boolean flag = ((a*a + b*b) == (c*c));
    System.out.println(flag);

       }
    }
}
