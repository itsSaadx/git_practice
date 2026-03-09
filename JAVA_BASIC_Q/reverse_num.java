import java.util.Scanner;

public class reverse_num { // reverse a number
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int revnum=0;
        System.out.println("enter the number");
        int number = s.nextInt();
// 569
        while (number!=0){
          int last = number%10;
          
            number = number/10; 
        }
        System.out.println("reverse number is: " + revnum);

    }
}
