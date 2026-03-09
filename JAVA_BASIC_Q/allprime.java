
import java.util.Scanner;

class allprime{
    
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the number1");
        int b = s.nextInt();
        System.out.println("enter the number2");
        int e = s.nextInt();
        
        for(int start=b; start<=e ; start++){
            if(start<=1) continue;
            boolean isp = true;
        for(int j =2 ; j*j<=start ; j++){
           if(start%j==0){
            isp = false;                                               
            break;
           }
        }
        
        if(isp){
          System.out.println(start);
        }
        }

       s.close();
    }
}
