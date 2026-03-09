
import java.util.Scanner;

public class benjaminbulb {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
System.out.println("enter the number");
int num = s.nextInt();
        for(int i=1; i*i<=num ; i++){
            System.out.println(i*i);
        }
        s.close();
    }
}